/*Filename: d048.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <queue>

using namespace std;

int main() {
	int num = 0;
	int totalNum = 0;
	// a maxHeap for smallerHalf
	priority_queue<int> smallerHalf;
	// a minHeap for bigger half
	priority_queue<int, vector<int>, greater<int> > biggerHalf;

	while (cin >> num) {
		++totalNum;

		if (smallerHalf.empty() == true) {
			smallerHalf.push(num);
		} else {
			int currentMiddleNum = smallerHalf.top();

			if (num < currentMiddleNum) {
				smallerHalf.push(num);
			} else {
				biggerHalf.push(num);
			}

			// balance the two heap
			if (totalNum % 2 == 0) {
				while (smallerHalf.size() > biggerHalf.size()) {
					int tmp = smallerHalf.top();
					smallerHalf.pop();
					biggerHalf.push(tmp);
				}

				while (biggerHalf.size() > smallerHalf.size()) {
					int tmp = biggerHalf.top();
					biggerHalf.pop();
					smallerHalf.push(tmp);
				}

			} else {
				while (smallerHalf.size() > biggerHalf.size() + 1) {
					int tmp = smallerHalf.top();
					smallerHalf.pop();
					biggerHalf.push(tmp);
				}

				while (biggerHalf.size() > smallerHalf.size() - 1) {
					int tmp = biggerHalf.top();
					biggerHalf.pop();
					smallerHalf.push(tmp);
				}

			}

		}

		if (totalNum % 2 == 0) {
			long middleNum = (smallerHalf.top() + biggerHalf.top()) / 2;
			cout << middleNum << endl;
		} else {
			cout << smallerHalf.top() << endl;

		}
	}

	return 0;
}

