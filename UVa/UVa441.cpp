/*Filename: uva441.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>

using namespace std;

int main() {
	const int MAX_K = 13;
	int S[MAX_K];
	bool isFirstCase = true;
	int k = 0;

	while (cin >> k) {
		if (k == 0) {
			break;
		}

		for (int i = 0; i < k; ++i) {
			cin >> S[i];
		}

		if (isFirstCase) {
			isFirstCase = false;
		} else {
			printf("\n");
		}

		for (int i = 0; i < k - 5; ++i) {
			for (int j = i + 1; j < k - 4; ++j) {
				for (int l = j + 1; l < k - 3; ++l) {
					for (int m = l + 1; m < k - 2; ++m) {
						for (int n = m + 1; n < k - 1; ++n) {
							for (int o = n + 1; o < k; ++o) {
								printf("%d %d %d %d %d %d\n", S[i], S[j], S[l], S[m], S[n], S[o]);

							}
						}
					}
				}
			}
		}
	}

	return 0;
}
