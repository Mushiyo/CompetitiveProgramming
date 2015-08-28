/*Filename: uva12577.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	int caseNum = 1;
	string s;

    while(cin >> s){
        if(s == "*"){
        	break;
        }

        cout << "Case " << caseNum << ": ";
        if(s == "Hajj"){
        	cout << "Hajj-e-Akbar" << endl;
        }
        else{
        	cout << "Hajj-e-Asghar" << endl;
        }
        
        ++caseNum;
    }

	return 0;
}
