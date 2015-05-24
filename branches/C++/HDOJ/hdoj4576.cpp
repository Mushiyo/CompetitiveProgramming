/*Filename: hdoj4576.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <queue>

using namespace std;

const int SIZE = 100000 + 1;
const bool CCW = true;
const bool CW = false;

struct State {
	int commandNum;
	int pos;
	bool direction;
};

int main() {
	int w[SIZE];
	int n = 0, m = 0, l = 0, r = 0;

	while (cin >> n >> m >> l >> r) {
		if(n == 0 && m == 0 && l == 0 && r == 0){
			break;
		}

		--l;
		--r;

		for (int i = 0; i < m; ++i) {
			cin >> w[i];
		}

//		int count[n];
//		for (int i = 0; i < n; ++i) {
//			count[i] = 0;
//		}

		State firstCCW;
		firstCCW.commandNum = 0;
		firstCCW.pos = 0;
		firstCCW.direction = CCW;
		State firstCW;
		firstCW.commandNum = 0;
		firstCW.pos = 0;
		firstCW.direction = CW;
		queue<State> q;
		q.push(firstCCW);
		q.push(firstCW);

		int countWays = 0;
		int allPossibility = 0;
		while (!q.empty()) {
			State currState = q.front();
			q.pop();
			int newPos = 0;
			int currCmd = currState.commandNum;
			if (currState.direction == CCW) {
				newPos = (currState.pos + w[currCmd]) % n;
			} else {
				newPos = (currState.pos - w[currCmd]);
				while (newPos < n) {
					newPos += n;
				}
				newPos %= n;
			}

			if (currCmd == m) {
				++allPossibility;

				if (l <= newPos && newPos <= r) {
					++countWays;
				}
			} else {
				State newStateCCW;
				newStateCCW.commandNum = currCmd + 1;
				newStateCCW.pos = newPos;
				newStateCCW.direction = CCW;

				State newStateCW;
				newStateCW.commandNum = currCmd + 1;
				newStateCW.pos = newPos;
				newStateCW.direction = CW;

				q.push(newStateCCW);
				q.push(newStateCW);
			}
		}

		double possibility = (double)countWays / allPossibility;
		//cout << countWays << allPossibility << endl;
		printf("%.4f\n", possibility);

	}

	return 0;
}
