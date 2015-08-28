/*Filename: aoj0011.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>

using namespace std;

int main(){
	int w = 0;

    while(cin >> w){
    	int num[w + 1];
    	for(int i = 1; i <= w; ++i){
    		num[i] = i;
    	}

        int n = 0;
        cin >> n;

        while(n > 0){
        	int a = 0, b = 0;
        	scanf("%d, %d", &a, &b);

        	int tmp = num[a];
        	num[a] = num[b];
        	num[b] = tmp;

        	--n;
        }
        
        for(int i = 1; i <= w; ++i){
        	cout << num[i] << endl;
        }
    }

	return 0;
}
