/*Filename: ntuj1970.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <climits>

using namespace std;

int main() {
	int T = 0;

	while (cin >> T) {
		int caseNum = 1;

		while (T > 0) {
			int int5[5];
			int sumCurr = 0;

			for (int i = 0; i < 5; ++i) {
				cin >> int5[i];
				sumCurr += int5[i];
			}

			int M = 0;
			cin >> M;

			int sumPrev = INT_MIN;
			int r = 0;
			bool notFound = false;

			while (sumCurr < M) {
				if (sumCurr <= sumPrev) {
					notFound = true;
					break;
				} else {
					sumPrev = sumCurr;
					sumCurr *= 2;
					++r;
				}
			}

			cout << "Case #" << caseNum << ": ";
			if (notFound) {
				cout << "-1" << endl;
			} else {
				cout << r << endl;
			}

			++caseNum;
			--T;
		}
	}

	return 0;
}

