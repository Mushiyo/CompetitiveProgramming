/*Filename: aoj0016.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <cmath>

using namespace std;

int main() {
	double x = 0, y = 0;
	int direction = 90;
	int d = 0, t = 0;

	while (scanf("%d, %d", &d, &t) == 2) {
		if (d == 0 && t == 0) {
			break;
		}

		double dx = d * cos(direction * M_PI / 180.0);
		double dy = d * sin(direction * M_PI / 180.0);

		x += dx;
		y += dy;

		direction -= t;
		direction %= 360;
		if (direction < 0) {
			direction += 360;
		}
	}

	printf("%d\n", (int)x);
	printf("%d\n", (int)y);

	return 0;
}
