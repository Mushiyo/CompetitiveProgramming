/* Filename: d366.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d366 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			while(N > 0){
				int L = input.nextInt();
				int U = input.nextInt();
				
				int D = 1;
				int P = L;
				for(int i = L; i <= U; ++i){
					int divisorNum = 1;
					int currentI = i;
					int sqrtI = (int)Math.sqrt(i);
					
					for(int j = 2; j <= sqrtI && currentI != 1; ++j){
						int countCurrentDivisor = 0;
						
						while(currentI % j == 0){
							++countCurrentDivisor;
							currentI /= j;
						}
						
						divisorNum *= countCurrentDivisor + 1;
					}
					
					if(currentI != 1){
						divisorNum *= 2;
					}
					
					if(divisorNum > D){
						D = divisorNum;
						P = i;
					}
				}
				
				
				System.out.printf("Between %d and %d, %d has a maximum of %d divisors.\n", L, U, P, D);
				
				--N;
			}
		}
	}
}
