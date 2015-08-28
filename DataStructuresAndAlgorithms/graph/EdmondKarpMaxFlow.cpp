/*Filename: EdmondKarpMaxFlow.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <queue>
#include <climits>
#include <cmath>

using namespace std;

const int NO_PARENT = -1;
const int vNum = 100;
int graph[vNum + 1][vNum + 1];
int parent[vNum + 1];
bool isVisited[vNum + 1];
int N = 0;

void initializeParent() {
	for (int i = 1; i <= N; ++i) {
		parent[i] = NO_PARENT;
	}
}

void initializeIsVisited() {
	for (int i = 1; i <= N; ++i) {
		isVisited[i] = false;
	}
}

void initialize() {
	initializeIsVisited();
	initializeParent();

	for (int i = 1; i <= N; ++i) {
		for (int j = 1; j <= N; ++j) {
			graph[i][j] = 0;
		}
	}
}

void printGraph(){
	for(int i = 1; i <= N; ++i){
		for(int j = 1; j <= N; ++j){
			cout << graph[i][j] << " ";
		}
		cout << endl;
	}

	cout << endl;
}

bool BFSFindAugmentingPath(int start, int end) {
	initializeIsVisited();
	initializeIsVisited();

	queue<int> q;

	q.push(start);
	isVisited[start] = true;

	while (q.empty() == false) {
		int current = q.front();
		q.pop();

		//cout << current << endl;

		if (current == end) {
			//cout << endl;

			return true;
		}

		for (int i = 1; i <= N; ++i) {

			if (graph[current][i] > 0) {
				if (isVisited[i] == false) {
					isVisited[i] = true;
					parent[i] = current;
					q.push(i);
				}
			}
		}
	}



	return false;
}

int EdmondsKarpMaxFlow(int start, int end){
	int maxFlow = 0;

	while(BFSFindAugmentingPath(start, end)){
		int expandFlow = INT_MAX;
		int current = end;

		while(current != start){
			expandFlow = min(expandFlow, graph[parent[current]][current]);
			//cout << "( " << parent[current] << ", " << current << ") " << expandFlow << endl;

			current = parent[current];
		}

		maxFlow += expandFlow;
		current = end;
		while(current != start){
			//printGraph();

			graph[parent[current]][current] -= expandFlow;
			graph[current][parent[current]] += expandFlow;

			//printGraph();

			current = parent[current];
		}
	}

	return maxFlow;
}

int main() {
	int caseNum = 1;

	while (cin >> N) {
		if(N == 0){
			break;
		}

		int s = 0, t = 0, c = 0;
		cin >> s >> t >> c;
		initialize();

		for (int i = 0; i < c; ++i) {
			int u = 0, v = 0, capcity = 0;
			cin >> u >> v >> capcity;

			graph[u][v] += capcity;
			graph[v][u] += capcity;
		}

		cout << "Network " << caseNum << endl;
		cout << "The bandwidth is " << EdmondsKarpMaxFlow(s, t) << "." << endl;
		cout << endl;

		++caseNum;
	}

	return 0;
}
