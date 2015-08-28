/*Filename: uva458.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>

using namespace std;

int main(){
	string s;

	while(cin >> s){
		for(int i = 0; i < s.length(); ++i){
			printf("%c", s[i] - 7);
		}
		printf("\n");
	}

	return 0;
}
