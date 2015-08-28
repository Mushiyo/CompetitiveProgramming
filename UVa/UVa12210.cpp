/*Filename: uva12210.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

int main(){
	int caseNum = 1;
	int B = 0, S = 0;

    while(cin >> B >> S){
    	if(B == 0 && S == 0){
    		break;
    	}

        int bachelor[B];
        for(int i = 0; i < B; ++i){
        	cin >> bachelor[i];
        }


        int spinster[S];
        for(int i = 0; i < S; ++i){
        	cin >> spinster[i];
        }

        cout << "Case " << caseNum << ": ";
        if(B <= S){
        	cout << 0 << endl;
        }
        else{
        	cout << B - S << " ";
        	sort(bachelor, bachelor + B, greater<int>());
        	cout << bachelor[B - 1] << endl;
        }
        
        ++caseNum;
    }

	return 0;
}
