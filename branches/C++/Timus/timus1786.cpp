/*Filename: timus1786.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cctype>
#include <climits>

using namespace std;

const string name = "Sandro";
const int SAME = 0;
const int CASE_DIFF = 1;
const int DIFF = -1;

int compChar(char a, char b){
	if(a == b){
		return SAME;
	}
	else if(tolower(a) == tolower(b)){
		return CASE_DIFF;
	}
	else{
		return DIFF;
	}
}

bool isSameCase(char a, char b){
	return (islower(a) && islower(b)) || (isupper(a) && isupper(b));
}

int minCost(string text){
	int costChart[name.size()][text.size()];

	int endPos = text.size() - name.size() + 1;
	for(int i = 0; i < name.size(); ++i){
		for(int j = i; j < i + endPos; ++j){
			int compResult = compChar(name[i], text[j]);

			if(compResult == SAME){
				costChart[i][j] = 0;
			}
			else if(compResult == CASE_DIFF){
				costChart[i][j] = 5;
			}
			else{
				if(isSameCase(name[i], text[j])){
					costChart[i][j] = 5;
				}
				else{
					costChart[i][j] = 10;
				}
			}
		}
	}

	int minCost = INT_MAX;
	for(int pos = 0; pos < endPos; ++pos){
		int currentCost = 0;
		for(int i = 0; i < name.size(); ++i){
			currentCost += costChart[i][i + pos];
		}

		if(currentCost < minCost){
			minCost = currentCost;
		}
	}

	return minCost;
}

int main(){
	string text;

    while(cin >> text){
        cout << minCost(text) << endl;
    }

	return 0;
}
