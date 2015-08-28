/*Filename: uva410_sol2.cpp
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
		int totalMass = 0;

		for (int i = 0; i < S; ++i) {
			cin >> specimen[i];
			totalMass += specimen[i];
		}
		sort(specimen, specimen + S);

		double AM = (double) totalMass / C;
		double imbalance = 0;
		printf("Set #%d\n", setNum);
		for (int i = S - C, j = i - 1; i < S; ++i, --j) {
			printf("%2d:", i - (S - C));
			int CM = 0;

			if (j >= 0) {
				printf(" %d", specimen[j]);
				CM += specimen[j];
			}

			if(i >= 0){
				printf(" %d", specimen[i]);
				CM += specimen[i];
			}
			imbalance += abs(AM - CM);

			printf("\n");
		}

		printf("IMBALANCE = %.5f\n", imbalance);
		printf("\n");

		++setNum;
	}

	return 0;
}
