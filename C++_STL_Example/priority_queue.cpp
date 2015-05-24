/*Filename: priority_queue.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <queue>

using namespace std;

int main() {
	int numbers[] = { 2, 15, 17, 19, 5, 24, 12, 6 };
	priority_queue<int> maxHeap(numbers, numbers + 8);
	priority_queue<int, vector<int>, greater<int> > minHeap(numbers,
			numbers + 8);

	cout << "the order of the elements in maxHeap:" << endl;
	while (!maxHeap.empty()) {
		cout << maxHeap.top() << " ";
		maxHeap.pop();
	}
	cout << endl << endl;

	cout << "the order of the elements in minHeap:" << endl;
	while (!minHeap.empty()) {
		cout << minHeap.top() << " ";
		minHeap.pop();
	}
	cout << endl;

	return 0;
}
