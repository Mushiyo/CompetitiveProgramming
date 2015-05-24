/*Filename: d007.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <climits>
#include <cmath>

using namespace std;

const int SIZE = 100 + 1;
int m[SIZE][SIZE];
int sum[SIZE][SIZE];
int subSum[SIZE];
int N = 0;

void initialize(){
	for(int i = 0; i <= N; ++i){
		for(int j = 0; j <= N; ++j){
			sum[i][j] = 0;
		}

		subSum[i] = 0;
	}
}

int maxSubMatrixSum(){
	if(N == 0){
		return 0;
	}

	initialize();

	for(int i = 1; i <= N; ++i){
		for(int j = 1; j <= N; ++j){
			sum[i][j] = sum[i - 1][j] + m[i][j];
		}
	}

	int maxSubSum = INT_MIN;
	subSum[0] = 0;
	for(int upperBound = 1; upperBound <= N; ++upperBound){
		for(int lowerBound = upperBound; lowerBound <= N; ++lowerBound){
			int minSum = 0;
			for(int i = 1; i <= N; ++i){
				subSum[i] = subSum[i - 1] + (sum[lowerBound][i] - sum[upperBound - 1][i]);

				maxSubSum = max(maxSubSum, subSum[i] - minSum);
				minSum = min(minSum, subSum[i]);
			}
		}
	}

	return maxSubSum;
}

int main() {

	while (cin >> N) {
		for(int i = 1; i <= N; ++i){
			for(int j = 1; j <= N; ++j){
				cin >> m[i][j];
			}
		}

		cout << maxSubMatrixSum() << endl;
	}

	return 0;
}
