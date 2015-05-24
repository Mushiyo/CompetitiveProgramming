/*Filename: ntuj0349.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <iostream>
#include <cmath>
#include <cfloat>

using namespace std;

struct Point {
	int x;
	int y;
};

const int vNum = 200;
bool inMST[vNum];
int parent[vNum];
const int NO_PARENT = -1;
Point stone[vNum];

const int start = 0;
const int end = 1;

double stoneDist(Point p1, Point p2) {
	int distX = abs(p1.x - p2.x);
	int distY = abs(p1.y - p2.y);

	return sqrt(distX * distX + distY * distY);
}

void initialize(int n) {
	for (int i = 0; i < n; ++i) {
		inMST[i] = false;
		parent[i] = NO_PARENT;
	}
}

void PrimMST(int n) {
	inMST[start] = true;

	while (inMST[end] == false) {
		int from = 0, to = 0;
		double currMinDist = DBL_MAX;

		for (int i = 0; i < n; ++i) {
			if (inMST[i]) {
				for (int j = 0; j < n; ++j) {
					if (inMST[j] == false) {
						double currDist = stoneDist(stone[i], stone[j]);

						if (currDist < currMinDist) {
							from = i;
							to = j;
							currMinDist = currDist;
						}
					}
				}
			}
		}

		inMST[to] = true;
		parent[to] = from;

		//cout << from << " " << to << " " << currMinDist << endl;
	}
}

double traceMinMaxDist() {
	double minMaxDist = DBL_MIN;

	int curr = end;
	while (curr != start) {
		double currDist = stoneDist(stone[parent[curr]], stone[curr]);

		if (currDist > minMaxDist) {
			minMaxDist = currDist;
		}

		curr = parent[curr];
	}

	return minMaxDist;
}

int main() {
	int caseNum = 1;
	int n = 0;

	while (cin >> n) {
		if (n == 0) {
			break;
		}

		initialize(n);

		for (int i = 0; i < n; ++i) {
			int x = 0, y = 0;
			cin >> x >> y;

			stone[i].x = x;
			stone[i].y = y;
		}

		PrimMST(n);

		printf("Scenario #%d\n", caseNum);
		printf("Frog Distance = %.3f\n", traceMinMaxDist());
		printf("\n");

		++caseNum;
	}

	return 0;
}
