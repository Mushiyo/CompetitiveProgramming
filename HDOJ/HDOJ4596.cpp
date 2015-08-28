/*Filename: hdoj4596.cpp
 *Author: Mushiyo
 */

#include <iostream>

using namespace std;

long long gcd(long long a, long long b) {
	if (b == 0) {
		return a;
	}

	return gcd(b, a % b);
}

struct Wormhole {
	int X;
	int Y;
	int Z;
};

int main() {
	int N = 0;

	while (cin >> N) {
		Wormhole wormhole[N];
		for (int i = 0; i < N; ++i) {
			cin >> wormhole[i].X >> wormhole[i].Y >> wormhole[i].Z;
		}

		bool canTakeOff = true;
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				long long gcdX = gcd(wormhole[i].X, wormhole[j].X);
				long long left = wormhole[j].Y - wormhole[i].Z;
				long long right = wormhole[j].Z - wormhole[i].Y;

				for (long long cur = left; cur <= right; ++cur) {
					if (cur % gcdX == 0) {
						//cout << gcdX << " " << cur << " " << left << " " << right << endl;

						canTakeOff = false;
						break;
					}
				}

				if (canTakeOff == false) {
					break;
				}
			}

			if (canTakeOff == false) {
				break;
			}
		}

		if(canTakeOff){
			cout << "Can Take off" << endl;
		}
		else{
			cout << "Cannot Take off" << endl;
		}
	}

	return 0;
}
