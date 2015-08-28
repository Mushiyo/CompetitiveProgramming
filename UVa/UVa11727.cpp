/*Filename: uva11727.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

int main() {
	const int EMPLOYEE_NUM = 3;
	int employee[EMPLOYEE_NUM];
	int T = 0;

	while (cin >> T) {
		for (int caseNum = 1; caseNum <= T; ++caseNum) {
			for (int i = 0; i < EMPLOYEE_NUM; ++i) {
				cin >> employee[i];
			}

			sort(employee, employee + EMPLOYEE_NUM);

			cout << "Case " << caseNum << ": " << employee[1] << endl;
		}
	}

	return 0;
}
