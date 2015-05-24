/*Filename: ntuj1945.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <stdio.h>
#include <cstring>

using namespace std;

const int CHARSET = 26, BASE = 'a', MAX_NODE = 100000;

int child[MAX_NODE][CHARSET];

struct Trie {
	int tot, root;
	//	int child[MAX_NODE][CHARSET];
	bool flag[MAX_NODE];
	int siblingNum[MAX_NODE];
	int branch;

	Trie() {
		memset(child[1], 0, sizeof(child[1]));
		flag[1] = false;
		root = tot = 1;

		memset(siblingNum, 0, sizeof(siblingNum));
		branch = 0;
	}

	void insert(const char *str) {
		int *cur = &root;
		for (const char *p = str; *p; ++p) {
			int nodeID = *cur;
			cur = &child[*cur][*p - BASE];
			if (*cur == 0) {
				*cur = ++tot;
				memset(child[tot], 0, sizeof(child[tot]));
				flag[tot] = false;

				//cout << *p ;
				++siblingNum[nodeID];
				if(siblingNum[nodeID] > 1){
					++branch;
				}
			}
		}

		flag[*cur] = true;
	}

	bool query(const char *str) {
		int *cur = &root;
		for (const char *p = str; *p && *cur; ++p) {
			cur = &child[*cur][*p - BASE];
		}
		return (*cur && flag[*cur]);
	}



	void print() {
		for (int i = 0; i < 20; ++i) {
			printf("%2d ", i);
			for (int j = 0; j < CHARSET; ++j) {
				//cout << child[i][j] << " ";
				printf("%2d ", child[i][j]);
			}
			cout << endl;
		}
	}
};

int main() {
	int N = 0;

	while (cin >> N) {
		Trie dict;

		for (int i = 0; i < N; ++i) {
			string s;
			cin >> s;

			dict.insert(s.c_str());
		}

		//cout << dict.branch;

//		printf("   ");
//		for (int i = 0; i < 26; ++i) {
//			printf("%2c ", 'a' + i);
//		}
//		cout << endl;
//		dict.print();

		for(int i = 0; i < 20; ++i){
			cout << dict.siblingNum[i] << " ";
		}
		cout << endl;

//		cout << dict.query("he") << endl;
//		cout << dict.query("hello") << endl;
	}

	return 0;
}
