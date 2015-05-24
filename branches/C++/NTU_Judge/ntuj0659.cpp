/*Filename: ntuj0659.cpp
 *Author: Mushiyo
 */
#include <stdio.h>
#include <vector>

using namespace std;

struct Edge {
	int S;
	int T;
};

const int vNum = 1000000;
vector<int> graph[vNum];
vector<int> bridge[vNum];
int low[vNum], dfn[vNum], vis[vNum];

int N = 0, M = 0;
vector<Edge> edges;

void initialize(int size) {
	edges.clear();

	for (int i = 0; i < size; ++i) {
		graph[i].clear();
		bridge[i].clear();
		vis[i] = 0;
	}
}

void findBridge(int cur, int father, int dep) {
	vis[cur] = 1;
	dfn[cur] = low[cur] = dep;

	for (int i = 0; i < graph[cur].size(); ++i) {
		int T = graph[cur][i];

		if (T != father && 1 == vis[T]) {
			if (dfn[T] < low[cur]) {
				low[cur] = dfn[T];
			}
		}
		if (0 == vis[T]) {
			findBridge(T, cur, dep + 1);

			if (low[T] < low[cur]) {
				low[cur] = low[T];
			}

			if (low[T] > dfn[cur]) {
				bridge[cur].push_back(T);
				bridge[T].push_back(cur);
			}
		}
	}
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

		initialize(N);

		while (M > 0) {
			Edge e;
			scanf("%d %d ", &e.S, &e.T);

			graph[e.S].push_back(e.T);
			graph[e.T].push_back(e.S);
			edges.push_back(e);

			--M;
		}
		scanf(" "); // eat change line

		for (int i = 0; i < N; ++i) {
			if (vis[i] == 0) {
				findBridge(i, -1, 0);
			}
		}

		bool noBridge = true;
		for (int i = 0; i < edges.size(); ++i) {
			Edge e = edges[i];

			for (int j = 0; j < bridge[e.S].size(); ++j) {
				if (bridge[e.S][j] == e.T) {
					noBridge = false;
					printf("%d %d\n", e.S, e.T);
				}
			}
		}

		if (noBridge) {
			printf("None.\n");
		}

		isFirstCase = false;
	}

	return 0;
}
