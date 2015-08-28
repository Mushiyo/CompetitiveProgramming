/*Filename: u11875.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>

using namespace std;

int main(){
	int T = 0;

    while(cin >> T){
        for(int caseNum = 1; caseNum <= T; ++caseNum){
        	int N = 0;
        	cin >> N;

        	int halfN = (N / 2);

        	int captainAge = 0;
        	for(int i = 0; i < N; ++i){
        		int age = 0;
        		cin >> age;

        		if(i == halfN){
        			captainAge = age;
        		}
        	}

        	printf("Case %d: %d\n", caseNum, captainAge);
        }
    }

	return 0;
}
