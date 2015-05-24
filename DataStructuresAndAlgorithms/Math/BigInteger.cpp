/*Filename: BigInteger.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

class BigInteger {
public:
	enum {
		MAX_DIGIT = 430
	}; // 72 digits 應該夠吧, 不夠自己加
	void static add(char*, char*, char*);
	void static twoscom(char x[]); // 取 2's complement

	BigInteger(long x = 0) {
		char tmp[99];
		sprintf(tmp, "%Ld", x);
		setData(tmp);
	}
	BigInteger(char * x) {
		setData(x);
	} // x 是字串
	BigInteger(char * x, int m) {
		for (int k = 0; k <= MAX_DIGIT; k++) {
			d[k] = x[k];
		}
	}
	BigInteger& operator+(BigInteger& y);
	BigInteger& operator-(BigInteger& y);
	friend istream& operator>>(istream&ii, BigInteger&x);
	friend ostream& operator<<(ostream&oo, const BigInteger&x);

private:
	char d[MAX_DIGIT + 1];
	/////////////////////// void inBigInteger(char*);
	void setData(char*); // 原來的 inBigInteger 拆成 setData() 和 operator>>
	//void pBigInteger(char*); // 改為 operator<<

};

BigInteger& BigInteger::operator+(BigInteger& y) {
	BigInteger *ans;
	char tmp[BigInteger::MAX_DIGIT + 1];
	//  cout << "d==" << *this << endl;
	// cout << "y==" << y << endl;
	BigInteger::add(d, y.d, tmp);
	ans = new BigInteger(tmp, 2);
	//cout << "*ans==" << *ans << endl;
	return *ans;
}

ostream& operator<<(ostream& oo, const BigInteger& x) {
	if (x.d[BigInteger::MAX_DIGIT]) { // negative number
		oo << "-"; // 先印負號後就取2's complement 再印出
		BigInteger::twoscom((char*) x.d); // twoscom() 是 static function!
	}
	int k = BigInteger::MAX_DIGIT - 1; //從 x[71] 開始找第一個不是 0 的 x[k]
	while ((k > 0) && (x.d[k] == 0))
		k--; // 別讓 k 變成負的
	for (; k >= 0; k--)
		oo << (int) x.d[k]; // 因是 char, 所以要 cast
	return oo;
}

void BigInteger::add(char x[], char y[], char sum[]) {
	int k, carry, tmp;
	carry = 0; // 一開始個位沒進位, 只要 x[0]+y[0]
	for (k = 0; k < MAX_DIGIT; k++) { // 假設只到 x[71], 多就要改大一點
		tmp = x[k] + y[k] + carry; // 乘該位數, 並加前次之進位
		sum[k] = tmp % 10; // 除以十的餘數留在該位
		carry = tmp / 10; // 商進到下一位
	}
	sum[MAX_DIGIT] = x[MAX_DIGIT] + y[MAX_DIGIT] + carry;
	sum[MAX_DIGIT] %= 2; // sign 偶數為正, 奇數為負, 只留 0 或 1
}

void BigInteger::twoscom(char x[]) // 取 2's complement
//////////////////////////////////////////////////
		{
	int k;
	if (x[MAX_DIGIT])
		x[MAX_DIGIT] = 0; // sign
	else
		x[MAX_DIGIT] = 1;
	for (k = 0; k < MAX_DIGIT; k++)
		x[k] = 9 - x[k]; //先取 1's complement
	x[0]++;
	for (k = 0; k < MAX_DIGIT; k++) {
		if (x[k] < 10)
			break; // 沒進位則停止
		x[k] -= 10; // 留下個位, 並 ..
		x[k + 1] += 1; // 進 1 到下一位, 不管 overflow 的問題
	}
}

istream& operator>>(istream&ii, BigInteger& y) {
	int k;
	char tmp[BigInteger::MAX_DIGIT + 38];
	ii.getline(tmp, BigInteger::MAX_DIGIT + 1); // read a line
	y.setData(tmp);
	return ii;
}

void BigInteger::setData(char tmp[]) {
	int k;
	int len = strlen(tmp); // strlen() in string.h
	for (k = 0; k <= MAX_DIGIT; k++)
		d[k] = 0; // assume positive 0
	char* p = tmp; //  即 &tmp[0]
	if (tmp[0] == '+') {
		p++; // 跳過正號
		len--;
	}
	if (tmp[0] == '-') {
		d[MAX_DIGIT] = 1; // indicate it is a negative number
		p++;
		len--;
	}
	for (k = 0; k < len; k++) {
		d[k] = p[len - k - 1] - '0'; // ASCII 的數字轉成 0..9
		if (d[k] < 0 || d[k] > 9)
			d[k] = 0; // 看不懂的都當 0
	}
	if (d[MAX_DIGIT]) {
		BigInteger::twoscom(d); // 負的用 2's complement 存
		d[MAX_DIGIT] = 1; // 確保是負的, 因 twoscom() 會把它變號
	}
}

struct BigNumber {
	int array[1000]; // 存 1000 位數
	bool sign; // 正負號
	int length; // 位數
};

void print(int a[100]) {
	int i = 100 - 1;
	while (i >= 0 && a[i] == 0)
		i--;
	if (i < 0)
		cout << '0';
	else
		while (i >= 0)
			cout << a[i--];
}

bool largerthan(int a[100], int b[100]) {
	for (int i = 100 - 1; i >= 0; i--)
		if (a[i] != b[i])
			return a[i] > b[i];
	return false;
}

void add(int a[100], int b[100], int c[100]) {
	for (int i = 0; i < 100; i++) // 對應的位數相加
		c[i] = a[i] + b[i];
	for (int i = 0; i < 100 - 1; i++) // 一口氣進位
			{
		c[i + 1] += c[i] / 10; // 進位
		c[i] %= 10; // 進位後餘下的數
	}
}

void sub(int a[100], int b[100], int c[100]) {
	for (int i = 0; i < 100; i++)
		c[i] = a[i] - b[i];
	for (int i = 0; i < 100 - 1; i++) // 一口氣借位和補位
		if (c[i] < 0) {
			c[i + 1]--; // 借位
			c[i] += 10; // 補位
		}
}

void mul(int a[100], int b[100], int c[100]) {
	for (int i = 0; i < 100; i++)
		for (int j = 0; j < 100; j++)
			if (i + j < 100)
				c[i + j] = a[i] * b[j];
	for (int i = 0; i < 100 - 1; i++) // 一口氣進位
			{
		c[i + 1] += c[i] / 10;
		c[i] %= 10;
	}
}

void div(int a[100], int b[100], int c[100]) {
	int t[100];
	for (int i = 100 - 1; i >= 0; i--)
		for (int k = 9; k > 0; k--) // 嘗試商數
				{
			mul(b + i, k, t);
			if (largerthan(a + i, t)) {
				sub(a + i, t, c + i);
				break;
			}
		}
}

int main() {


	return 0;
}
