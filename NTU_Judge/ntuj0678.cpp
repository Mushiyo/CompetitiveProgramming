/*Filename: ntuj0678.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int countPaintWays(string A, string B) {
	int paintWays[B.length()][B.length()];
	// paintWays[i][j] means the minimal steps to paint an empty string to string B[i .. j]

//	for (int i = 0; i < B.length(); ++i) {
//		for (int j = 0; j < B.length(); ++j) {
//			paintWays[i][j] = 0;
//		}
//	}

	for (int i = 0; i < B.length(); ++i) {
		for (int j = i; j < i + 1; ++j) {
			paintWays[i][j] = 1;
		}
	}

	for (int subLen = 1; subLen < B.length(); ++subLen) {
		for (int i = 0; i < B.length() - subLen; ++i) {
			int k = i + subLen;

			if (B[i] == B[k]) {
				paintWays[i][k] = paintWays[i][k - 1];
			} else {
				paintWays[i][k] = paintWays[i][k - 1] + 1;
			}

			for (int j = i; j < k; ++j) {
				paintWays[i][k] = min(paintWays[i][k],
						paintWays[i][j] + paintWays[j + 1][k]);
			}
		}
	}

//	for (int i = 0; i < B.length(); ++i) {
//		for (int j = 0; j < B.length(); ++j) {
//			cout << paintWays[i][j] << " ";
//		}
//		cout << endl;
//	}

	int sol[B.length()];

	if (A[0] == B[0]) {
		sol[0] = 0;
	} else {
		sol[0] = 1;
	}

	for (int cur = 1; cur < B.length(); ++cur) {
		if (A[cur] == B[cur]) {
			sol[cur] = sol[cur - 1];
		} else {
			sol[cur] = paintWays[0][cur];
		}

		for (int mid = 0; mid < cur; ++mid) {
			sol[cur] = min(sol[cur], sol[mid] + paintWays[mid + 1][cur]);
		}
	}

	return sol[B.length() - 1];
}

int main() {
	string A, B;

	while (getline(cin, A)) {
		getline(cin, B);

		cout << countPaintWays(A, B) << endl;
	}

	return 0;
}
