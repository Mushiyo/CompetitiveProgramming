/*Filename: uva11799.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <climits>

using namespace std;

int main(){
	int T = 0;

    while(cin >> T){
        for(int caseNum = 1; caseNum <= T; ++caseNum){
        	int N = 0;
        	cin >> N;

        	int c[N];
        	int max = INT_MIN;
        	for(int i = 0; i < N; ++i){
        		cin >> c[i];

        		if(max < c[i] ){
        			max = c[i];
        		}
        	}

        	cout << "Case " << caseNum << ": " << max << endl;
        }
    }

	return 0;
}
