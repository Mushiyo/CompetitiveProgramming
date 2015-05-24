/*Filename: uva11292.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

int main(){
	int n = 0, m = 0;

    while(cin >> n >> m){
        if(n == 0 && m == 0){
        	break;
        }

        int dragonHeadSize[n];
        for(int i = 0; i < n; ++i){
        	cin >> dragonHeadSize[i];
        }
        sort(dragonHeadSize, dragonHeadSize + n);

        int knightHeight[m];
        for(int i = 0; i < m; ++i){
        	cin >> knightHeight[i];
        }
        sort(knightHeight, knightHeight + m);

        int currentTarget = 0;
        long long cost = 0;
        for(int i = 0; i < m; ++i){
        	if(knightHeight[i] >= dragonHeadSize[currentTarget]){
        		cost += knightHeight[i];
        		++currentTarget;
        	}

        	if(currentTarget >= n){
        		break;
        	}
        }

        if(currentTarget < n){
        	cout << "Loowater is doomed!" << endl;
        }
        else{
        	cout << cost << endl;
        }
        
    }

	return 0;
}
