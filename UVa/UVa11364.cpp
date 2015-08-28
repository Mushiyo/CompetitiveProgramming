/*Filename: uva11364.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <climits>

using namespace std;

int main(){
	int t = 0;

    while(cin >> t){
        while(t > 0){
        	int n = 0;
        	cin >> n;

        	int x[n];
        	int min = INT_MAX;
        	int max = INT_MIN;
        	for(int i = 0; i < n; ++i){
        		cin >> x[i];

        		if(x[i] < min){
        			min = x[i];
        		}

        		if(x[i] > max){
        			max = x[i];
        		}
        	}

        	cout << (max - min) * 2 << endl;

        	--t;
        }
    }

	return 0;
}
