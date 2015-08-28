/*Filename: uva410_sol1.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>

using namespace std;

int main() {
	const int MAX_S = 10;
	int specimen[MAX_S];
	int setNum = 1;
	int C = 0, S = 0;

	while (cin >> C >> S) {
		int C2 = 2 * C;
		int totalMass = 0;

		memset(specimen, 0, sizeof(specimen));

		for (int i = 0; i < S; ++i) {
			cin >> specimen[i];
			totalMass += specimen[i];
		}
		sort(specimen, specimen + C2);

		double AM = (double)totalMass / C;
		double imbalance = 0;
		printf("Set #%d\n", setNum);
		for (int i = 0; i < C; ++i) {
			printf("%2d:", i);
			int CM = 0;

			if (specimen[i] > 0) {
				printf(" %d", specimen[i]);
				CM += specimen[i];
			}

			if (specimen[C2 - i - 1] > 0) {
				printf(" %d", specimen[C2 - i - 1]);
				CM += specimen[C2 - i - 1];
			}
			printf("\n");

			imbalance += abs(AM - CM);
		}

		printf("IMBALANCE = %.5f\n", imbalance);
		printf("\n");

		++setNum;
	}

	return 0;
}
