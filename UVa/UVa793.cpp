/*Filename: UVa793.cpp
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

int main() {
	int dataSetNum = 0;
	string s;

	while (scanf("%d ", &dataSetNum) == 1) {
		bool isFirstOutput = true;
		while (dataSetNum > 0) {
			int computerNum = 0;
			scanf("%d ", &computerNum);

			DisjointSet computerNetwork(computerNum);
			int successful = 0, unsuccessful = 0;

			while (true) {
				getline(cin, s);

				if (s == "") {
					break;
				} else {
					char cmd = ' ';
					int i = 0, j = 0;

					sscanf(s.c_str(), "%c %d %d", &cmd, &i , &j);

					if(cmd == 'c'){
						computerNetwork.unionSet(i, j);
					} else if (cmd == 'q'){
						if(computerNetwork.findSet(i) == computerNetwork.findSet(j)){
							++successful;
						} else {
							++unsuccessful;
						}
					}
				}
			}

			if (isFirstOutput) {
				isFirstOutput = false;
			} else {
				printf("\n");
			}

			printf("%d,%d\n", successful, unsuccessful);

			--dataSetNum;
		}
	}

	return 0;
}
