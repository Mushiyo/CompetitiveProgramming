/*Filename: d045.cpp
 *Author: Mushiyo
 */

#include <stdio.h>
#include <math.h>

//using namespace std;

//const int size = sqrt(INT_MAX) + 1;
//vector<int> isPrime(size, true);
//vector<int> prime;

const int size = 46341; // sqrt(INT_MAX) + 1 = 46341;
bool isPrime[size];
int prime[5000];
int numOfPrime = 0;

void sieveOfEratosthenes() {
	for (int i = 0; i < size; ++i) {
		isPrime[i] = true;
	}

	int sqrtSize = sqrt(size) + 1;

	prime[numOfPrime++] = 2;
	for(int i = 4; i < size; i += 2){
		isPrime[i] = false;
	}

	for (int i = 3; i < sqrtSize; i += 2) {
		if (isPrime[i] == true) {
			prime[numOfPrime++] = i;

			for (int j = i * i; j < size; j += i) {
				isPrime[j] = false;
			}
		}
	}

	++sqrtSize;
	for (int i = sqrtSize; i < size; i += 2) {
		if (isPrime[i]) {
			prime[numOfPrime++] = i;
		}
	}
}

void integerFactorization(int n) {
	if (n < size) {
		if (isPrime[n]) {
			printf("%d", n);
			return;
		}
	}

	bool isFirstFactor = true;

	int primeI = 0;
	int sqrtN = sqrt(n);
	// find first prime
	for (; primeI < numOfPrime; ++primeI) {
		if(prime[primeI] > sqrtN){
			break;
		}

		if (n % prime[primeI] == 0) {
			printf("%d", prime[primeI]);

			n /= prime[primeI];
			isFirstFactor = false;
			break;
		}
	}

	while (n > 1 && primeI < numOfPrime && prime[primeI] < sqrtN) {
		if (n < size) {
			if (isPrime[n]) {
				break;
			}
		}

		while (n % prime[primeI] == 0) {
			printf(" %d", prime[primeI]);

			n /= prime[primeI];
		}

		++primeI;
	}

	if (n > 1) {
		if (isFirstFactor) {
			isFirstFactor = false;
		} else {
			printf(" ");
		}

		printf("%d", n);
	}
}

int main() {
	int n = 0;

	sieveOfEratosthenes();

	while (scanf("%d ", &n) == 1) {
		integerFactorization(n);
		printf("\n");
	}

	return 0;
}
