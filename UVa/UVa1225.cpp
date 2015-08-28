/*Filename: uva1225.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>
#include <cstring>

using namespace std;

int main() {
	char numStr[6];
	int dataSetNum = 0;
	const int DIGITS = 10;

	while (cin >> dataSetNum) {
		while (dataSetNum--) {
			int N = 0;
			cin >> N;

			int countDigit[DIGITS];
			memset(countDigit, 0, sizeof(countDigit));
			for (int num = 1; num <= N; ++num) {
				sprintf(numStr, "%d", num);

				int numStrLen = strlen(numStr);
				for (int i = 0; i < numStrLen; ++i) {
					++countDigit[numStr[i] - '0'];
				}
			}

			cout << countDigit[0];
			for (int i = 1; i < DIGITS; ++i) {
				cout << " " << countDigit[i];
			}
			cout << endl;
		}
	}

	return 0;
}
