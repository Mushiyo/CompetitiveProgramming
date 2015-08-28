/*Filename: SieveOfEratosthenes.cpp
 *Author: Mushiyo
 */

#include <cmath>
#include <iostream>
#include <vector>

using namespace std;

const int size = 20000000 + 1;
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
		if(isPrime[i]){
			prime.push_back(i);
		}
	}
}

int main() {
	sieveOfEratosthenes();

	cout << "prime numbers below " << size - 1 << " are: " << endl;
	for (int i = 0; i < prime.size(); ++i) {
		cout << prime[i] << endl;
	}
	cout << prime.size() << endl;

	return 0;
}
