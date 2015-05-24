/*Filename: arrayAssignment.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>

using namespace std;

const int SIZE = 5;

int main(){
	int a1[] = {1, 2, 3, 4, 5};
	int a2[] = {5, 4, 3, 2, 1};
	int tmp[5];

	tmp = a1;
	a1 = a2;
	a2 = tmp;

	return 0;
}
