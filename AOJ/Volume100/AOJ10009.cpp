/*Filename: aoj10009.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <cmath>

using namespace std;

int main(){
	double r = 0;

    while(cin >> r){
        double area = M_PI * r * r;
        double perimeter = 2 * M_PI * r;
        
        printf("%f %f\n", area, perimeter);
    }

	return 0;
}
