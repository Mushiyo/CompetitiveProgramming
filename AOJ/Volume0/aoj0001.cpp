/*Filename: aoj0001.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <algorithm>

using namespace std;

int main(){
	const int MOUNTAIN_NUM = 10;
	int mountain[MOUNTAIN_NUM];

    for(int i = 0; i < MOUNTAIN_NUM; ++i){
    	cin >> mountain[i];
    }

    sort(mountain, mountain + MOUNTAIN_NUM, greater<int>());

    for(int i = 0; i < 3; ++i){
    	cout << mountain[i] << endl;
    }

	return 0;
}
