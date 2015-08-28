/*Filename: aoj0006.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	string str;

    while(cin >> str){
        for(int i = str.size() - 1; i>= 0; --i){
        	cout << str[i];
        }
        cout << endl;
    }

	return 0;
}
