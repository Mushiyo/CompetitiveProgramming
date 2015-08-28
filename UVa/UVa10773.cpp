/*Filename: uva10773.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

double countDiff(double d, double v, double u) {
	return d / sqrt(u * u - v * v) - d / u;
}

int main() {
	int testCase = 0;
	cin >> testCase;

	for (int t = 1; t <= testCase; ++t) {
		double d, v, u;
		cin >> d >> v >> u;

		if (u <= v || v == 0) {
			printf("Case %d: can't determine\n", t);
		} else {
			printf("Case %d: %.3f\n", t, countDiff(d, v, u));
		}
	}

	return 0;
}
