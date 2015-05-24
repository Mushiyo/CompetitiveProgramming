/*Filename: stl_map.cpp
 *Author: Mushiyo
 *Usage: demostrating how to use the STL map
 */

#include <iostream>
#include <map>
#include <utility>

using namespace std;

int main() {
	map<string, int> myMap;

	// insert into the map
	myMap.insert(pair<string, int>("def", 2)); // insert by the insert member function
	myMap["abc"] = 1; // insert by operator []

	// check if the key is in the map;
	string key = "abc";
	if(myMap.find(key) != myMap.end()){
		cout << "The key \"" << key << "\" is in the map." << endl;
	}
	else{
		cout << "The key \"" << key << "\" is NOT in the map." << endl;
	}
	cout << endl;


	// iterate through the map and print out the map
	// the result is ordered by the natural order of the key
	cout << "The whole content of the map (ordered):" << endl;
	map<string, int>::iterator it = myMap.begin();
	while (it != myMap.end()) {
		cout << it -> first << " " << it -> second << endl;

		++it;
	}

	return 0;
}
