/*Filename: ntuj1840.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <iostream>
#include <string>
#include <cmath>
#include <algorithm>
#include <climits>
#include <cfloat>
#include <vector>
#include <stack>
#include <queue>

using namespace std;

const int vMax = 100000;
vector<int> graph[vMax];
int N = 0, M = 0, A = 0, B = 0, C = 0;
int isVisit[vMax];
int parent[vMax];
bool inPathAC[vMax];

void initialize(int n) {
	for (int i = 0; i < n; ++i) {
		graph[i].clear();
		isVisit[i] = 0;
		parent[i] = -1;
		inPathAC[i] = false;
	}
}

bool bfsAC() {
	bool reachC = false;

	queue<int> q;
	q.push(A);
	isVisit[A] = 2;

	while (!q.empty()) {
		int curr = q.front();
		isVisit[curr] = 2;
		q.pop();

		for (int i = 0; i < graph[curr].size(); ++i) {
			parent[graph[curr][i]] = curr;

			if (graph[curr][i] == C) {
				reachC = true;
				break;
			}

			if (graph[curr][i] != B && isVisit[graph[curr][i]] == 0) {
				q.push(graph[curr][i]);
			}
		}

		if (reachC) {
			break;
		}
	}

	return reachC;
}

void clearPath() {
	int curr = C;

	while (curr != A) {
		inPathAC[curr] = true;
		curr = parent[curr];
	}

	for (int i = 0; i < N; ++i) {
		if (inPathAC[i] == false) {
			isVisit[i] = 0;
		}
	}
}

void debug(){
	cout << "debug ";
	for(int i = 0; i < N; ++i){
		cout << parent[i] << " ";
	}
}

bool bfsCB() {
	//debug();
	clearPath();

	bool reachC = false;
	isVisit[C] = 0;

	queue<int> q;
	q.push(B);
	isVisit[B] = 2;

	while (!q.empty()) {
		int curr = q.front();
		isVisit[curr] = 2;
		q.pop();

		for (int i = 0; i < graph[curr].size(); ++i) {
			if (graph[curr][i] == C) {
				reachC = true;
				break;
			}

			if (graph[curr][i] != B && isVisit[graph[curr][i]] == 0) {
				q.push(graph[curr][i]);
			}
		}

		if (reachC) {
			break;
		}
	}

	return reachC;
}

int main() {

	while (scanf("%d %d %d %d %d ", &N, &M, &A, &B, &C) == 5) {
		initialize(N);

		--A;
		--B;
		--C;

		for (int i = 0; i < M; ++i) {
			int u = 0, v = 0;
			scanf("%d %d ", &u, &v);

			graph[u - 1].push_back(v - 1);
			graph[v - 1].push_back(u - 1);
		}

		if (bfsAC()) {
			if (bfsCB()) {
				printf("YES\n");
			} else {
				printf("NO\n");
			}

		} else {
			printf("NO\n");
		}
	}

	return 0;
}
