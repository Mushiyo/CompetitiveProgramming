/*Filename: ntuj1946.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>
#include <cstring>

using namespace std;

int main(){
	int N = 0;
	int M = 0;
	int nonRepeatWord[5000 + 1];
	memset(nonRepeatWord, 0, sizeof(nonRepeatWord));

	for(int i = 1; i <= 5000; ++i){
		int digitCount[9];
		memset(digitCount, 0, sizeof(digitCount));
		char cStr[4];

		sprintf(cStr, "%d", i);
		//printf("%s\n", cStr);
		int len = strlen(cStr);
		bool repeated = false;
		for(int j = 0; j < len; ++j){
			++digitCount[cStr[j] - '0'];

			if(digitCount[cStr[j] - '0'] > 1){
				//cout << digitCount[cStr[j] - '0'] << endl;
				//cout << i << " " << j << endl;
				//cout << cStr[j] - '0' << endl;
				repeated = true;
				break;
			}
		}

		if(repeated){
			nonRepeatWord[i] = nonRepeatWord[i - 1];
		}
		else{
			nonRepeatWord[i] = nonRepeatWord[i - 1] + 1;
		}

		//cout << nonRepeatWord[i] << endl;
	}

    while(cin >> N >> M){
        cout << nonRepeatWord[M] - nonRepeatWord[N] << endl;
    }

	return 0;
}
