/*Filename: findBridgeWithAdjacencyList&stack.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>
#include <stack>

using namespace std;

const int vNum = 4;

vector<int> graph[vNum];
vector<int> bridge[vNum];
int low[vNum], dfn[vNum], vis[vNum];
int parent[vNum];
int childrenNum[vNum];
stack<int> dfsStack;

const int NOT_VISIT = 0;
const int IN_STACK = 1;
const int HAS_VISITED = 2;

const int NO_PARENT = -1;

void printGraph() {
	for (int i = 0; i < vNum; ++i) {
		for (int j = 0; j < graph[i].size(); ++j) {
			cout << graph[i][j] << " ";
		}
		cout << endl;
	}
}

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

void initialize() {
	while (!dfsStack.empty()) {
		dfsStack.pop();
	}

	for (int i = 0; i < vNum; ++i) {
		graph[i].clear();
		vis[i] = 0;
		low[i] = 0;
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

	//printGraph();

	findBridge();

	cout << "  Vertex#: ";
	for (int i = 0; i < vNum; ++i) {
		cout << i << " ";
	}
	cout << endl;

	cout << "DFS depth: ";
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

	cout << "      low: ";
	for (int i = 0; i < vNum; ++i) {
		cout << low[i] << " ";
	}
	cout << endl;

	return 0;
}

