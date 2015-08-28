/*Filename: poj2837.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	const int SIZE = 1 << 9;
	int silverMatrix[SIZE][SIZE];
	silverMatrix[0][0] = 1;
	silverMatrix[1][1] = 1;
	silverMatrix[0][1] = 2;
	silverMatrix[1][0] = 3;

	for(int k = 2; k <= 9; ++k){
		int formerSize = 1 << (k - 1);
		int currentSize = 1 << k;

		for(int i  = 0; i < formerSize; ++i){
			for(int j = 0; j < formerSize; ++j){
				silverMatrix[i + formerSize][j + formerSize] = silverMatrix[i][j];
				silverMatrix[i][j + formerSize] = silverMatrix[i][j] + currentSize;
				silverMatrix[i + formerSize][j] = silverMatrix[i][j + formerSize];

				if(i == j){
					--silverMatrix[i + formerSize][j];
				}
			}
		}
	}

	int k = 0;

	while(cin >> k){
		int size = 1 << k;

		for(int i = 0; i < size; ++i){
			for(int j = 0; j < size; ++j){
				cout << silverMatrix[i][j];

				if(j < size - 1){
					cout << " ";
				}
			}
			cout << endl;
		}
	}


	return 0;
}
