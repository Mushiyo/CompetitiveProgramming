/*Filename: la4843.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstring>

using namespace std;

int main() {
	int T = 0;

	while (cin >> T) {
		while (T--) {
			int n = 0;
			cin >> n;

			int A[n];
			memset(A, 0, sizeof(A));

			const int LEN_B = n - 1;
			int B[LEN_B];
			memset(B, 0, sizeof(B));

			cin >> A[0];
			for (int i = 1; i < n; ++i) {
				cin >> A[i];
				int countNongreater = 0;

				for (int j = 0; j < i; ++j) {
					if (A[j] <= A[i]) {
						++countNongreater;
					}
				}

				B[i - 1] = countNongreater;
			}

			int sumB = 0;
			for (int i = 0; i < LEN_B; ++i) {
				sumB += B[i];
			}

			cout << sumB << endl;
		}
	}

	return 0;
}
