/*Filename: UVa10583.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>
#include <vector>

using namespace std;

class DisjointSet {
public:
	DisjointSet(int size) {
		parent.assign(size + 1, -1);
	}

	int findSet(int i) {
		if (parent[i] == -1) {
			return i;
		} else {
			parent[i] = findSet(parent[i]);
			return parent[i];
		}
	}

	int unionSet(int i, int j) {
		int setI = findSet(i);
		int setJ = findSet(j);

		if(setI == setJ){
			return -1;
		}

		parent[findSet(i)] = findSet(j);
		return findSet(i);
	}
private:
	vector<int> parent;
};

int main(){
	int n = 0, m = 0;
	int caseNum = 1;

	while(scanf("%d %d", &n, &m)){
		if(n == 0 && m == 0){
			break;
		}

		DisjointSet religionSet(n);
		int religionNum = n;

		for(int s = 0; s < m; ++s){
			int i = 0, j = 0;
			scanf("%d %d", &i, &j);

			if(religionSet.findSet(i) != religionSet.findSet(j)){
				--religionNum;
			}
			religionSet.unionSet(i, j);
		}

		printf("Case %d: %d\n", caseNum++, religionNum);
	}

	return 0;
}
