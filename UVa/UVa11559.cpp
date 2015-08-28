/*Filename: uva11559.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <climits>

using namespace std;

int main() {
	int N = 0, B = 0, H = 0, W = 0;

	while (cin >> N >> B >> H >> W) {
		bool isStayHome = true;
		int minCost = INT_MAX;

		for (int h = 0; h < H; ++h) {
			int P = 0;
			cin >> P;

			int a[W];
			for (int i = 0; i < W; ++i) {
				cin >> a[i];

				if (a[i] >= N) {
					int cost = N * P;

					if (cost <= B) {
						isStayHome = false;

						if (cost < minCost) {
							minCost = cost;
						}
					}
				}
			}
		}

		if (isStayHome) {
			cout << "stay home" << endl;
		} else {
			cout << minCost << endl;
		}
	}

	return 0;
}
