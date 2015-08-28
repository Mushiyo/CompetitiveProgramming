/*Filename: uva621.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main() {
	int n = 0;
	string num;
	getline(cin, num); // eat empty line

	while (getline(cin, num)) {
		if (num == "1" || num == "4" || num == "78") {
			cout << "+" << endl;
		} else if (num.substr(num.size() - 2) == "35") {
			cout << "-" << endl;
		} else if (num[0] == '9' && num[num.size() - 1] == '4') {
			cout << "*" << endl;
		} else if (num.substr(0, 3) == "190") {
			cout << "?" << endl;
		}
	}

	return 0;
}
