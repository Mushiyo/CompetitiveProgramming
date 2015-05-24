/*Filename: uva11044.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

int main(){
	int t = 0;
	const int sonarCellW = 3, sonarCellH = 3;

    while(cin >> t){
        while(t > 0){
        	int n = 0, m = 0;
        	cin >> n >> m;

        	int horizontalSonarNum = (n - 2) / sonarCellW;
        	if((n - 2) % sonarCellW > 0){
        		++horizontalSonarNum;
        	}

        	int verticalSonarNum = (m - 2) / sonarCellH;
        	if((m - 2) % sonarCellH > 0){
        		++verticalSonarNum;
        	}

        	cout << horizontalSonarNum * verticalSonarNum << endl;

        	--t;
        }
    }

	return 0;
}
