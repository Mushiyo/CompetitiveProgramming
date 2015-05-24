/*Filename: ntuj0685.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <stack>
#include <vector>

using namespace std;

struct Edge{
	int S;
	int T;
};

const int vNum = 1000000;
vector<int> graph[vNum];
vector<int> bridge[vNum];
int low[vNum], dfn[vNum], vis[vNum];
int childrenNum[vNum];
int parent[vNum];
stack<int> dfsStack;

int N = 0, M = 0;
vector<Edge> edges;

const int NOT_VISIT = 0;
const int IN_STACK = 1;
const int HAS_VISITED = 2;

const int NO_PARENT = -1;

void findBridge() {
	for (int i = 0; i < vNum; ++i) {
		if (vis[i] == NOT_VISIT) {
			dfsStack.push(i);
			int dep = 0;
			parent[i] = -1;
			childrenNum[i] = 0;
			vis[i] = IN_STACK;
			dfn[i] = low[i] = dep;

			while (!dfsStack.empty()) {
				//printGraph();

				int cur = dfsStack.top();
				//vis[cur] = IN_STACK;
				//dfn[cur] = dep;

				//cout << "1. " << cur << " " << dep << endl;

				int curEdgeNum = graph[cur].size();

//				cout << "cur edge# " << curEdgeNum << endl;
//				cout << "cur back: " << graph[cur].back() << endl;

				if (curEdgeNum == 0) {
					dfsStack.pop();
					--dep;

					if (low[cur] < low[parent[cur]]) {
						low[parent[cur]] = low[cur];
					}

					if (low[cur] > dfn[parent[cur]]) {
						bridge[cur].push_back(parent[cur]);
						bridge[parent[cur]].push_back(cur);
					}

					vis[cur] = HAS_VISITED;
				} else {
					int next = graph[cur][curEdgeNum - 1];
					graph[cur].pop_back();

					if (vis[next] == NOT_VISIT) {
						dfsStack.push(next);
						++dep;
						++childrenNum[cur];
						parent[next] = cur;
						vis[next] = IN_STACK;
						dfn[next] = low[next] = dep;
					}

					if (next != parent[cur] && vis[next] == IN_STACK) {
						if (dfn[next] < low[cur]) {
							low[cur] = dfn[next];
						}
					}
				}

//				if (parent[cur] != NO_PARENT) {
//					if (low[cur] < low[parent[cur]]) {
//						low[parent[cur]] = low[cur];
//					}
//
//					if (low[cur] > dfn[parent[cur]]) {
//						bridge[cur].push_back(parent[cur]);
//						bridge[parent[cur]].push_back(cur);
//					}
//				}

				//cout << "2. " << cur << " " << dep << endl;
			}
		}
	}
}

void initialize(int N) {
	edges.clear();

	while (!dfsStack.empty()) {
		dfsStack.pop();
	}

	for (int i = 0; i < N; ++i) {
		graph[i].clear();
		bridge[i].clear();
		vis[i] = 0;
		low[i] = 0;
		dfn[i] = 0;
		parent[i] = NO_PARENT;
		childrenNum[i] = 0;
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

		for(int i = 0; i < N; ++i){
			if(vis[i] == NOT_VISIT){
				findBridge();
			}
		}

		bool noBridge = true;
		for(int i = 0; i < edges.size(); ++i){
			Edge e = edges[i];

			for(int j = 0; j < bridge[e.S].size(); ++j){
				if(bridge[e.S][j] == e.T){
					noBridge = false;
					printf("%d %d\n", e.S, e.T);
				}
			}
		}

		if(noBridge){
			printf("None.\n");
		}

		isFirstCase = false;
	}

	return 0;
}
