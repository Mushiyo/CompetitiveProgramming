/*Filename: uva10976.cpp
 *Author: Mushiyo
 */

#include <vector>
#include <cstdio>

using namespace std;

int main() {
	int k = 0;

	while (scanf("%d", &k) == 1) {
		int y = k + 1;
		int x = (k * y) / (y - k);

		vector<int> xList;
		vector<int> yList;

		while (x >= y) {
			if ((k * y) % (y - k) == 0) {
				xList.push_back(x);
				yList.push_back(y);
			}

			++y;
			x = (k * y) / (y - k);
		}

		printf("%d\n", xList.size());
		for (int i = 0; i < xList.size(); ++i) {
			printf("1/%d = 1/%d + 1/%d\n", k, xList[i], yList[i]);
		}
	}

	return 0;
}
