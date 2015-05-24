/*Filename: ntuj0660.cpp
 *Author: Mushiyo
 */

#include <cstring>
#include <stdio.h>
#include <iostream>
#include <vector>

using namespace std;

const int vNum = 1000000;
vector<int> graph[vNum];
vector<int> reverseGraph[vNum];
vector<int> vs;
bool visited[vNum];
int cmp[vNum];

int N = 0, M = 0;

void initializeVisited() {
	for (int i = 0; i < N; ++i) {
		visited[i] = false;
	}
}

void initialize() {
	vs.clear();
	initializeVisited();

	for (int i = 0; i < N; ++i) {
		graph[i].clear();
		reverseGraph[i].clear();
		cmp[i] = 0;
	}
}

void dfs(int v) {
	visited[v] = true;

	for (int i = 0; i < graph[v].size(); ++i) {
		if (visited[graph[v][i]] == false) {
			dfs(graph[v][i]);
		}
	}

	vs.push_back(v);
}

void reverseDfs(int v, int k) {
	visited[v] = true;
	cmp[v] = k;

	for (int i = 0; i < reverseGraph[v].size(); ++i) {
		if (visited[reverseGraph[v][i]] == false) {
			reverseDfs(reverseGraph[v][i], k);
		}
	}
}

int countSCC() {
	for (int i = 0; i < N; ++i) {
		if (visited[i] == false) {
			dfs(i);
		}
	}

	initializeVisited();

	int SCCNum = 0;
	for (int i = vs.size() - 1; i >= 0; --i) {
		if (!visited[vs[i]]) {
			reverseDfs(vs[i], SCCNum++);
		}
	}

	return SCCNum;
}

int main() {
	bool isFirstCase = true;

	while (scanf("%d %d ", &N, &M) == 2) {
		if (N == 0 && M == 0) {
			break;
		}

		if (!isFirstCase) {
			printf("\n");
		}

		initialize();

		while (M > 0) {
			int S = 0, T = 0;
			scanf("%d %d ", &S, &T);

			graph[S].push_back(T);
			reverseGraph[T].push_back(S);

			--M;
		}
		scanf(" "); // eat change line

		printf("%d\n", countSCC());
	}

	return 0;
}
