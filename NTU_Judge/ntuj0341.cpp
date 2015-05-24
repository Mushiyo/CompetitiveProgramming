/*Filename: ntuj0341.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

struct Point {
	int x;
	int y;
};

int T = 0;
int n = 0;
Point island[75000];
Point tmp[75000];

bool compareLessX(const Point& p1, const Point& p2) {
	if(p1.x == p2.x){
		return p1.y > p2.y;
	}

	return p1.x < p2.x;
}

bool compareGreaterY(const Point& p1, const Point& p2) {
	return p1.y > p2.y;
}

// [head, end)
long long countPair(int head, int end) {
	//cout << "countPair( " << head << ", " << end << ")" << endl;

	if (head >= end) {
		return 0;
	}

	if (end - head == 2) {
//		cout << "island1: ( " << island[head].x << ", " << island[head].y << ")"
//				<< endl;
//		cout << "island2: ( " << island[head + 1].x << ", "
//				<< island[head + 1].y << ")" << endl;
		if (island[head].y >= island[head + 1].y) {
			return 1;
		} else {
			swap(island[head], island[head + 1]);

			if (island[head].x <= island[head + 1].x) {
				return 1;
			} else {
				return 0;
			}
		}
	} else {
		int middle = (head + end) / 2;
		long long pairL = 0, pairR = 0;

		if (middle - head > 1) {
			pairL = countPair(head, middle);
		}

		if (end - middle > 1) {
			pairR = countPair(middle, end);
		}

		int lPtr = head;
		int rPtr = middle;
		long long pairCross = 0;

		for (int i = head; i < end; ++i) {
			if ((island[lPtr].y >= island[rPtr].y || rPtr >= end)
					&& lPtr < middle) {
				tmp[i] = island[lPtr];
				++lPtr;
				pairCross += end - rPtr;
			} else {
				tmp[i] = island[rPtr];
				++rPtr;
			}
		}

		for (int i = head; i < end; ++i) {
			island[i] = tmp[i];
			//cout << "( " << island[i].x << ", " << island[i].y << ")" << endl;
		}

//		cout << "pairL: " << pairL << "; pairR: " << pairR << "; pairCross: "
//				<< pairCross << endl;
		return pairL + pairR + pairCross;
	}
}

int main() {

	while (cin >> T) {
		while (T > 0) {
			cin >> n;

			for (int i = 0; i < n; ++i) {
				cin >> island[i].x >> island[i].y;
			}

			sort(island, island + n, compareLessX);
			//cout << "sort done." << endl;

//    		for(int i = 0; i < n; ++i){
//    			cout << island[i].x << " " << island[i].y << endl;
//    		}

			cout << countPair(0, n) << endl;

			--T;
		}
	}

	return 0;
}
