/*Filename: uva10004.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>
#include <cstring>

using namespace std;

const int SIZE = 200;
vector<int> graph[SIZE];
int color[SIZE];
const int RED = 1;
const int BLACK = -1;
const int NO_COLOR = 0;

int n = 0;

void init() {
	memset(color, NO_COLOR, sizeof(color));

	for (int i = 0; i < n; ++i) {
		graph[i].clear();
	}
}

bool dfs(int node, int c) {
	color[node] = c;

	for (int i = 0; i < graph[node].size(); ++i) {
		int neighbor = graph[node][i];

		if (color[neighbor] == c) {
			return false;
		} else if (color[neighbor] == NO_COLOR) {
			bool isBicolorable = dfs(neighbor, -c);

			if (isBicolorable == false) {
				return false;
			}
		}
	}

	return true;
}

int main() {

	while (cin >> n) {
		if (n == 0) {
			break;
		}

		init();

		int l = 0;
		cin >> l;

		for (int i = 0; i < l; ++i) {
			int u = 0, v = 0;
			cin >> u >> v;

			graph[u].push_back(v);
			graph[v].push_back(u);
		}

		bool isBicolorable = true;
		for (int i = 0; i < n && isBicolorable; ++i) {
			if (color[i] == NO_COLOR) {
				isBicolorable = dfs(i, RED);
			}
		}

		if (isBicolorable) {
			cout << "BICOLORABLE." << endl;
		} else {
			cout << "NOT BICOLORABLE." << endl;
		}
	}

	return 0;
}
