/*Filename: d211.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <string>

using namespace std;

int main(){
	string s;

    while(getline(cin, s)){
        for(int i = s.size() - 1; i >= 0; --i){
        	cout << s[i];
        }
        cout << endl;
    }

	return 0;
}
