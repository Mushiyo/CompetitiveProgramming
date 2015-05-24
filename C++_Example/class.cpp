/*Filename: class.cpp
 *Author: Mushiyo
 */

/*Filename: struct.cpp
 *Author: Mushiyo
 *Usage: Demonstrate how to manipulate the struct data type
 */

#include <iostream>
#include <queue>

using namespace std;

class Point {
public:
	int x;
	int y;

	Point(int x, int y) {
		this->x = x;
		this->y = y;
	}

	Point() {
		x = 0;
		y = 0;
	}
};

int main() {

	Point p1(3, 4);
	Point p2;
	p2.x = p1.y;
	p2.y = p1.x;

	cout << "The coordinate of point 1 is " << "(" << p1.x << ", " << p1.y
			<< ")." << endl;
	cout << "The coordinate of point 2 is " << "(" << p2.x << ", " << p2.y
			<< ")." << endl;

	queue<Point> q;
	for (int i = 0; i < 2; ++i) {
		for (int j = 0; j < 2; ++j) {
			q.push(Point(i, j));
		}
	}

	cout << endl;
	cout << "Points in the queue are:" << endl;
	while (!q.empty()) {
		cout << "(" << q.front().x << ", " << q.front().y << ")" << endl;
		q.pop();
	}

	return 0;
}
