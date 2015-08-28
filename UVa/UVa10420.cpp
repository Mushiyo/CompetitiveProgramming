/*Filename: uva10420.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <map>

using namespace std;

int main(){
	int n = 0;

    while(cin >> n){
        map<string, int> conquerList;

        string tmp;
        getline(cin, tmp); //eat empty line

        while(n > 0){
        	string country;
        	cin >> country;

        	string name;
        	getline(cin, name);

        	conquerList[country] += 1;

        	--n;
        }

        map<string,int>::iterator it = conquerList.begin();
        while(it != conquerList.end()){
        	cout << it -> first << " " << it -> second << endl;

        	++it;
        }
    }

	return 0;
}
