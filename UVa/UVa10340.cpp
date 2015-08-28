/*Filename: uva10340.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main() {
	string s, t;

	while (cin >> s >> t) {
		int matchedChar = 0;
		bool isSubOfT = false;

		for (int i = 0; i < t.size(); ++i) {
			if (s[matchedChar] == t[i]) {
				++matchedChar;
			}

			if (matchedChar == s.size()) {
				isSubOfT = true;
				break;
			}
		}

		if (isSubOfT) {
			cout << "Yes" << endl;
		} else {
			cout << "No" << endl;
		}

	}

	return 0;
}
