/*Filename: uva10370.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>

using namespace std;

int main() {
	int C = 0;

	while (cin >> C) {
		for (int testCase = 0; testCase < C; ++testCase) {
			int N = 0;
			cin >> N;

			int grade[N];
			int sum = 0;
			for (int i = 0; i < N; ++i) {
				cin >> grade[i];
				sum += grade[i];
			}

			double avg = sum / (double) N;
			int countAboveAvg = 0;
			for (int i = 0; i < N; ++i) {
				if(grade[i] > avg){
					++countAboveAvg;
				}
			}

			printf("%.3lf%%\n", (100 * countAboveAvg) / (double)N);
		}
	}

	return 0;
}
