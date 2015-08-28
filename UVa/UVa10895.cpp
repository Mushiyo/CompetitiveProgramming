/*Filename: uva10895.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>

using namespace std;

int main() {
	int m = 0, n = 0;

	while (cin >> m >> n) {
		vector<int> adjancyMatrix[n];
		vector<int> val[n];

		for (int row = 1; row <= m; ++row) {
			int r = 0;
			cin >> r;

			if (r == 0) {
				continue;
			}

			int neighborOfRow[r];
			for (int i = 0; i < r; ++i) {
				cin >> neighborOfRow[i];
			}

			int element;
			for (int i = 0; i < r; ++i) {
				cin >> element;

				adjancyMatrix[neighborOfRow[i] - 1].push_back(row);
				val[neighborOfRow[i] - 1].push_back(element);
			}
		}

		cout << n << " " << m << endl;
		for (int col = 0; col < n; ++col) {
			int r = adjancyMatrix[col].size();

			cout << r;
			if (r == 0) {
				cout << endl << endl;
				continue;
			}

			for (int i = 0; i < r; ++i) {
				cout << " " << adjancyMatrix[col][i];
			}
			cout << endl;

			for (int i = 0; i < r; ++i) {
				cout << val[col][i];

				if(i < r - 1){
					cout << " ";
				}
			}
			cout << endl;
		}
	}

	return 0;
}
