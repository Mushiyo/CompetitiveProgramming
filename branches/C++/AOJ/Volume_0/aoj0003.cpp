/*Filename: aoj0003.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cmath>
#include <algorithm>

using namespace std;

const int a = 0;
const int b = 1;
const int c = 2;

int main() {
	int n = 0;

	while (cin >> n) {
		while (n > 0) {
			int side[3];
			for (int i = 0; i < 3; ++i) {
				cin >> side[i];
			}
			sort(side, side + 3);

			if (side[a] * side[a] + side[b] * side[b] == side[c] * side[c]) {
				cout << "YES" << endl;
			} else {
				cout << "NO" << endl;
			}
			--n;
		}
	}

	return 0;
}
