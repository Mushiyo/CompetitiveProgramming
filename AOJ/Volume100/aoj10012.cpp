/*Filename: aoj10012.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	int H = 0, W = 0;

    while(cin >> H >> W){
        if(H == 0 && W == 0){
        	break;
        }
        
        for(int i = 0; i < H; ++i){
        	for(int j = 0; j < W; ++j){
        		cout << "#";
        	}
        	cout << endl;
        }
        cout << endl;
    }

	return 0;
}
