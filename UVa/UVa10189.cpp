/*Filename: uva10189.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstring>

using namespace std;

int main() {
	bool isFirstField = true;
	int countField = 1;
	int n = 0, m = 0;

	while (cin >> n >> m) {
		if (n == 0 && m == 0) {
			break;
		}

		char field[n + 2][m + 2];
		memset(field, '.', sizeof(field));

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				cin >> field[i][j];
			}
		}

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				if (field[i][j] == '*') {
					continue;
				} else {
					int countBomb = 0;

					for (int di = -1; di <= 1; ++di) {
						for (int dj = -1; dj <= 1; ++dj) {
							if (field[i + di][j + dj] == '*') {
								++countBomb;
							}
						}
					}

					field[i][j] = '0' + countBomb;
				}
			}
		}

		if (isFirstField) {
			isFirstField = false;
		} else {
			cout << endl;
		}

		cout << "Field #" << countField << ":" << endl;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				cout << field[i][j];
			}
			cout << endl;
		}

		++countField;
	}

	return 0;
}
