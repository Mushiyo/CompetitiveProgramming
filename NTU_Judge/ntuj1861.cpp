/*Filename: ntuj1861.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <string>
#include <cmath>
#include <algorithm>
#include <climits>
#include <cfloat>
#include <vector>
#include <stack>
#include <queue>

using namespace std;

int Z7LL = 0;
int charVal[26];

int hash(const char *s, int m) {
	int h = 0;
	for (int i = 0; s[i]; i++)
		h = (h * Z7LL + charVal[s[i] - 'a']) % m;
	return h;
}

int main() {
	for(int i = 1; i <= 26; ++i){
		charVal[i - 1] = i;
	}

	int T = 0;

	while (cin >> T) {
		while (T > 0) {
			string p1, p2;
			int m = 0;
			Z7LL = 0;
			cin >> p1 >> p2 >> m;

			int possible = 0;
			for(int i = 0; i < m; ++i){
				Z7LL = i;
				int h1 = hash(p1.c_str(), m);
				int h2 = hash(p2.c_str(), m);

				if(h1 == h2){
					//cout << Z7LL << " ";
					++possible;
				}
			}

			printf("%d\n", possible);

			--T;
		}
	}

	return 0;
}
