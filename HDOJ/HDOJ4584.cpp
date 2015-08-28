/*Filename: hdoj4584.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

struct Point {
	int x;
	int y;
};

bool cmp(const Point& p1, const Point& p2) {
	if (p1.x == p2.x) {
		return p1.y < p2.y;
	}

	return p1.x < p2.x;
}

int countDist(Point p1, Point p2){
	return abs(p1.x - p2.x) + abs(p1.y - p2.y);
}

int main() {
	int M = 0, N = 0;

	while (cin >> M >> N) {
		if (M == 0 && N == 0) {
			break;
		}

		vector<Point> H;
		vector<Point> C;
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < N; ++j) {
				char area;
				cin >> area;

				if (area == 'H') {
					Point p;
					p.x = i;
					p.y = j;
					H.push_back(p);
				} else if (area == 'C') {
					Point p;
					p.x = i;
					p.y = j;
					C.push_back(p);
				}
			}
		}

		sort(H.begin(), H.end(), cmp);
		sort(C.begin(), C.end(), cmp);

		int minDist = 1000000000;
		Point minH;
		minH.x = H[0].x;
		minH.y = H[0].y;
		Point minC;
		minC.x = C[0].x;
		minC.y = C[0].y;

		for(int i = 0; i < H.size(); ++i){
			//int prevDist = 1000000000;

			for(int j = 0; j < C.size(); ++j){
				int currDist = countDist(H[i], C[j]);
//				if(currDist > prevDist){
//					break;
//				}
//				else{
//					prevDist = currDist;
//				}

				if(currDist < minDist){
					minDist = currDist;
					minH = H[i];
					minC = C[j];
				}
			}
		}

		cout << minH.x << " " << minH.y << " " << minC.x << " " << minC.y << endl;
	}

	return 0;
}
