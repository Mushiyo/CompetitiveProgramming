/*Filename: la6148.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <climits>

using namespace std;

struct Person {
	string name;
	int d, m, y;
};

int main() {

	int n = 0;
	while (cin >> n) {
		Person youngest;
		youngest.d = youngest.m = youngest.y = INT_MIN;

		Person oldest;
		oldest.d = oldest.m = oldest.y = INT_MAX;

		for (int i = 0; i < n; ++i) {
			Person p;
			cin >> p.name >> p.d >> p.m >> p.y;

			if (p.y > youngest.y) {
				youngest = p;
			} else if (p.y == youngest.y) {
				if (p.m > youngest.m) {
					youngest = p;
				} else if (p.m == youngest.m) {
					if (p.d > youngest.d) {
						youngest = p;
					}
				}
			}

			if (p.y < oldest.y) {
				oldest = p;
			} else if (p.y == oldest.y) {
				if (p.m < oldest.m) {
					oldest = p;
				} else if (p.m == oldest.m) {
					if (p.d < oldest.d) {
						oldest = p;
					}
				}
			}
		}

		cout << youngest.name << endl;
		cout << oldest.name << endl;
	}

	return 0;
}
