/*Filename: d074.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <sstream>
#include <string>
#include <cctype>

using namespace std;

int main() {
	string s;

	while (getline(cin, s)) {
		istringstream iss(s.substr(1, s.size() - 2));
		string token;

		bool isFirstToken = true;
		cout << "{";
		while (getline(iss, token, ',')) {
			if (isFirstToken == false) {
				cout << ",";
			} else {
				isFirstToken = false;
			}

			if (isdigit(token[0])) {
				cout << token;
			} else {
				for (int i = token.size() - 1; i >= 0; --i) {
					cout << token[i];
				}
			}
		}
		cout << "}" << endl;

	}

	return 0;
}
