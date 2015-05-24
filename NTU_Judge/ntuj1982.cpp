/*Filename: ntuj1982.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	const int MAX_SIZE = 4000;
	int A[MAX_SIZE];
	int B[MAX_SIZE];
	int C[MAX_SIZE];
	int D[MAX_SIZE];

	int n = 0;

	while (cin >> n) {
		vector<int> cPlusD;
		for (int i = 0; i < n; ++i) {
			cin >> A[i] >> B[i] >> C[i] >> D[i];
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				cPlusD.push_back(-(C[i] + D[j]));
			}
		}

		sort(cPlusD.begin(), cPlusD.end());

		int countSum0 = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (binary_search(cPlusD.begin(), cPlusD.end(), A[i] + B[j])) {
					countSum0 += upper_bound(cPlusD.begin(), cPlusD.end(), A[i] + B[j])
								- lower_bound(cPlusD.begin(), cPlusD.end(), A[i] + B[j]);
				}
			}
		}

		cout << countSum0 << endl;
	}

	return 0;
}
