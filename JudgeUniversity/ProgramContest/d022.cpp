/*Filename: d022.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

char BITMAP[50][50];
int m = 0, n = 0;
const int AIR_CONDITIONER_TYPE = 250 + 1;
int type[AIR_CONDITIONER_TYPE];
const char WALL = '*';

void initialize() {
	for (int i = 0; i < AIR_CONDITIONER_TYPE; ++i) {
		type[i] = 0;
	}
}

int dfs(int x, int y, int roomSize) {
	BITMAP[x][y] = WALL;
	++roomSize;

	for (int dx = -1; dx <= 1; ++dx) {
		for (int dy = -1; dy <= 1; ++dy) {
			if (BITMAP[x + dx][y + dy] != WALL) {
				roomSize = dfs(x + dx, y + dy, roomSize);
			}
		}
	}

	return roomSize;
}

int main() {

	while (cin >> m >> n) {
		initialize();

		string s;
		getline(cin, s); //eat change line

		for (int i = 0; i < m; ++i) {
			getline(cin, s);
			for (int j = 0; j < n; ++j) {
				BITMAP[i][j] = s[j];
			}
		}

		for (int i = 1; i < m - 1; ++i) {
			for (int j = 1; j < n - 1; ++j) {
				if (BITMAP[i][j] != WALL) {
					int roomSize = dfs(i, j, 0);

					int typeForCurr = roomSize / 10;
					if (roomSize % 10 > 0) {
						++typeForCurr;
					}

					++type[typeForCurr];
				}
			}
		}

		for (int i = 1; i < AIR_CONDITIONER_TYPE; ++i) {
			if (type[i] > 0) {
				cout << i << " " << type[i] << endl;
			}
		}
		cout << endl;
	}

	return 0;
}
