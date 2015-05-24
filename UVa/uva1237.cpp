/*Filename: uva1237.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>

using namespace std;

struct Record {
	string carMaker;
	int lowestPrice;
	int highestPrice;
};

int main() {
	int T = 0;

	while (cin >> T) {
		for (int t = 0; t < T; ++t) {
			if (t > 0) {
				cout << endl;
			}

			int D = 0;
			cin >> D;

			Record database[D];
			for (int d = 0; d < D; ++d) {
				cin >> database[d].carMaker >> database[d].lowestPrice
						>> database[d].highestPrice;
			}

			int Q = 0;
			cin >> Q;
			for (int q = 0; q < Q; ++q) {
				int P = 0;
				cin >> P;
				bool isUndetermined = true;
				string queryResult;

				// searching the database
				for (int d = 0; d < D; ++d) {
					if (database[d].lowestPrice <= P
							&& P <= database[d].highestPrice) {
						if (queryResult != "") {
							isUndetermined = true;
							break;
						} else {
							queryResult = database[d].carMaker;
							isUndetermined = false;
						}
					}
				}

				if (isUndetermined) {
					cout << "UNDETERMINED" << endl;
				} else {
					cout << queryResult << endl;
				}
			}
		}
	}

	return 0;
}
