//WA

/*Filename: ntuj1414.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <algorithm>
#include <vector>
#include <cfloat>
#include <cmath>

using namespace std;

struct Point {
	int x;
	int y;
};

const int pNum = 100;
const int start = 0;
int n = 0, top = 0;
int res[pNum];
Point beacon[pNum];
vector<Point> convexHullVertex;

bool cmp(const Point& a, const Point& b) {
	if (a.y == b.y) {
		return a.x < b.x;
	}

	return a.y < b.y;
}

bool mult(Point sp, Point ep, Point op) {
	return (sp.x - op.x) * (ep.y - op.y) >= (ep.x - op.x) * (sp.y - op.y);
}

void Graham_Scan() {
	int len;
	top = 1;

	sort(beacon, beacon + n, cmp);

	if (n == 0) {
		return;
	}

	res[0] = 0;

	if (n == 1) {
		return;
	}

	res[1] = 1;

	if (n == 2) {
		return;
	}

	res[2] = 2;

	for (int i = 2; i < n; ++i) {
		while (top && mult(beacon[i], beacon[res[top]], beacon[res[top - 1]])) {
			--top;
		}

		res[++top] = i;
	}

//	for (int s = 0; s < top; ++s) {
//		cout << res[s] << " ";
//	}
//	cout << endl;

	len = top;
	res[++top] = n - 2;

	for (int i = n - 3; i >= 0; --i) {
		while (top != len
				&& mult(beacon[i], beacon[res[top]], beacon[res[top - 1]])) {
			--top;
		}

		res[++top] = i;
	}

//	for (int s = 0; s < top; ++s) {
//		cout << res[s] << " ";
//	}
//	cout << endl;

	convexHullVertex.clear();

	for (int s = 0; s < top; ++s) {
		convexHullVertex.push_back(beacon[res[s]]);
	}
}

double cross(Point& a, Point& b) {
	return (double)(a.x * b.y) - (double)(a.y * b.x);
}

double countArea(vector<Point> tri) {
	double area = 0.0;

	for (int i = 0; i < tri.size(); ++i){
		area += cross(tri[i], tri[i + 1]);
	}

	return area / 2.0;
}

double triangleArea(Point a, Point b, Point c){
	return fabs((b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y)) / 2;
}

void debugMessage() {
	cout << "beacon: " << endl;
	for (int i = 0; i < n; ++i) {
		cout << beacon[i].x << " " << beacon[i].y << endl;
	}
	cout << endl;

	cout << "convex: " << endl;
	for (int i = 0; i < convexHullVertex.size(); ++i) {
		cout << convexHullVertex[i].x << " " << convexHullVertex[i].y << endl;
	}
	cout << endl;
}

int main() {
	int T = 0;

	while (cin >> T) {
		while (T > 0) {
			cin >> n;

			for (int i = 0; i < n; ++i) {
				cin >> beacon[i].x >> beacon[i].y;
			}

			Graham_Scan();

			double maxArea = DBL_MIN;
			for (int i = 0; i < convexHullVertex.size(); ++i) {
				for (int j = i; j < convexHullVertex.size(); ++j) {
					for (int k = j; k < convexHullVertex.size(); ++k) {
//						tri.clear();
//
//						tri.push_back(convexHullVertex[i]);
//						tri.push_back(convexHullVertex[j]);
//						tri.push_back(convexHullVertex[k]);
//						tri.push_back(convexHullVertex[i]);

						//double currentArea = countArea(tri);
						double currentArea = triangleArea(convexHullVertex[i], convexHullVertex[j], convexHullVertex[k]);
						//cout << "Area: " << currentArea << endl;

						if(currentArea > maxArea){
							maxArea = currentArea;
						}
					}
				}
			}

			printf("%f\n", maxArea);

			//debugMessage();

			--T;
		}
	}

	return 0;
}
