/*Filename: d016.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>

struct Fraction {
	int numerator;
	int denominator;
};

using namespace std;

int main() {
	int m = 0, n = 0;

	while (scanf("%d %d", &m, &n) == 2) {
		if (m == 0 && n == 0) {
			break;
		}

		Fraction target;
		target.numerator = m;
		target.denominator = n;

		Fraction left;
		left.numerator = 0;
		left.denominator = 1;

		Fraction current;
		current.numerator = 1;
		current.denominator = 1;

		Fraction right;
		right.numerator = 1;
		right.denominator = 0;

		while (current.numerator != target.numerator
				|| current.denominator != target.denominator) {
			double fractionTar = (double) target.numerator / target.denominator;
			double fractionCurr = (double) current.numerator / current.denominator;

			Fraction tmp = current;
			if (fractionTar < fractionCurr) {
				printf("L");
				current.numerator += left.numerator;
				current.denominator += left.denominator;
				right = tmp;
			} else {
				printf("R");
				current.numerator += right.numerator;
				current.denominator += right.denominator;
				left = tmp;
			}
		}
		printf("\n");
	}

	return 0;
}
