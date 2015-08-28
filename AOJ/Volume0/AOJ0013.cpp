/*Filename: aoj0013.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stack>

using namespace std;

int main(){
	int num = 0;
	stack<int> car;

    while(cin >> num){
        if(num == 0){
        	cout << car.top() << endl;
        	car.pop();
        }
        else{
        	car.push(num);
        }
    }

	return 0;
}
