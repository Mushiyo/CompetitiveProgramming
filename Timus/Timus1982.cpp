/*Filename: timus1982.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <climits>

using namespace std;

int n = 0, k = 0;
const int MAX_SIZE = 100;
int graph[MAX_SIZE][MAX_SIZE];
bool inTree[MAX_SIZE];
int nodeInTree = 0;
int cost = 0;

void init() {
	nodeInTree = 0;
	cost = 0;

	for (int i = 0; i < MAX_SIZE; ++i) {
		inTree[i] = false;
	}
}

void primMST() {
	while (nodeInTree < n) {
		int currMinCost = INT_MAX;
		int currMinNode = 0;

		for (int i = 0; i < n; ++i) {
			if (inTree[i]) {
				for (int j = 0; j < n; ++j) {
					if (inTree[j]) {
						continue;
					}

					if (graph[i][j] < currMinCost) {
						currMinCost = graph[i][j];
						currMinNode = j;
					}
				}
			}

		}

		inTree[currMinNode] = true;
		cost += currMinCost;
		++nodeInTree;
	}
}

void printGraph() {
	for (int i = 0; i < n; ++i) {
		for (int j = 0; j < n; ++j) {
			cout << graph[i][j] << " ";
		}
		cout << endl;
	}
}

int main() {

	while (cin >> n >> k) {
		init();

		nodeInTree = k;
		for (int i = 0; i < k; ++i) {
			int powerSite = 0;
			cin >> powerSite;

			inTree[powerSite - 1] = true;
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				cin >> graph[i][j];
			}
		}

		primMST();

		cout << cost << endl;
	}

	return 0;
}
