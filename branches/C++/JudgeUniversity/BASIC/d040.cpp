/*Filename: d040.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <string.h>

int main() {
	int base;
	char number[80];
	int outBase;
	int output;

	while (scanf("%d %s %d", &base, number, &outBase) == 3) {
		output = strtol(number, NULL, base);

		if (outBase == 8) {
			printf("%o\n", output);
		} else if (outBase == 16) {
			printf("%X\n", output);
		}
	}
	return 0;
}
