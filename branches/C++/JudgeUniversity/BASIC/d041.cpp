/*Filename: d041.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <cstring>

using namespace std;

//return if c1 < c2
bool lexicographicalCmp(const char &c1, const char &c2) {
	char lowerC1 = tolower(c1);
	char lowerC2 = tolower(c2);

	if (lowerC1 == lowerC2) {
		if (c1 >= 'a' && c2 < 'a') { // c1 between a - z, c2 between A - Z
			return true;
		} else {
			return false;
		}
	}

	return lowerC1 < lowerC2;
}

int main() {
	string s;

	while (getline(cin, s)) {
		int len = s.size();

		if (len == 0) {
			printf("\n");
			continue;
		}

		sort(s.begin(), s.end(), lexicographicalCmp);

		printf("%s\n", s.c_str());
	}

	return 0;
}
