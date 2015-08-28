/*Filename: aoj10013.cpp
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
        	cout << "#";
        	for(int j = 1; j < W - 1; ++j){
        		if(i > 0 && i < H - 1){
        			cout << ".";
        		}
        		else{
        			cout << "#";
        		}
        	}
        	cout << "#" << endl;
        }
        cout << endl;
    }

	return 0;
}
