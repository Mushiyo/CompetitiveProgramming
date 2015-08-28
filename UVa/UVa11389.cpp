/*Filename: uva11389.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

int main() {
	int n = 0, d = 0, r = 0;

	while (cin >> n >> d >> r) {
		if (n == 0 && d == 0 && r == 0) {
			break;
		}

		int morningLen[n];
		for (int i = 0; i < n; ++i) {
			cin >> morningLen[i];
		}

		sort(morningLen, morningLen + n);

		int eveningLen[n];
		for (int i = 0; i < n; ++i) {
			cin >> eveningLen[i];
		}

		sort(eveningLen, eveningLen + n, greater<int>());

		int paid = 0;
		for (int i = 0; i < n; ++i) {
			int totalLen = morningLen[i] + eveningLen[i];

			if (totalLen > d) {
				paid += (totalLen - d) * r;
			}
		}

		cout << paid << endl;
	}

	return 0;
}
