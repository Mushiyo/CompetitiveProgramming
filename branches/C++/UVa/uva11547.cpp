/*Filename: uva11547.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cmath>

using namespace std;

int main(){
	int t = 0;

    while(cin >> t){
        while(t > 0){
        	int n = 0;
        	cin >> n;

        	int ansPre = (n * 567 / 9 + 7492) * 235 / 47 - 498;
        	ansPre /= 10;
        	int ans = ansPre %= 10;

        	cout << abs(ans) << endl;

        	--t;
        }
    }

	return 0;
}
