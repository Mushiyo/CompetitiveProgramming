/*Filename: uva10656.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>

using namespace std;

int main(){
	int N = 0;

    while(cin >> N){
        if(N == 0){
        	break;
        }

        vector<int> maxSubsequence;
        for(int i = 0; i < N; ++i){
        	int num;
        	cin >> num;

        	if(num > 0){
        		maxSubsequence.push_back(num);
        	}
        }

        if(maxSubsequence.size() == 0){
        	cout << 0 << endl;
        }
        else{
        	cout << maxSubsequence[0];
        	for(int i = 1; i < maxSubsequence.size(); ++i){
        		cout << " " << maxSubsequence[i];
        	}
        	cout << endl;
        }
    }

	return 0;
}
