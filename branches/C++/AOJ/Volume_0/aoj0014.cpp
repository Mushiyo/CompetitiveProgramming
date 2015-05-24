/*Filename: aoj0014.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	int d = 0;

    while(cin >> d){
    	int s = 0;

        for(int i = d; i < 600; i += d){
        	s += d * (i * i);
        }
        
        cout << s << endl;
    }

	return 0;
}
