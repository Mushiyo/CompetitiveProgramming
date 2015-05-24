/*Filename: limits.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <climits>

using namespace std;

int main(){

	cout << "The range of int is: " << INT_MAX << " ~ " << INT_MIN << endl;
	cout << "The range of long is: " << LONG_MAX << " ~ " << LONG_MIN << endl;
	cout << "The range of long long is: " << LLONG_MAX << " ~ " << LLONG_MIN << endl;

	int i = INT_MAX + 1;
	long l = LONG_MAX + 1;
	cout << "The value of i: " << i << endl;
	cout << "The value of l: " << l << endl;

	return 0;
}
