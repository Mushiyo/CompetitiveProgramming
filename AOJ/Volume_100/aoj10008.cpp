/*Filename: aoj10008.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>

using namespace std;

int main(){
	int a = 0, b = 0;

    while(cin >> a >> b){
        int d = a / b;
        int r = a % b;
        double f = (double)a / b;
        
        printf("%d %d %.5f\n", d, r, f);
    }

	return 0;
}
