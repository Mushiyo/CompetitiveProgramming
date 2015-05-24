/*Filename: uva11289.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>

using namespace std;

int main() {
	const string one = "one";
	const string two = "two";
	int wordNum = 0;

	while (cin >> wordNum) {
		while (wordNum > 0) {
			string word;
			cin >> word;

			if (word.length() == 5) { // only three is 5 digits
				cout << 3 << endl;
			} else {
				int diff1 = 0;
				for (int i = 0; i < one.length(); ++i) {
					if (word[i] != one[i]) {
						++diff1;
					}
				}

				int diff2 = 0;
				for (int i = 0; i < two.length(); ++i) {
					if (word[i] != two[i]) {
						++diff2;
					}
				}

				if (diff1 <= diff2) {
					cout << 1 << endl;
				} else {
					cout << 2 << endl;
				}
			}

			--wordNum;
		}
	}

	return 0;
}
