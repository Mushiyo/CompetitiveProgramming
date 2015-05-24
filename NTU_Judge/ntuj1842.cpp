/*Filename: ntuj1842.cpp
 *Author: Mushiyo
 */
#include <stdio.h>
#include <iostream>
#include <string>
#include <cmath>
#include <algorithm>
#include <climits>
#include <cfloat>
#include <vector>
#include <stack>
#include <queue>

using namespace std;

int main() {
	int n = 0;

//	int a = 514;
//	int b = 50126;
//	int c = 514 ^ 50216;
//	cout << c;

	while (cin >> n) {
		int A[n];
		int B[n];

		for (int i = 0; i < n; ++i) {
			cin >> A[i];
		}

		for (int i = 0; i < n; ++i) {
			cin >> B[i];
		}
		sort(B, B + n);

		int possiX[n];
		bool foundX = false;
		int x = INT_MAX;

		for(int i = 0; i < n; ++i){
			possiX[i] = A[0] ^ B[i];

			int b[n];
			bool match = true;
			for(int j = 0; j < n; ++j){
				b[j] = possiX[i] ^ A[j];

				if(b[j] < B[0] || b[j] > B[n - 1]){
					match = false;
					break;
				}
			}

			if(match == false){
				continue;
			}
			else{
				sort(b, b + n);

				match = true;
				for(int j = 0; j < n; ++j){
					if(B[j] != b[j]){
						match = false;
						break;
					}
				}

				if(match){
					foundX = true;
					if(possiX[i] < x){
						x = possiX[i];
					}
				}
			}

		}


//        for(x = 0; x <= 1000000000; ++x){
//        	foundX = true;
//
//        	for(int i = 0; i < n; ++i){
//        		XOR[i] = A[i] ^ x;
//        	}
//
//        	sort(XOR, XOR + n);
//
//        	for(int i = 0; i < n; ++i){
//        		if(XOR[i] != B[i]){
//        			foundX = false;
//        			break;
//        		}
//        	}
//
//        	if(foundX){
//        		break;
//        	}
//        }

		if (foundX) {
			printf("%d\n", x);
			//cout << x << endl;
		} else {
			//cout << "-1" << endl;
			printf("-1\n");
		}

	}

	return 0;
}
