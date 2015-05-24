/*Filename: aoj10001.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

long long exp3(int n){
	return n * n * n;
}

int main(){
	int x = 0;

    while(cin >> x){
        cout << exp3(x) << endl;
    }

	return 0;
}
