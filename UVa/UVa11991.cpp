/*Filename: uva11991.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <vector>

using namespace std;

const int size = 1000000 + 1;
vector<int> position[size];

void clearPosition(){
	for(int i = 0; i < size; ++i){
		position[i].clear();
	}
}

int main(){
	int n = 0, m = 0;

    while(cin >> n >> m){
    	clearPosition();

        for(int pos = 1; pos <= n; ++pos){
        	int number = 0;
        	cin >> number;

        	position[number].push_back(pos);
        }
        
        for(int i = 0; i < m; ++i){
        	int k = 0, v = 0;
        	cin >> k >> v;

        	if(position[v].size() < k){
        		cout << 0 << endl;
        	}
        	else{
        		cout << position[v][k - 1] << endl;
        	}
        }
    }

	return 0;
}
