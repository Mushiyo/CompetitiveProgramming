/*Filename: hdoj4585.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <queue>
#include <cmath>

using namespace std;

class Monk {
	bool cmpGreater;

public:
	int id;
	int grade;

	Monk() {
		id = 1;
		grade = 1000000000;
		cmpGreater = false;
	}

	Monk(bool isCmpGreater) {
		cmpGreater = isCmpGreater;
	}

	Monk(int id, int grade) {
		cmpGreater = false;
		this->id = id;
		this->grade = grade;
	}

	bool operator<(const Monk& m2) const {
		return ((this->grade) < m2.grade);
	}

	bool operator>=(const Monk& m2) const {
		return ((this->grade) >= m2.grade);
	}

	bool operator()(const Monk& m1, const Monk&m2) const {
		if (cmpGreater)
			return (m1.grade > m2.grade);
		else
			return (m1.grade < m2.grade);
	}
};

int main() {
	int n = 0;
	Monk master(1, 1000000000);
	Monk a(3, 4);
	Monk b(2, 5);

	while (scanf("%d", &n) == 1) {
		if (n == 0) {
			break;
		}

		// a maxHeap for smallerHalf
		priority_queue<Monk> less;
		// a minHeap for bigger half
		priority_queue<Monk, vector<Monk>, Monk> grEq(Monk(true));
		grEq.push(master);

		while (n > 0) {
			int id = 0, grade = 0;
			//cin >> id >> grade;
			scanf("%d %d", &id, &grade);

			Monk currMonk(id, grade);

			while (!less.empty()) {
				Monk top = less.top();

				if (top >= currMonk) {
					less.pop();
					grEq.push(top);
				} else {
					break;
				}
			}

			while (!grEq.empty()) {
				Monk top = grEq.top();

				if (top < currMonk) {
					grEq.pop();
					less.push(top);
				} else {
					break;
				}
			}

			int grTopGD = -1;
			if(!grEq.empty()){
				grTopGD = grEq.top().grade;;
			}


			int lessTopGD = -1000000001;
			if(!less.empty()){
				lessTopGD = less.top().grade;
			}

			int grEqDist = grTopGD - currMonk.grade;
			int lessDist = currMonk.grade - lessTopGD;

			if(lessDist == grEqDist){
				printf("%d %d\n", currMonk.id, less.top().id);
				//cout << currMonk.id << " " << less.top().id << endl;
			}
			else if(lessDist < grEqDist){
				printf("%d %d\n", currMonk.id, less.top().id);
				//cout << currMonk.id << " " << less.top().id << endl;
			}
			else{
				printf("%d %d\n", currMonk.id, grEq.top().id);
				//cout << currMonk.id << " " << grEq.top().id << endl;
			}

			grEq.push(currMonk);
			--n;
		}
	}

	return 0;
}
