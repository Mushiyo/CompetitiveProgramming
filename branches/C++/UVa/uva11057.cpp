/*Filename: uva11057.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <climits>

using namespace std;

int main() {
	const int MAX_N = 10000;
	int bookPrice[MAX_N];
	int N = 0;

	while (cin >> N) {

		for (int i = 0; i < N; ++i) {
			cin >> bookPrice[i];
		}

		sort(bookPrice, bookPrice + N);

		int M = 0;
		cin >> M;
		int i = 0, j = 0;
		int minDiff = INT_MAX;
		for (int iPos = 0; iPos < N; ++iPos) {
			int findPrice = M - bookPrice[iPos];
			int diff = abs(findPrice - bookPrice[iPos]);
			if (diff > minDiff) {
				break;
			}

			bool jFound = binary_search(bookPrice, bookPrice + N, findPrice);

			if (jFound && diff < minDiff) {
				i = min(bookPrice[iPos], findPrice);
				j = max(bookPrice[iPos], findPrice);
				minDiff = diff;
			}
		}

		printf("Peter should buy books whose prices are %d and %d.\n\n", i, j);
	}

	return 0;
}
