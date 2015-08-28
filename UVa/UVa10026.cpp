/*Filename: uva10026.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

struct Job{
	int id;
	int workday;
	int fine;
};

bool jobCmp(const Job j1, const Job j2){
	double rate1 = (double) j1.fine / j1.workday;
	double rate2 = (double) j2.fine / j2.workday;

	if(rate1 == rate2){
		return j1.id < j2.id;
	}

	return rate1 > rate2;
}

int main() {
	int T = 0;

	while (cin >> T) {
		bool isFirstCase = true;
		while (T > 0) {

			int N = 0;
			cin >> N;

			Job jobs[N];
			for(int i = 0; i < N; ++i){
				jobs[i].id = i + 1;
				cin >> jobs[i].workday;
				cin >> jobs[i].fine;
			}

			sort(jobs, jobs + N, jobCmp);

			if (isFirstCase) {
				isFirstCase = false;
			} else {
				cout << endl;
			}

			cout << jobs[0].id;
			for(int i = 1; i < N; ++i){
				cout << " " << jobs[i].id;
			}
			cout << endl;

			--T;
		}
	}

	return 0;
}
