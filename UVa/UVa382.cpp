/*Filename: uva382.cpp
 *Author: Mushiyo
 */

#include <cstdio>

using namespace std;

int main(){
	int N = 0;

	printf("PERFECTION OUTPUT\n");
	while(scanf("%d", &N) == 1){
		if(N == 0){
			printf("END OF OUTPUT\n");
			break;
		}

		int sumOfProperDivisor = 0;
		for(int i = 1; i < N; ++i){
			if(N % i == 0){
				sumOfProperDivisor += i;
			}
		}
		
		printf("%5d  ", N);
		if(sumOfProperDivisor < N){
			printf("DEFICIENT\n");
		}
		else if(sumOfProperDivisor > N){
			printf("ABUNDANT\n");
		}
		else{
			printf("PERFECT\n");
		}
	}

	return 0;
}
