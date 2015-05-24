/*Filename: uva11498.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	int K = 0;

    while(cin >> K){
    	if(K == 0){
    		break;
    	}

        int N = 0, M = 0;
        cin >> N >> M;
        
        for(int i = 0; i < K; ++i){
        	int X = 0, Y = 0;
        	cin >> X >> Y;

        	if(X == N || Y == M){
        		cout << "divisa" << endl;
        	}
        	else if(X > N && Y > M){
        		cout << "NE" << endl;
        	}
        	else if(X < N && Y > M){
        		cout << "NO" << endl;
        	}
        	else if(X < N && Y < M){
        		cout << "SO" << endl;
        	}
        	else{
        		cout << "SE" << endl;
        	}
        }
    }

	return 0;
}
