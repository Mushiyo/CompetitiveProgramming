/*Filename: ntuj1977.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <iostream>
#include <string>
#include <cstring>

using namespace std;

bool isPalindrom(string a, string b) {
	string s = a + b;
	int halfLen = s.size();

	for (int i = 0, j = s.size() - 1; i < halfLen; ++i, --j) {
		if (s[i] != s[j]) {
			return false;
		}
	}

	return true;
}

int main() {
	int T = 0;

	while (scanf("%d", &T) == 1) {
		int caseNum = 1;
		while (T > 0) {
			int N = 0;
			scanf("%d ", &N);

			string words[N];
			char tmp[500];
			for (int i = 0; i < N; ++i) {
				scanf("%s", &tmp);
				words[i] = string(tmp);
			}

			int countPerfect = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					if (i == j) {
						continue;
					} else {
						if (isPalindrom(words[i], words[j])) {
							++countPerfect;
						}
					}

				}
			}

			printf("Case #%d: %d\n", caseNum, countPerfect);

			++caseNum;
			--T;
		}
	}

	return 0;
}

