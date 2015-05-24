/*Filename: aoj10002.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	int a = 0, b = 0;

    while(cin >> a >> b){
    	int area = a * b;
    	int perimeter = 2 * (a + b);
        cout << area << " " << perimeter << endl;
    }

	return 0;
}
