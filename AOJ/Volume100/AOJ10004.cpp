/*Filename: aoj10004.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

int main(){
	const int SIZE = 3;
	int num[SIZE];

    while(cin >> num[0] >> num[1] >> num[2]){
        sort(num, num + SIZE);
        
        cout << num[0];
        for(int i = 1; i < SIZE; ++i){
        	cout << " " << num[i];
        }
        cout << endl;
    }

	return 0;
}
