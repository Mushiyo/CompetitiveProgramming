/*Filename: ntuj1844.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <iostream>
#include <string>
#include <cmath>
#include <algorithm>
#include <cfloat>
#include <vector>
#include <stack>
#include <queue>

using namespace std;

int m = 0;

int hash(const char*s, int m) {
	int h = 0;
	for (int i = 0; s[i]; i++)
		h = (h * 27LL + s[i] - 'a' + 1) % m;

	return h;
}

int main() {

	//cout << 't' + 'm' + 't' - 3 * 'a'<< endl;
	//cout << 'b' + 'd' + 'u' - 3 * 'a'<< endl;
	//cout << hash("tmt", 514) << endl;
	//cout << hash("bdu", 514) << endl;
//	cout << hash("a", 514) << endl;
//	cout << hash("aa", 514) << endl;
//	cout << hash("aaa", 514) << endl;
//	cout << (729 + 27 + 1) % 514 << endl;
//	cout << hash("a", 27) << endl;
//	cout << hash("aza", 27) << endl;
	//cout << hash("u", 514);

	while (scanf("%d ", &m) == 1) {
		if(m == 27){
			printf("a aza\n");
		}
		else if(m > 27){

		}
		else{
			int diff = 27 % m;
			cout << diff << endl;
			char c2 = m - diff + 'a';
			printf("a a%c\n", c2);

			string s = "a" + c2;
			cout << hash("a", m) << " " <<  hash(s.c_str(), m) << endl;
		}

	}

	return 0;
}
