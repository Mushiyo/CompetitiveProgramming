/*Filename: uva12405.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstring>

using namespace std;

int main() {
	const char CROP = '.';
	const char INFERTILE = '#';
	int T = 0;

	while (cin >> T) {
		for (int caseNum = 1; caseNum <= T; ++caseNum) {
			int N = 0;
			cin >> N;

			char field[N + 2];
			memset(field, INFERTILE, sizeof(field));
			for(int i = 0; i < N; ++i){
				cin >> field[i];
			}

			int scarecrowNum = 0;
			for(int i = 0; i < N; ){
				if(field[i] == CROP){
					field[i] = field[i + 1] = field[i + 2] = INFERTILE;
					++scarecrowNum;
					i += 3;
				}
				else{
					++i;
				}
			}

			cout << "Case " << caseNum << ": " << scarecrowNum << endl;
		}

	}

	return 0;
}
