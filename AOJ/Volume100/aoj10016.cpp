/*Filename: aoj10016.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

const int SIZE = 3;
const int m = 0;
const int f = 1;
const int r = 2;
int score[SIZE];

char grade(int totalScore){
	if(score[m] == -1 || score[f] == -1){
		return 'F';
	}

	if(totalScore < 30){
		return 'F';
	}
	else if (totalScore < 50){
		if(score[r] >= 50){
			return 'C';
		}
		else{
			return 'D';
		}
	}
	else if(totalScore < 65){
		return 'C';
	}
	else if(totalScore < 80){
		return 'B';
	}
	else{
		return 'A';
	}

	return 'A';
}

int main(){
    while(cin >> score[m] >> score[f] >> score[r]){
    	if(score[m] == -1 && score[f] == -1 && score[r] == -1){
    		break;
    	}

        int totalscore = 0;

        for(int i = 0; i < r; ++i){
        	if(score[i] > -1){
        		totalscore += score[i];
        	}
        }
        
        cout << grade(totalscore) << endl;
    }

	return 0;
}
