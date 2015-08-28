/*Filename: aoj10006.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	int x = 0;
	int caseNum = 1;

    while(cin >> x){
        if(x == 0){
        	break;
        }

        cout << "Case " << caseNum << ": " << x << endl;
        
        ++caseNum;
    }

	return 0;
}
