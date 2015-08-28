/*Filename: ntuj0713.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

struct WedRec{
	int startTime;
	int halfTime;
	int endTime;
};

const int maxN = 100000;

WedRec rec[maxN];

bool compareWedRec(const WedRec& w1, const WedRec& w2){
	if(w1.halfTime == w2.halfTime){
		return w1.startTime < w2.startTime;
	}

	return w1.halfTime < w2.halfTime;
}

int main(){
	int N;

    while(cin >> N){
    	if(N == 0){
    		break;
    	}

        for(int i = 0; i < N; ++i){
        	int  S = 0, T = 0;
        	cin >> S >> T;

        	int M = (S + T) / 2 + 1;
        	// the ceremony must be longer than half of the wedding time

        	rec[i].startTime = S;
        	rec[i].halfTime = M;
        	rec[i].endTime = T;
        }

        sort(rec, rec + N, compareWedRec);

//        for(int i = 0; i < N; ++i){
//        	cout << rec[i].startTime << " " << rec[i].endTime << endl;
//        }

        bool allHold = true;
        int currentTime = rec[0].halfTime;
        for(int i = 1; i < N; ++i){
        	if(rec[i].startTime >= currentTime){
        		currentTime = rec[i].halfTime;
        	}else{
        		int ceremonyTime = rec[i].halfTime - rec[i].startTime;

        		if(currentTime + ceremonyTime > rec[i].endTime){
        			allHold = false;
        			break;
        		}
        		else{
        			currentTime += ceremonyTime;
        		}
        	}
        }

        if(allHold){
        	cout << "YES" << endl;
        }
        else{
        	cout << "NO" << endl;
        }
    }

	return 0;
}
