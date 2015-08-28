/*Filename: uva10279.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstring>

using namespace std;

const int DIRECTION_NUM = 8;
int dx[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
int dy[] = { 1, 1, 1, 0, 0, -1, -1, -1 };

const char BOMB = '*';
const char TOUCHED = 'x';

int main() {
	int T = 0;

	while (cin >> T) {
		bool isFirstCase = true;

		while (T > 0) {
			int n = 0;
			cin >> n;

			const int SIZE = n + 2;
			char game[SIZE][SIZE];

			memset(game, '.', sizeof(game));
			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					cin >> game[i][j];
				}
			}

			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					if (game[i][j] == BOMB) {
						continue;
					}

					int countBomb = 0;
					for (int d = 0; d < DIRECTION_NUM; ++d) {
						if (game[i + dx[d]][j + dy[d]] == BOMB) {
							++countBomb;
						}
					}

					game[i][j] = '0' + countBomb;
				}
			}

			bool isBombTouched = false;
			char result[SIZE][SIZE];
			memset(result, '.', sizeof(result));
			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					char touchState;
					cin >> touchState;

					if (game[i][j] == BOMB) {
						result[i][j] = BOMB;
					}

					if (touchState == TOUCHED) {
						result[i][j] = game[i][j];

						if (game[i][j] == BOMB) {
							isBombTouched = true;
						}
					}

				}
			}

			if(isFirstCase){
				isFirstCase = false;
			}
			else{
				cout << endl;
			}

			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					if (result[i][j] == BOMB) {
						if (isBombTouched) {
							cout << result[i][j];
						} else {
							cout << ".";
						}
					} else {
						cout << result[i][j];
					}
				}
				cout << endl;
			}

			--T;
		}
	}

	return 0;
}
