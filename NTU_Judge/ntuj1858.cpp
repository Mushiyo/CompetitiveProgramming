/*Filename: ntuj1858.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <string>
#include <cmath>
#include <algorithm>
#include <cfloat>
#include <vector>
#include <stack>
#include <queue>
#include <bitset>

using namespace std;

const int SIZE = 16;
int xorRes[SIZE][SIZE];

int ones(int num) {
	bitset<32> s(num);

	return int(s.count());
}

void initialize() {
	for (int i = 0; i < SIZE; ++i) {
		for (int j = 0; j < SIZE; ++j) {
			xorRes[i][j] = 0;
		}
	}
}

int main() {
	int T = 0;

	while (cin >> T) {
		while (T > 0) {
			initialize();

			int n = 0;
			cin >> n;

			int v[n];
			for (int i = 0; i < n; ++i) {
				cin >> v[i];
			}

			if (n == 1) {
				printf("0\n");
				continue;
			}

			if (n == 2) {
				printf("%d\n", ones(v[0] ^ v[1]));
				continue;
			}

			for (int i = 0; i < n; ++i) {
				for (int j = i + 1; j < n; ++j) {
					int res = v[i] ^ v[j];
					//cout << res;
					int countOne = ones(res);
					xorRes[i][j] = countOne;
					xorRes[j][i] = countOne;
				}
			}

//			for (int i = 0; i < n; ++i) {
//				for (int j = 0; j < n; ++j) {
//					cout << xorRes[i][j] << " ";
//				}
//				cout << endl;
//			}
//			cout << endl;

			int exp2N = (int) exp2(n);
			int max = 0;

			for (int i = 0; i < exp2N; ++i) {
				bitset<16> s(i);

				int currPower = 0;
				for (int j = 0; j < n; ++j) {
					if (s[j] == 1) {
						for (int k = 0; k < n; ++k) {
							if (s[k] == 0) {
								currPower += xorRes[j][k];
								//cout << j << "," << k << " ";
								//cout << xorRes[j][k] << " ";
							}
						}
					}
				}

				//cout << currPower << endl;
				if (currPower > max) {
					max = currPower;
				}
			}

			printf("%d\n", max);

			--T;
		}
	}

	return 0;
}
