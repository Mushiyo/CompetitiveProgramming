/*Filename: dfsWithAdjacencyList&stack.cpp
 *Author: Mushiyo
 *Usage: Demonstrate how to do DFS without recursion in adjacency list
 */

#include <iostream>
#include <vector>
#include <stack>

using namespace std;

const int vNum = 4;

vector<int> graph[vNum];
int low[vNum], dfn[vNum], vis[vNum];
int parent[vNum];
int childrenNum[vNum];
stack<int> dfsStack;

const int NOT_VISIT = 0;
const int IN_STACK = 1;
const int HAS_VISITED = 2;

const int NO_PARENT = -1;

void dfs() {
	for (int i = 0; i < vNum; ++i) {
		if (vis[i] == NOT_VISIT) {
			dfsStack.push(i);
			int dep = 0;
			parent[i] = -1;
			childrenNum[i] = 0;

			while (!dfsStack.empty()) {
				int cur = dfsStack.top();
				vis[cur] = IN_STACK;
				dfn[cur] = dep;

				int curEdgeNum = graph[cur].size();

				if (curEdgeNum == 0) {
					dfsStack.pop();
					--dep;
					vis[cur] = HAS_VISITED;
				} else {
					int next = graph[cur][curEdgeNum - 1];
					graph[cur].pop_back();

					if (vis[next] == NOT_VISIT) {
						dfsStack.push(next);
						++dep;
						++childrenNum[cur];
						parent[next] = cur;
						graph[cur].pop_back();
					}
				}
			}
		}
	}
}

void initialize() {
	while (!dfsStack.empty()) {
		dfsStack.pop();
	}

	for (int i = 0; i < vNum; ++i) {
		graph[i].clear();
		vis[i] = 0;
		parent[i] = NO_PARENT;
		childrenNum[i] = 0;
	}
}

void buildGraph() {
	graph[0].push_back(1);
	graph[1].push_back(0);
	graph[0].push_back(2);
	graph[2].push_back(0);
	graph[1].push_back(2);
	graph[2].push_back(1);
	graph[1].push_back(3);
	graph[3].push_back(1);
}

int main() {
	initialize();

	buildGraph();

	dfs();

	cout << "  Vertex#: ";
	for (int i = 0; i < vNum; ++i) {
		cout << i << " ";
	}
	cout << endl;

	cout << "DFS order: ";
	for (int i = 0; i < vNum; ++i) {
		cout << dfn[i] << " ";
	}
	cout << endl;

	cout << "  Parent: ";
	for (int i = 0; i < vNum; ++i) {
		cout << parent[i] << " ";
	}
	cout << endl;

	cout << "Children#: ";
	for (int i = 0; i < vNum; ++i) {
		cout << childrenNum[i] << " ";
	}
	cout << endl;

	return 0;
}
