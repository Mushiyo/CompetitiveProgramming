/*Filename: uva10035.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main() {
	int num1 = 0, num2 = 0;

	while (cin >> num1 >> num2) {
		if (num1 == 0 && num2 == 0) {
			break;
		}

		int countCarry = 0;
		int carry = 0;
		while (num1 != 0 || num2 != 0) {
			int unitDigit1 = num1 % 10;
			int unitDigit2 = num2 % 10;

			if (unitDigit1 + unitDigit2 + carry > 9) {
				++countCarry;
				carry = (unitDigit1 + unitDigit2 + carry) / 10;
			} else {
				carry = 0;
			}

			num1 /= 10;
			num2 /= 10;
		}

		if (countCarry > 1) {
			cout << countCarry << " carry operations." << endl;
		} else if (countCarry == 1) {
			cout << "1 carry operation." << endl;
		} else {
			cout << "No carry operation." << endl;
		}
	}

	return 0;
}
