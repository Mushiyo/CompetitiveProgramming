/*Filename: aoj0002.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cmath>

using namespace std;

int countDigit(int num){
	if(num == 0){
		return 1;
	}

	int digit = (int)log10(num) + 1;

	return digit;
}

int main(){
	int a = 0, b = 0;

    while(cin >> a >> b){
        cout << countDigit(a + b) << endl;
    }

	return 0;
}
