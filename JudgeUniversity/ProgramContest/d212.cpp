/*Filename: d212.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <cmath>

using namespace std;

const int SIZE = 1000000;
long long cycleLenRec[SIZE];

long long countCycleLength(long long n) {
	if(cycleLenRec[n] > 0){
		return cycleLenRec[n];
	}

	long long cycleLen = 1;
	long long term = n;

	while (term != 1) {

		if (term % 2 == 1) {
			term = 3 * term + 1;
		} else {
			term = term / 2;
		}

		++cycleLen;
	}
	cycleLenRec[n] = cycleLen;

	return cycleLen;
}

void initialize(){
	for(int i = 0; i < SIZE; ++i){
		cycleLenRec[i] = 0;
	}
}

int main() {
	int i = 0, j = 0;

	initialize();

	while (cin >> i >> j) {
		int l = min(i, j);
		int u = max(i, j);
		long long maxCycleLen = 1;

		for (int k = l; k <= u; ++k) {
			long long currentCycleLen = countCycleLength(k);

			if (currentCycleLen > maxCycleLen) {
				maxCycleLen = currentCycleLen;
			}
		}

		//cout << i << " " << j << " " << maxCycleLen << endl;
		printf("%d %d %d\n", i ,j , maxCycleLen);
	}

	return 0;
}
