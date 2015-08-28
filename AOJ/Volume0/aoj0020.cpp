/*Filename: aoj0020.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cctype>

using namespace std;

string toUpperStr(string s){
	string upperS;

	for(int i = 0; i < s.size(); ++i){
		upperS += toupper(s[i]);
	}

	return upperS;
}

int main(){
	string s;

    while(getline(cin, s)){
        cout << toUpperStr(s) << endl;
    }

	return 0;
}
