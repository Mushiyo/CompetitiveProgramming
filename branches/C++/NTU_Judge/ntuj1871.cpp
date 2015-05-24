/*Filename: ntuj1871.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <string>
#include <cstring>

using namespace std;

char cStr[100001];

bool isPalindrome(string s) {
	int halfLen = s.size() / 2;
	for (int i = 0; i < halfLen; ++i) {
		if (s[i] != s[s.size() - i - 1]) {
			return false;
		}
	}

	return true;
}

int main() {
	while (scanf("%s", &cStr) == 1) {
		string s(cStr);
		bool divideSuccessful = false;
		int halfLen = s.size() / 2;

		for (int i = 0; i < s.size(); ++i) {
			if (s[0] == s[i] && s[i + 1] == s[s.size() - 1]) {
				if (i > halfLen) {
					if (isPalindrome(s.substr(i + 1, s.size()))) {
						if (isPalindrome(s.substr(0, i + 1))) {
							divideSuccessful = true;
							break;
						}
					}
				} else {
					if (isPalindrome(s.substr(0, i + 1))) {
						if (isPalindrome(s.substr(i + 1, s.size()))) {
							divideSuccessful = true;
							break;
						}
					}
				}
			}
		}

		if (divideSuccessful) {
			printf("www\n");
		} else {
			printf("vvvvvv\n");
		}
	}

	return 0;
}
