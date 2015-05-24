/*Filename: 1.2.1.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	int T = 0;
	string s;
	while (cin >> T) {
		getline(cin, s); // eat change line

		while (T > 0) {
			getline(cin, s);
			istringstream iss(s);

			string token;
			iss >> token;

			for (int i = token.size() - 1; i >= 0; --i) {
				cout << token[i];
			}

			while (iss >> token) {
				cout << " ";
				for (int i = token.size() - 1; i >= 0; --i) {
					cout << token[i];
				}
			}
			cout << endl;

			--T;
		}
	}

	return 0;
}
