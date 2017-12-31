
/* Filename: UVa10616.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10616 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int setNumber = 1;
		
		while(input.hasNext()){
			int N = input.nextInt();
			int Q = input.nextInt();
			
			if(N == 0 && Q == 0){
				break;
			}
			
			int[] number = new int[N + 1];
			
			for(int i = 1; i < number.length; ++i){
				number[i] = input.nextInt();
			}
			
			System.out.printf("SET %d:\n", setNumber++);
			for(int q = 1; q <= Q; ++q){
				int D = input.nextInt();
				int M = input.nextInt();
				long[][][] DP = new long[N + 1][D][M + 1];
				
				for(int n = 1; n < DP.length; ++n){
					int mod = (number[n] % D + D) % D;
					DP[n][mod][1] = 1;
					
					for(int d = 0; d < DP[n].length; ++d){
						for(int m = 1; m < DP[n][d].length; ++m){
							DP[n][d][m] += DP[n - 1][d][m]; // ways without this number
							DP[n][d][m] += DP[n - 1][(-mod + d + D) % D][m - 1]; // ways with this number 
						}						
					}
					
				}
				
				System.out.printf("QUERY %d: %d\n", q, DP[N][0][M]);				
			}
		}
	}

}
