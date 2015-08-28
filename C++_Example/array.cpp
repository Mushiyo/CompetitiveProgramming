/*Filename: array.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>

using namespace std;

void arrayModify(int* begin, int* end){
	int arrLen = end - begin;
	for(int i = 0; i < arrLen; ++i){
		printf("%d", begin[i]);
	}
	return;
}

void printArray(int a[], int len){
	printf("%d", a[0]);
	for(int i = 1; i < len; ++i){
		printf(" %d", a[i]);
	}
	printf("\n");
}

int main(){
	int a[5] = {0, 1, 2, 3, 4};

	printArray(a, 5);
	//arrayModify(a, a + 5);

	return 0;
}
