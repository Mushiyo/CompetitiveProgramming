/*Filename: vector.cpp
 *Author: Mushiyo
 *Usage: Demonstrate some manipulation of the vector class in STL
 */

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
	vector<int> v1(4); // v1 is build by an assigned size
	cout << "The size of v1 is " << v1.size() << "." << endl;

	v1.clear();
	cout << "After clear(), the size of v1 becomes " << v1.size() << "."
			<< endl;

	v1.resize(10);
	cout << "After resize(10), the size of v1 becomes " << v1.size() << "."
			<< endl;

	//-----------------------
	cout << endl;

	const int arrLen = 5;
	int ints[arrLen] = { 3, 5, 2, 1, 4 };
	vector<int> v2(ints, ints + arrLen); // v2 is build by assigned elements

	cout << "Before sort(), the contents in v2 is:";
	for (int i = 0; i < v2.size(); ++i) {
		cout << " " << v2[i];
	}
	cout << endl;

	sort(v2.begin(), v2.end());

	cout << "After sort(), the contents in v2 is:";
	for (int i = 0; i < v2.size(); ++i) {
		cout << " " << v2[i];
	}
	cout << endl;

	return 0;
}
