/*Filename: aoj10010.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int calc(int a, int b, char op){
	int result = 0;
	switch(op){
	case '+':
		result = a + b;
		break;

	case '-':
		result = a - b;
		break
		;
	case '*':
		result = a * b;
		break;

	case '/':
		result = a / b;
		break;
	}

	return result;
}

int main(){
	int a = 0, b = 0;
	char op = ' ';

    while(cin >> a >> op >> b){
        if(op == '?'){
        	break;
        }
        
        cout << calc(a, b, op) << endl;
    }

	return 0;
}
