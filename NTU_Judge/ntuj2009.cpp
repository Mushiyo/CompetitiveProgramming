/*Filename: ntuj2009.cpp
 *Author: Mushiyo
 */
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <climits>
#include <iostream>

using namespace std;

int main() {
	char s[10005];
	char maxS[10005];
	int maxLen = INT_MIN;
	char c;
	int index = 0;

	while (scanf("%c", &c) != EOF) {
		if (isalpha(c) || c == '-') {
			s[index] = tolower(c);
			++index;
		} else {
			int len = index - 1;
			s[index] = '\0';
			index = 0;

			string str(s);
			if (s == "E-N-D") {
				break;
			}

			//cout << str << endl;

			if (len > maxLen) {
				maxLen = len;
				strcpy(maxS, s);
			}
		}
	}

	printf("%s\n", maxS);

	return 0;
}
