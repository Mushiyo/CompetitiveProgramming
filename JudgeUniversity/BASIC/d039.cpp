/*Filename: d039.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <cmath>
#include <iostream>

using namespace std;

const int arrSize = 1000000 + 1;
bool isPrime[arrSize];

void sieveOfEratosthenes(){
	for(int i = 2; i < arrSize; ++i){
		isPrime[i] = true;
	}

	int sqrtSize = sqrt(arrSize) + 1;

	for(int i = 2; i < sqrtSize; ++i){
		if(isPrime[i] == true){
			for(int j = i * i; j < arrSize; j += i){
				isPrime[j] = false;
			}
		}
	}
}

int main(){
	int n = 0;

	sieveOfEratosthenes();

    while(scanf("%d ", &n) == 1){
        if(isPrime[n] == true){
        	printf("prime\n");
        }
        else{
        	printf("not prime\n");
        }
    }

	return 0;
}
