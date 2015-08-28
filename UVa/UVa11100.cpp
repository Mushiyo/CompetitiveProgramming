/*Filename: uva11100.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

int main() {
	int n = 0;
	bool isFirstCase = true;

	while (cin >> n) {
		if (n == 0) {
			break;
		}

		int dimensionOfBag[n];
		for (int i = 0; i < n; ++i) {
			cin >> dimensionOfBag[i];
		}

		sort(dimensionOfBag, dimensionOfBag + n);

		int k = 0;
		int countCurrentDimension = 0;
		int prevDimension = 0;
		for (int i = 0; i < n; ++i) {
			if (dimensionOfBag[i] == prevDimension) {
				++countCurrentDimension;
			} else {
				prevDimension = dimensionOfBag[i];

				if (k < countCurrentDimension) {
					k = countCurrentDimension;
				}

				countCurrentDimension = 1;
			}
		}

		if (k < countCurrentDimension) {
			k = countCurrentDimension;
		}

		if (isFirstCase) {
			isFirstCase = false;
		} else {
			cout << endl;
		}

		cout << k << endl;
		for (int i = 0; i < k; ++i) {
			bool isFirst = true;

			for (int j = i; j < n; j += k) {
				if (isFirst) {
					isFirst = false;
					cout << dimensionOfBag[j];
				} else {
					cout << " " << dimensionOfBag[j];
				}
			}

			cout << endl;
		}
	}

	return 0;
}
