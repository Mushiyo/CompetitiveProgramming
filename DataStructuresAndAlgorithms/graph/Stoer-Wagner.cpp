/*Filename: Stoer-Wagner.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstring>

using namespace std;

const int maxn = 505;

struct Stoer_Wagner {
	int n;
	int G[maxn][maxn];
	int b[maxn], dist[maxn];

	void init(int nn, int w[maxn][maxn]) {
		n = nn;

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				G[i][j] = w[i][j];
			}
		}
	}

	int Min_Cut_Phase(int ph, int& x, int& y) {
		int j, t;
		b[t = 1] = ph;
		//cout << b[1] << " " << b[t = 1] << " " << t << " " << ph << endl;

		for (int i = 1; i <= n; ++i) {
			if (b[i] != ph) {
				dist[i] = G[1][i];
			}
		}

		for (int i = 1; i < n; ++i) {
			x = t;

			for (t = 0, j = 1; j <= n; ++j) {
				if (b[j] != ph && (!t || dist[j] > dist[t])) {
					t = j;
				}
			}

			b[t] = ph;

			for (j = 1; j <= n; ++j) {
				if (b[j] != ph) {
					dist[j] += G[t][j];
				}
			}
		}

		return y = t, dist[t];
	}

	void Merge(int x, int y) {
		if (x > y) {
			swap(x, y);
		}

		for (int i = 1; i <= n; ++i) {
			if (i != x && i != y) {
				G[i][x] += G[i][y], G[x][i] += G[i][y];
			}

			if (y == n) {
				return;
			}

			for (int i = 1; i < n; ++i) {
				if (i != y) {
					swap(G[i][y], G[i][n]);
					swap(G[y][i], G[n][i]);
				}
			}
		}
	}

	int Min_Cut() {
		int ret = 0x3fffffff, x, y;
		memset(b, 0, sizeof(b));

		for (int i = 1; n > 1; ++i, --n) {
			cout << "ret: " << ret << endl;
			cout << "xy: " << x << " " << y << endl;
			ret = min(ret, Min_Cut_Phase(i, x, y));
			Merge(x, y);
		}


		return ret;
	}
};

int main() {
	int N = 0, M = 0;

	while (cin >> N >> M) {
		int graph[N][maxn];
		for(int i = 0; i < N; ++i){
			for(int j = 0; j < N; ++j){
				graph[i][j] = 0;
			}
		}

		int A = 0, B = 0, C = 0;

		while (M > 0) {
			cin >> A >> B >> C;

			graph[A + 1][B + 1] += C;
			graph[B + 1][A + 1] += C;

			--M;
		}

		Stoer_Wagner sw;
		sw.init(N, graph);
		int minCut = sw.Min_Cut();
		cout << minCut << endl;
	}

	return 0;
}
