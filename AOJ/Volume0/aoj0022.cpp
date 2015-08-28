/*Filename: aoj0022.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cmath>
#include <climits>

using namespace std;

int main(){
	int n = 0;

    while(cin >> n){
    	if(n == 0){
    		break;
    	}

        int a[n];
        for(int i = 0; i < n; ++i){
        	cin >> a[i];
        }

        int sum[n];
        sum[0] = a[0];
        for(int i = 1; i < n; ++i){
        	sum[i] = sum[i - 1] + a[i];
        }

        int maxSum = INT_MIN;
        int minSum = 0;
        for(int i = 0; i < n; ++i){
        	maxSum = max(maxSum, sum[i] - minSum);
        	minSum = min(minSum, sum[i]);
        }
        
        cout << maxSum << endl;
    }

	return 0;
}
