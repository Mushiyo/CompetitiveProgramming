/*Filename: a252.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <string>

using namespace std;

int find3StrLCSLen(string s1, string s2, string s3) {
	const int len1 = s1.length();
	const int len2 = s2.length();
	const int len3 = s3.length();

	if (len1 == 0 || len2 == 0 || len3 == 0) {
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

	string s1;
	while (getline(cin, s1)) {
		string s2, s3;
		getline(cin, s2);
		getline(cin, s3);

		cout << find3StrLCSLen(s1, s2, s3) << endl;
	}

	return 0;
}
