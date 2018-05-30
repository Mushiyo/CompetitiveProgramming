/* Filename: UVa10943.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10943 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int K = input.nextInt();
			
			if(N == 0 && K == 0){
				break;
			}
			
			int[][] DP = new int[K + 1][N + 1];
			
			for(int n = 0; n < DP[1].length; ++n){
				DP[1][n] = 1;
			}
			
			for(int k = 2; k < DP.length; ++k){
				for(int n = 0; n < DP[k].length; ++n){
					for(int i = 0; i <= n; ++i){
						DP[k][n] += DP[k - 1][n - i];
						DP[k][n] %= 1e6;
					}
				}
			}
			
			System.out.println(DP[K][N]);
		}
	}

}
