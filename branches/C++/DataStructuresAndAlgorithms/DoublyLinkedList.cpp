#include <iostream>

#ifndef DOUBLY_LINKEDLIST_H
#define DOUBLY_LINKEDLIST_H

template<typename T>
class Node {
public:
	T *head;
	T content;
	T *tail;
};

template<typename T>
class DoublyLinkerList {
public:
	DoublyLinkerList(){
		head = NULL;
		tail = NULL;
	}

	~DoublyLinkerList(){
		clear();
	}

	bool add(T &e);
	void add(int index, T &e);
	void addFirst(T &e);
	void addLast(T &e);
	void clear();

private:
	Node<T> *head;
	Node<T> *tail;
};



#endif

int main(){

	return 0;
}
