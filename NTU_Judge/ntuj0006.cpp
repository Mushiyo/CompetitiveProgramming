/*Filename: ntuj0006.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <string>
#include <cstring>
#include <vector>
#include <algorithm>

using namespace std;

bool compareByGreaterLength(const string& s1, const string& s2) {
	return s1.length() > s2.length();
}

int maxLCSLen = 0;
int find3StrLCSLen(string s1, string s2, string s3) {
	const int len1 = s1.length();
	const int len2 = s2.length();
	const int len3 = s3.length();

	if (len1 == 0 || len2 == 0 || len3 == 0) {
		return 0;
	}

	if (len1 < maxLCSLen || len2 < maxLCSLen || len3 < maxLCSLen) {
		return 0;
	}

	int c[len1 + 1][len2 + 1][len3 + 1];

	for (int i = 0; i <= len1; ++i) {
		for (int j = 0; j <= len2; ++j) {
			c[i][j][0] = 0;
		}
	}

	for (int j = 0; j <= len2; ++j) {
		for (int k = 0; k <= len3; ++k) {
			c[0][j][k] = 0;
		}
	}

	for (int i = 0; i <= len1; ++i) {
		for (int k = 0; k <= len3; ++k) {
			c[i][0][k] = 0;
		}
	}

	for (int i = 1; i <= len1; ++i) {
		for (int j = 1; j <= len2; ++j) {
			for (int k = 1; k <= len3; ++k) {
				c[i][j][k] = c[i - 1][j][k];

				if (c[i][j - 1][k] > c[i][j][k]) {
					c[i][j][k] = c[i][j - 1][k];
				}

				if (c[i][j][k - 1] > c[i][j][k]) {
					c[i][j][k] = c[i][j][k - 1];
				}

				if (s1[i - 1] == s2[j - 1] && s2[j - 1] == s3[k - 1]) {
					if (c[i - 1][j - 1][k - 1] + 1 > c[i][j][k]) {
						c[i][j][k] = c[i - 1][j - 1][k - 1] + 1;
					}
				}
			}
		}
	}

	return c[len1][len2][len3];
}

int main() {
	int n = 0;

	while (cin >> n) {
		vector<string> strings;
		maxLCSLen = 0;

		string tmp;
		getline(cin, tmp); // eat change line

		while (n > 0) {
			string s;
			getline(cin, s);

			strings.push_back(s);

			--n;
		}

		sort(strings.begin(), strings.end(), compareByGreaterLength);

//		for (int i = 0; i < strings.size(); ++i) {
//			cout << strings[i] << endl;
//		}

		for (int i = 0; i < strings.size(); ++i) {
			for (int j = i + 1; j < strings.size(); ++j) {
				for (int k = j + 1; k < strings.size(); ++k) {
					int currentLCSLen = find3StrLCSLen(strings[i], strings[j],
							strings[k]);

					//cout << i << " " << j << " " << k << " " << currentLCSLen << endl;

					if (currentLCSLen > maxLCSLen) {
						maxLCSLen = currentLCSLen;
					}
				}
			}
		}

		//cout << find3StrLCSLen(strings[0], strings[1], strings[2]) << endl;
		cout << maxLCSLen << endl;
	}

	return 0;
}
