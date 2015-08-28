/*Filename: aoj0009.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cmath>
#include <vector>

using namespace std;

const int size = 999999 + 1;
bool isPrime[size];
vector<int> prime;

void sieveOfEratosthenes() {
	for (int i = 2; i < size; ++i) {
		isPrime[i] = true;
	}

	int sqrtSize = sqrt(size) + 1;

	for (int i = 2; i < sqrtSize; ++i) {
		if (isPrime[i] == true) {
			for (int j = i * i; j < size; j += i) {
				isPrime[j] = false;
			}
		}
	}

	for (int i = 2; i < size; ++i) {
		if (isPrime[i]) {
			prime.push_back(i);
		}
	}
}

int main() {
	sieveOfEratosthenes();

	int n = 0;

	while (cin >> n) {
		int countPrime = 0;

		for(int i = 0; i < prime.size(); ++i){
			if(prime[i] > n){
				break;
			}
			else{
				++countPrime;
			}
		}

		cout << countPrime << endl;
	}

	return 0;
}
