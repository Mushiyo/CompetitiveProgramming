/*Filename: uva657.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstring>
#include <vector>
#include <algorithm>

using namespace std;

const char BACKGROUND = '.';
const char DICE = '*';
const char DOT = 'X';

const int SIZE = 50 + 2;
const int DIRECTION_NUM = 4;
int dx[] = { 1, 0, -1, 0 };
int dy[] = { 0, 1, 0, -1 };

char pic[SIZE][SIZE];

void dfs_dot(int x, int y) {
	pic[x][y] = DICE;

	for (int d = 0; d < DIRECTION_NUM; ++d) {
		if (pic[x + dx[d]][y + dy[d]] == DOT) {
			dfs_dot(x + dx[d], y + dy[d]);
		}
	}
}

int dfs_dice(int x, int y) {
	int countDot = 0;

	pic[x][y] = BACKGROUND;

	for (int d = 0; d < DIRECTION_NUM; ++d) {
		if (pic[x + dx[d]][y + dy[d]] == DOT) {
			++countDot;
			dfs_dot(x + dx[d], y + dy[d]);
		}

		if (pic[x + dx[d]][y + dy[d]] == DICE) {
			countDot += dfs_dice(x + dx[d], y + dy[d]);
		}
	}

	return countDot;
}

int main() {
	int throwNum = 1;
	int w = 0, h = 0;

	while (cin >> w >> h) {
		if (w == 0 && h == 0) {
			break;
		}

		memset(pic, BACKGROUND, sizeof(pic));

		for (int x = 1; x <= h; ++x) {
			for (int y = 1; y <= w; ++y) {
				cin >> pic[x][y];
			}
		}

		vector<int> dots;
		for (int x = 1; x <= h; ++x) {
			for (int y = 1; y <= w; ++y) {
				if (pic[x][y] == DICE) {
					dots.push_back(dfs_dice(x, y));
				}
			}
		}
		sort(dots.begin(), dots.end());

		cout << "Throw " << throwNum << endl;
		cout << dots[0];
		for (int i = 1; i < dots.size(); ++i) {
			cout << " " << dots[i];
		}
		cout << endl << endl;

		++throwNum;
	}

	return 0;
}
