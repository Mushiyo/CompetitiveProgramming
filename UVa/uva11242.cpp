/*Filename: uva11242.cpp
 *Author: Mushiyo
 */

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cfloat>

using namespace std;

int main(){
	int f = 0;

	while(cin >> f){
		if(f == 0){
			break;
		}

		int r = 0;
		cin >> r;

		int frontTeeth[f];
		for(int i = 0; i < f; ++i){
			cin >> frontTeeth[i];
		}

		int rearTeeth[r];
		for(int i = 0; i < r; ++i){
			cin >> rearTeeth[i];
		}
		
		const int ALL_RATIO = f * r;
		double driveRatio[ALL_RATIO];
		for(int i = 0; i < f; ++i){
			for(int j = 0; j < r; ++j){
				driveRatio[r * i + j] = (double) rearTeeth[j] / frontTeeth[i];
			}
		}

		sort(driveRatio, driveRatio + ALL_RATIO);

		double maxSpread = DBL_MIN;
		for(int i = 1; i < ALL_RATIO; ++i){
			double currSpread = driveRatio[i] / driveRatio[i - 1];

			maxSpread = max(currSpread, maxSpread);
		}

		printf("%.2f\n", maxSpread);
	}

	return 0;
}
