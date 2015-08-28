/*Filename: uva532.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstring>
#include <queue>

using namespace std;

struct Point {
	int l;
	int r;
	int c;
};

const int DIRECTIONS = 6;
const int dL[] = { 0, 0, 0, 0, -1, 1 };
const int dR[] = { 1, -1, 0, 0, 0, 0 };
const int dC[] = { 0, 0, 1, -1, 0, 0 };

const int MAX_SIZE = 30 + 2;
char dungeon[MAX_SIZE][MAX_SIZE][MAX_SIZE];
const char START = 'S';
const char END = 'E';
const char ROCK = '#';
int timeStamp[MAX_SIZE][MAX_SIZE][MAX_SIZE];
const int NOT_REACHED = -1;

int main() {
	int L = 0, R = 0, C = 0;

	while (cin >> L >> R >> C) {
		if (L == 0 && R == 0 && C == 0) {
			break;
		}

		memset(dungeon, ROCK, sizeof(dungeon));
		memset(timeStamp, NOT_REACHED, sizeof(timeStamp));

		queue<Point> q;
		for (int l = 1; l <= L; ++l) {
			for (int r = 1; r <= R; ++r) {
				for (int c = 1; c <= C; ++c) {
					cin >> dungeon[l][r][c];

					if (dungeon[l][r][c] == START) {
						q.push((Point ) { l, r, c });
						timeStamp[l][r][c] = 0;
					}
				}
			}
		}

		int reachedTime = NOT_REACHED;
		while (q.empty() == false) {
			Point currPos = q.front();
			q.pop();

			if(dungeon[currPos.l][currPos.r][currPos.c] == END){
				reachedTime = timeStamp[currPos.l][currPos.r][currPos.c];
				break;
			}

			int currentTime = timeStamp[currPos.l][currPos.r][currPos.c];

			for (int d = 0; d < DIRECTIONS; ++d) {
				int nL = currPos.l + dL[d];
				int nR = currPos.r + dR[d];
				int nC = currPos.c + dC[d];
				if (timeStamp[nL][nR][nC] == NOT_REACHED) {
					if (dungeon[nL][nR][nC] != ROCK) {
						q.push((Point) { nL, nR, nC});
						timeStamp[nL][nR][nC] = currentTime + 1;
					}
				}
			}
		}

		if(reachedTime == NOT_REACHED){
			cout << "Trapped!" << endl;
		}
		else{
			cout << "Escaped in " << reachedTime << " minute(s)."<< endl;
		}
	}

	return 0;
}
