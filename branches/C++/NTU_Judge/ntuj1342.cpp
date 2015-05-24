/*Filename: ntuj1342.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <iostream>
#include <cmath>
#include <string>

using namespace std;

long long countBFCmp(string s) {
	int an[s.size()];
	an[0] = 0;
//	for(int i = 0; i < s.size(); ++i){
//		an[i] = 0;
//	}

	long long countCmp = 0;

	for (int i = 1; i < s.size(); ++i) {
		int k = 0;

		while (i + k < s.size()) {
			++countCmp;

			if (s[k] == s[i + k]) {
				++k;
			} else {
				break;
			}
		}

//		if (k > 0) {
//			cout << "BF lcp: " << s.substr(i, i + k) << endl;
//		}

		an[i] = k;
	}

//	cout << "BF: ";
//	for (int i = 0; i < s.size(); ++i) {
//		cout << an[i] << " ";
//	}
//	cout << endl;

	return countCmp;
}

long long countBF = 0;
long long countFast = 0;
void sol(string s) {
	countFast = 0;

	int an[s.size()];
	for (int i = 0; i < s.size(); ++i) {
		an[i] = 0;
	}

	int wl = 0, ws = 0;

	for (int i = 1; i < s.size(); ++i) {
		int k = 0;

		if (i > wl + ws - 1) {
			k = 0;
		} else {
			//cout << i << " " << wl << " @ ";
			//cout << an[i - wl] << " " << wl + ws - i << endl;
//			cout << s.substr(i - wl, i - wl + an[i - wl]) << " "
//					<< s[wl + ws - i] << endl;
			k = min(an[i - wl], wl + ws - i);
		}

		//cout << "Fast i: " << i << " k: " << k << endl;

		bool firstWhileLoop = true;
		while (i + k < s.size()) {
//			if(firstWhileLoop){
//				countBF += k;
//
//				firstWhileLoop = false;
//			}

			++countFast;
			//++countBF;

			if (s[k] == s[i + k]) {
				++k;
			} else {
				break;
			}
		}

		an[i] = k;

		if (i + k > wl + ws) {
			//cout << "i k wl ws" << endl;
			//cout << i << " " << k << "  " << wl << " " << ws << endl;

			wl = i;
			ws = k;
		}

//		if (k > 0) {
//			cout << "Fast lcp: " << s.substr(i, i + k) << endl;
//		}
	}

//	cout << "Fast: ";
//	for (int i = 0; i < s.size(); ++i) {
//		cout << an[i] << " ";
//	}
//	cout << endl;

	countBF = s.size() - 1;
	for (int i = 1; i < s.size(); ++i) {
		if (an[i] > 0) {
			countBF += an[i];
		}

		if(i + an[i] >= s.size()){
			--countBF;
		}
	}
}

int main() {
	int T = 0;

	while (cin >> T) {
		while (T > 0) {
			string s;
			cin >> s;

			sol(s);

			//cout << s.size() << endl;
			printf("%lld %lld\n", countBF, countFast);
			//cout << countBF << endl;

			--T;
		}
	}

	return 0;
}
