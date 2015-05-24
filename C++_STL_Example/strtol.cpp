/*Filename: strtol.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <cstring>

using namespace std;

int main(){
	int numArray[7] = {0, 2, 4, 8, 16, 20, 23};

	for(int i = 0; i < 7; ++i){
		cout << "current number: " << numArray[i] << endl;
		strtol(numArray[i], NULL, 2);
		cout << "in base 2: "   << endl;
	}

	return 0;
}
