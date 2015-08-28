/*Filename: d036.cpp
 *Author: Mushiyo
 */

#include <stdio.h>

using namespace std;

int main() {
	long long sum = 0;
	int num = 0;
	bool isFirstNum = true;

	// check if the file begins with number
	int initialNum = 0;
	bool isInitialNum = scanf("%d", &initialNum);
	if (isInitialNum == true) {
		printf("%d", initialNum);
		sum += initialNum;
		isFirstNum = false;
	}

	while (scanf("%*[^0-9]%d", &num) == 1) {
		if (isFirstNum == false) {
			printf("+");
		} else {
			isFirstNum = false;
		}
		printf("%d", num);

		sum += num;
	}

	printf("=%ld\n", sum);

	return 0;
}
