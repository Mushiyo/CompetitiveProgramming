#include <iostream>
#include <string>

using namespace std;

int main(){
	string s;
	
	while(getline(cin, s)){
		for(string::reverse_iterator rit = s.rbegin(); rit != s.rend(); ++rit){
			cout << *rit;
		}
		cout << endl;
	}

	return 0;
}


