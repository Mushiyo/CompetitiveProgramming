#include <iostream>
#include <string>

using namespace std;

int main(){
	string s1 = "";
	string s2 = "";

    while(cin >> s1 >> s2){
        if(s1 != s2){
        	cout << "No";
        }
        else{
        	cout << "Yes";
        }

        cout << endl;
    }

	return 0;
}
