/*Filename: uva11520.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>
#include <cstring>

using namespace std;

const int DIRECTION = 4;
const int dx[] = { 0, -1, 1, 0 };
const int dy[] = { -1, 0, 0, 1 };
// the 4 direction left, up, down, right

const char SPACE = '.';
const int maxN = 10 + 2;
char grid[maxN][maxN];

char fillChar(int x, int y) {
	for (int i = 0; i < 26; ++i) {
		bool canFill = true;
		for (int d = 0; d < DIRECTION; ++d) {
			if ('A' + i == grid[x + dx[d]][y + dy[d]]) {
				canFill = false;
				break;
			}
		}

		if (canFill) {
			return (char) ('A' + i);
		}
	}
}

int main() {
	int testCase = 0;

	while (cin >> testCase) {
		for (int c = 1; c <= testCase; ++c) {
			int n = 0;
			cin >> n;

			memset(grid, SPACE, sizeof(grid));

			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					cin >> grid[i][j];
				}
			}

			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					if (grid[i][j] == SPACE) {
						grid[i][j] = fillChar(i, j);
					}
				}
			}

			printf("Case %d:\n", c);
			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					printf("%c", grid[i][j]);
				}
				printf("\n");
			}
		}
	}

	return 0;
}
