/*Filename: ntuj0881.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <cstring>
#include <climits>
#include <cmath>
#define TREE_SIZE (1 << (20))

using namespace std;

//const int TREE_SIZE = (1 << (20));

class IntervalTree{
private:
	int Cover[TREE_SIZE], Top[TREE_SIZE];
	int size;
	int _Query(int a, int b, int l, int r, int Ind){
		if(a <= l && b <= r) return Top[Ind];
		int mid = (l + r) >> 1, ret = Cover[Ind];
		if(a <= mid) ret = max(ret, _Query(a, b, l, mid, Ind << 1));
		if(b > mid) ret = max(ret, _Query(a, b, mid + 1, r, (Ind << 1) + 1));
		return ret;
	}

	void _Modify(int a, int l, int r, int Ind, int d){
		if(l == r && l == a){
			Cover[Ind] = Top[Ind] = d;
			return;
		}
		int mid = (l + r) >> 1;
		if(a <= mid) _Modify(a, mid + l, r, (Ind << 1), d);
		else _Modify(a, mid + 1, r, (Ind << 1) + 1, d);
		Top[Ind] = max(Top[Ind << 1], Top[(Ind << 1) + 1]);
	}

public:
	IntervalTree(){
		memset(Cover, 0, sizeof(Cover));
		memset(Top, 0, sizeof(Top));
		size = (TREE_SIZE >> 2) - 1;
	}

	IntervalTree(int size):size(size){
		memset(Cover, 0, sizeof(Cover));
		memset(Top, 0, sizeof(Top));
	}

	int Query(int a, int b){
		return _Query(a, b, 1, size, 1);
	}

	void Modify(int a, int d){
		return _Modify(a, 1, size, 1, d);
	}
};

int main() {
	int n = 0, m = 0;

	while (scanf("%d %d", &n, &m) == 2) {
		IntervalTree it;
		//int drink[n + 1];

		//drink[0] = 0;
		for (int i = 1; i <= n; ++i) {
			int val = 0;
			scanf("%d", &val);

			it.Modify(i, val);
		}

		while (m > 0) {
			int op = 0, a = 0, b = 0;
			scanf("%d %d %d", &op, &a, &b);

			if (op == 1) {
				int maxSum = it.Query(a, b);

				printf("%d\n", maxSum);
			} else {
				it.Modify(a, b);
			}

			--m;
		}
	}

	return 0;
}
