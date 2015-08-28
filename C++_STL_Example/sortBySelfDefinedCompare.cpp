/*Filename: sortBySelfDefineCompare.cpp
 *Author: User
 *Usage: Demonstrate how to sort by self-defined compare function
 */

#include <iostream>
#include <algorithm>

using namespace std;

bool compareByLessLength(const string& s1, const string& s2) {
	return s1.length() < s2.length();
}

const int arrLen = 5;

int main() {
	string strs[arrLen] = { "1", "12", "23", "123", "1234" };

	cout << "Before sort, the order is" << endl;
	for (int i = 0; i < arrLen; ++i) {
		cout << i + 1 << ". " << strs[i] << endl;
	}
	cout << endl;

	sort(strs, strs + arrLen);
	cout << "After sort, the order is" << endl;
	for (int i = 0; i < arrLen; ++i) {
		cout << i + 1 << ". " << strs[i] << endl;
	}
	cout << endl;

	sort(strs, strs + arrLen, compareByLessLength);
	cout << "After sort by self-defined compare function, the order is" << endl;
	for (int i = 0; i < arrLen; ++i) {
		cout << i + 1 << ". " << strs[i] << endl;
	}
	cout << endl;

	return 0;
}
