/*Filename: aoj0010.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <iostream>
#include <cmath>

using namespace std;

struct Point {
	double x;
	double y;
};

double countDist(Point p1, Point p2) {
	double xDist = abs(p1.x - p2.x);
	double yDist = abs(p1.y - p2.y);

	return sqrt(xDist * xDist + yDist * yDist);
}

// find the circumcenter by finding the intersection of the perpendicular bisectors.
Point getCircumcenter (Point p1, Point p2, Point p3) {
	Point bias = p1;

	// a, b & c for ax + by = c
	double a1 = p2.x - p1.x, b1 = p2.y - p1.y, c1 = (a1 * a1 + b1 * b1) / 2;
	double a2 = p3.x - p1.x, b2 = p3.y - p1.y, c2 = (a2 * a2 + b2 * b2) / 2;
	/* translate the origin to p1
	 * let the center of the circumscribed circle be (x, y)
	 * we can get the value of (x, y) by solve the following simultaneous equations to :
	 * a1 * x + b1 * y = c1 --(1)
	 * a2 * x + b2 * y = c2 --(2)
	 *
	 * 1. after rearrange eq.1, we have:
	 * y = (c1 - a1 * x) / b1
	 * plugging this into eq.2, we have:
	 * x = (b1 * c2 - b2 * c1) / (a2 * b1 - a1 * b2)
	 *
	 * 2. after rearrange eq.1, we have:
	 * x = (c1 - b1 * y) / a1
	 * plugging this into eq.2, we have:
	 * y = (a1 * c2 - a2 * c1) / (a1 * b2 - a2 * b1)
	 *   = (a2 * c1 - a1 * c2) / (a2 * b1 - a1 * b2)
	*/
	double d = a2 * b1 - a1 * b2;
	Point center;
	center.x = bias.x + (b1 * c2 - b2 * c1) / d;
	center.y = bias.y + (a2 * c1 - a1 * c2) / d;

	return center;
}

int main() {
	int n;

	while (cin >> n) {
		while (n > 0) {
			Point a, b, c;
			cin >> a.x >> a.y >> b.x >> b.y >> c.x >> c.y;

			Point center = getCircumcenter(a, b, c);
			double radius = countDist(center, a);

			printf("%.3f %.3f %.3f\n", center.x, center.y, radius);

			--n;
		}
	}

	return 0;
}
