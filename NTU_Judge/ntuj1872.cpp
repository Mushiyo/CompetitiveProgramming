/*Filename: ntuj1872.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <vector>

using namespace std;

const int SIZE = 1000 + 2;
bool stageMap[SIZE][SIZE];
bool ableMapOdd[SIZE][SIZE];
bool ableMapEven[SIZE][SIZE];
bool oddTurn = true;
const bool RED = false;
const bool BLACK = true;

void printStage(int N, int M) {
	for (int i = 0; i <= N + 1; ++i) {
		for (int j = 0; j <= M + 1; ++j) {
			if (stageMap[i][j] == RED) {
				cout << "R";
			} else {
				cout << "B";
			}
		}
		cout << endl;
	}
	cout << endl;
}

void printAble(int N, int M) {
	for (int i = 0; i <= N + 1; ++i) {
		for (int j = 0; j <= M + 1; ++j) {
			if (ableMapOdd[i][j] == true) {
				cout << "T";
			} else {
				cout << "F";
			}
		}
		cout << endl;
	}
	cout << endl;
}

void debug(int N, int M) {
	cout << "Stage:" << endl;
	printStage(N, M);

	cout << "Able:" << endl;
	printAble(N, M);
}

void outterInit() {
	for (int i = 0; i < SIZE; ++i) {
		stageMap[0][i] = RED; // up
		//stageMap[SIZE - 1][i] = RED; // buttom
		stageMap[i][0] = RED; // left
		//stageMap[i][SIZE - 1] = RED; // right

		ableMapOdd[0][i] = false; // up
		//ableMapOdd[SIZE - 1][i] = false; // buttom
		ableMapOdd[i][0] = false; // left
		//ableMapOdd[i][SIZE - 1] = false; // right
	}
}

void innerInit(int N, int M) {
	oddTurn = true;

	// initialize the right boarder
	for (int i = 1; i <= N + 1; ++i) {
		//ableMapOdd[i][M + 1] = false;
		ableMapEven[i][M + 1] = false;
		stageMap[i][M + 1] = RED;
	}

	// initialize the bottom boarder
	for (int i = 1; i <= M + 1; ++i) {
		ableMapEven[N + 1][i] = false;
		stageMap[N + 1][i] = RED;
	}

	for (int i = 1; i <= N; ++i) {
		for (int j = 1; j <= M; ++j) {
			ableMapEven[i][j] = true;
			stageMap[i][j] = BLACK;
		}
	}
}

void setRed(int N, int M, vector<int> redX, vector<int> redY) {
	for (int i = 0; i < redX.size(); ++i) {
		for (int col = 1; col <= M; ++col) {
			stageMap[redX[i]][col] = RED;
		}
	}

	for (int i = 0; i < redY.size(); ++i) {
		for (int row = 1; row <= N; ++row) {
			stageMap[row][redY[i]] = RED;
		}
	}
}

void clearRed(int N, int M, vector<int> redX, vector<int> redY) {
	for (int i = 0; i < redX.size(); ++i) {
		for (int col = 1; col <= M; ++col) {
			stageMap[redX[i]][col] = BLACK;
		}
	}

	for (int i = 0; i < redY.size(); ++i) {
		for (int row = 1; row <= N; ++row) {
			stageMap[row][redY[i]] = BLACK;
		}
	}
}

void solve(int N, int M) {
	if (oddTurn) {
		for (int x = 1; x <= N; ++x) {
			for (int y = 1; y <= M; ++y) {
				bool survivable = false;
				ableMapOdd[x][y] = false;
				for (int dx = -1; dx <= 1 && (!survivable); ++dx) {
					for (int dy = -1; dy <= 1; ++dy) {
						int newX = x + dx, newY = y + dy;
						if (stageMap[newX][newY] && ableMapEven[newX][newY]) {
							survivable = true;
							ableMapOdd[x][y] = true;
							break;
						}
					}
				}
			}
		}
	} else {
		for (int x = 1; x <= N; ++x) {
			for (int y = 1; y <= M; ++y) {
				bool survivable = false;
				ableMapEven[x][y] = false;
				for (int dx = -1; dx <= 1 && (!survivable); ++dx) {
					for (int dy = -1; dy <= 1; ++dy) {
						int newX = x + dx, newY = y + dy;
						if (stageMap[newX][newY] && ableMapOdd[newX][newY]) {
							survivable = true;
							ableMapEven[x][y] = true;
							break;
						}
					}
				}
			}
		}
	}

	oddTurn = !oddTurn;
}

int main() {
	int T = 0;

	outterInit();

	while (scanf("%d ", &T) == 1) {
		while (T > 0) {
			int N = 0, M = 0, K = 0;
			scanf("%d %d %d", &N, &M, &K);

			innerInit(N, M);

			vector<int> redX[K];
			vector<int> redY[K];
			for (int stage = 0; stage < K; ++stage) {
				int X = 0, Y = 0;
				scanf("%d %d", &X, &Y);

				for (int j = 0; j < X; ++j) {
					int tmp = 0;
					scanf("%d", &tmp);
					redX[stage].push_back(tmp);
				}

				for (int j = 0; j < Y; ++j) {
					int tmp = 0;
					scanf("%d", &tmp);
					redY[stage].push_back(tmp);
				}
			}

			for (int stage = K - 1; stage >= 0; --stage) {
				// set the stage map
				setRed(N, M, redX[stage], redY[stage]);
				//printStage(N, M);
				//debug(N, M);

				solve(N, M);
				//printAble(N, M);

				clearRed(N, M, redX[stage], redY[stage]);
				//printStage(N, M);
			}

			int survivablePos = 0;
			if (oddTurn) {
				for (int i = 1; i <= N; ++i) {
					for (int j = 1; j <= M; ++j) {
						if (ableMapEven[i][j] == true) {
							++survivablePos;
						}
					}
				}
			} else {
				for (int i = 1; i <= N; ++i) {
					for (int j = 1; j <= M; ++j) {
						if (ableMapOdd[i][j] == true) {
							++survivablePos;
						}
					}
				}
			}

			//cout << survivablePos << endl;
			printf("%d\n", survivablePos);

			--T;
		}
	}

	return 0;
}
