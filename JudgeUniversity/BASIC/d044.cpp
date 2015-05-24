/*Filename: d044.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stack>

using namespace std;

int main() {
	int N = 0;

	while (cin >> N) {
		if (N == 0) {
			break;
		}

		while (true) {
			int firstCarriage = 0;
			cin >> firstCarriage;

			if (firstCarriage == 0) {
				break;
			}

			int targetOrder[N];
			targetOrder[0] = firstCarriage;
			for (int i = 1; i < N; ++i) {
				cin >> targetOrder[i];
			}

			int carriageInB = 0;
			stack<int> carriageLeaveA;
			for (int i = 1; i <= N; ++i) {
				carriageLeaveA.push(i);

				while (!carriageLeaveA.empty()
						&& targetOrder[carriageInB] == carriageLeaveA.top()) {
					carriageLeaveA.pop();
					++carriageInB;
				}
			}

			if (carriageInB == N) {
				cout << "Yes" << endl;
			} else {
				cout << "No" << endl;
			}
		}
		cout << endl;
	}
}
