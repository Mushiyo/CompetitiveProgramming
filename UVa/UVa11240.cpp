/*Filename: uva11240.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>

using namespace std;

int main() {
	const bool lastGreater = true;
	const bool lastLess = false;

	int T = 0;

	while (cin >> T) {
		while (T > 0) {
			int n = 0;
			cin >> n;

			int lastMaryElement = 0;
			cin >> lastMaryElement;

			int maxMaryLen = 1;

			bool state = lastGreater;
			for (int i = 1; i < n; ++i) {
				int currElement = 0;
				cin >> currElement;

				if (lastMaryElement > currElement) {
					if (state == lastGreater) {
						++maxMaryLen;
						lastMaryElement = currElement;
						state = lastLess;
					} else { // state == lastLess
						lastMaryElement = currElement;
						/**
						 * We wish to find an element > last element,
						 * if the last element is smaller, it would become
						 * easier for us to find an element greater than it.
						 * Note: since last - 1 > last, it does not matter if we
						 * replace the last element with an element less than it.
						 */
					}
				} else { // lastMaryElement < currElement
					if (state == lastLess) {
						++maxMaryLen;
						lastMaryElement = currElement;
						state = lastGreater;
					} else { // state == lastGreater
						lastMaryElement = currElement;
						/**
						 * We wish to find an element < last element,
						 * if the last element is greater, it would become
						 * easier for us to find an element smaller than it.
						 * Note: since last - 1 < last, it does not matter if we
						 * replace the last element with an element greater than it.
						 */
					}
				}
			}

			cout << maxMaryLen << endl;
			--T;
		}
	}

	return 0;
}
