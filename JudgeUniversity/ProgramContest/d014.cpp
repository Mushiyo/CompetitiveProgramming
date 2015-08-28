/*Filename: d014.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <string>

using namespace std;

int main() {
	int n;

	while (cin >> n) {
		string s;
		getline(cin, s); //eat empty line

		while (n > 0) {
			while (getline(cin, s)) {
				char ans[s.size()][s.size()];

				for (int i = 1; i < s.size() - 1; ++i) {
					for (int j = 1; j < s.size() - 1; ++j) {
						ans[i][j] = ' ';
					}
				}

				for (int i = 0; i < s.size(); ++i) {
					ans[0][i] = s[i];
					ans[i][0] = s[i];
					ans[s.size() - 1][s.size() - i - 1] = s[i];
					ans[s.size() - i - 1][s.size() - 1] = s[i];
				}

				for (int i = 0; i < s.size(); ++i) {
					for (int j = 0; j < s.size(); ++j) {
						cout << ans[i][j];
					}
					cout << endl;
				}
				cout << endl;
			}

			--n;
		}
	}

	return 0;
}
