/*Filename: d006.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
	int n = 0;
	string s;

	while (cin >> n) {
		while (n > 0) {
			cin >> s;

			sort(s.begin(), s.end());

			do {
				cout << s << endl;
			} while (next_permutation(s.begin(), s.end()));
			cout << endl;

			--n;
		}
	}

	return 0;
}
