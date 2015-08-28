/*Filename: aoj10007.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	int x = 0, y = 0;

    while(cin >> x >> y){
        if(x == 0 && y == 0){
        	break;
        }
        
        if(x < y){
        	cout << x << " " << y << endl;
        }
        else{
        	cout << y << " " << x << endl;
        }
    }

	return 0;
}
