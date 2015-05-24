/*Filename: d018.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>

using namespace std;

const int SIZE = 8 + 2;
int board[SIZE][SIZE];

vector<int> getPath(int x, int y) {
	vector<int> path;

	bool hasPassed[26];
	hasPassed[25] = true;
	for (int i = 0; i < 25; ++i) {
		hasPassed[i] = false;
	}

	bool isFirstNumber = true;
	bool unexploded = true;

	while (unexploded) {
		// right
		if (hasPassed[board[x][y + 1]] == false) {
			++y;
			hasPassed[board[x][y]] = true;
			path.push_back(board[x][y]);
			continue;
		}

		// left
		if (hasPassed[board[x][y - 1]] == false) {
			--y;
			hasPassed[board[x][y]] = true;
			path.push_back(board[x][y]);
			continue;
		}

		// down
		if (hasPassed[board[x + 1][y]] == false) {
			++x;
			hasPassed[board[x][y]] = true;
			path.push_back(board[x][y]);
			continue;
		}

		// up
		if (hasPassed[board[x - 1][y]] == false) {
			--x;
			hasPassed[board[x][y]] = true;
			path.push_back(board[x][y]);
			continue;
		}

		unexploded = false;
	}

	return path;
}

int main() {
	for (int i = 0; i < 10; ++i) {
		board[0][i] = 25;
		board[9][i] = 25;
		board[i][0] = 25;
		board[i][9] = 25;
	}

	int startNum = 0;

	while (cin >> startNum) {
		board[1][1] = startNum;
		for (int i = 2; i <= 8; ++i) {
			cin >> board[1][i];
		}

		for (int i = 2; i <= 8; ++i) {
			for (int j = 1; j <= 8; ++j) {
				cin >> board[i][j];
			}
		}

		vector<int> longestPath;
		for(int i = 1; i <= 8; ++i){
			for(int j = 1; j <= 8; ++j){
				vector<int> currentPath = getPath(i, j);

				if(currentPath.size() > longestPath.size()){
					longestPath = currentPath;
				}
			}
		}

		cout << longestPath[0];
		for(int i = 1; i < longestPath.size(); ++i){
			cout << " " << longestPath[i];
		}
		cout << endl;

		cout << endl;
	}

	return 0;
}
