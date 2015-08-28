/*Filename: ntuj1949.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstring>
#include <climits>
#include <cmath>

using namespace std;

const int maxR = 50 + 2;
const int maxC = 50 + 2;
char gameBoard[maxR][maxC];

const int maxNode = 50 * 50;
int N = 0;
int graph[maxNode][maxNode];

void floyd() {
	//cout << "f" << endl;

	for (int k = 0; k < N; ++k) {
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				//cout << i << " " << j << " " << k << endl;
				graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j]);
			}
		}
	}

	//cout << "end f" << endl;
}

void printGraph(){
	for(int i = 0; i < N; ++i){
		for(int j = 0; j < N; ++j){
			cout << graph[i][j];
		}
		cout << endl;
	}
}

int main() {
	int R = 0, C = 0;

	while (cin >> R >> C) {
		N = R * C;
		memset(gameBoard, 'X', sizeof(gameBoard));
		memset(graph, 100000, sizeof(graph));

		//printGraph();

		for (int i = 1; i <= R; ++i) {
			for (int j = 1; j <= C; ++j) {
				cin >> gameBoard[i][j];
			}
		}

		for (int i = 1; i <= R; ++i) {
			for (int j = 1; j <= C; ++j) {
				if (gameBoard[i][j] == '.') {
					int currNodeID = C * (i - 1) + (j - 1);

					if (gameBoard[i - 1][j] == '.') {
						graph[currNodeID][currNodeID - C] = -1;
						graph[currNodeID - C][currNodeID] = -1;
					}

					if (gameBoard[i][j - 1] == '.') {
						graph[currNodeID][currNodeID - 1] = -1;
						graph[currNodeID - 1][currNodeID] = -1;
					}
				}
			}
		}
		//printGraph();

		floyd();

		printGraph();

		int min = INT_MAX;
		for(int i = 0; i < N; ++i){
			for(int j = 0; j < N; ++j){
				if(graph[i][j] < min){
					min = graph[i][j];
				}
			}
		}

		int longestPathLen = abs(min);
		cout << "long:" << longestPathLen << endl;

		if(longestPathLen % 2 == 0){
			cout << "2" << endl;
		}
		else{
			cout << "1" << endl;
		}

//        for(int i = 0; i < maxR; ++i){
//        	for(int j = 0; j < maxC; ++j){
//        		cout << gameBoard[i][j];
//        	}
//        	cout << endl;
//        }

//        for(int i = 1; i <= R; ++i){
//			for (int j = 1; j <= C; ++j) {
//				cout << gameBoard[i][j];
//			}
//			cout << endl;
//		}
//        cout << endl;

	}

	return 0;
}
