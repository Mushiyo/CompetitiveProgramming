#include <vector>

using namespace std;

#ifndef DISJOINTSET_H_
#define DISJOINTSET_H_

class DisjointSet {
public:
	DisjointSet(int size){
		parent.assign(size, -1);
	}

	int findSet(int i){
		if(parent[i] == -1){
			return i;
		}else{
			parent[i] = findSet(parent[i]);
			return parent[i];
		}
	}

	int Union(int i, int j){
		parent[findSet(i)] = findSet(j);
		return findSet(i);
	}
private:
	vector<int> parent;
};

#endif /* DISJOINTSET_H_ */
