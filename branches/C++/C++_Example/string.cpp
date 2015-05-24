/*Filename: string.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(){
	string s = "Java String, C++ string";

	// transform is in <algorithm>
	transform(s.begin(), s.end(), s.begin(), ::tolower);
    cout << s << endl;

    transform(s.begin(), s.end(), s.begin(), ::toupper);
    cout << s << endl;

	return 0;
}
