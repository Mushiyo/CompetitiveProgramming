/* Filename: UVa10306.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10306 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			while(n-- > 0){
				int m = input.nextInt();
				int S = input.nextInt();
				int S_Square = S * S;
				
				int[] conventionalVal = new int[m];
				int[] ITVal = new int[m]; 
				for(int i = 0; i < conventionalVal.length; ++i){
					conventionalVal[i] = input.nextInt();
					ITVal[i] = input.nextInt();
				}
				
				int[][] DP = new int[S + 1][S + 1];
				final int INF = 1 << 20;
				for(int i = 0; i < DP.length; ++i){
					Arrays.fill(DP[i], INF);
				}
				
				DP[0][0] = 0;
				int sol = INF;
				for(int x = 0; x < DP.length; ++x){
					for(int y = 0; y < DP[x].length; ++y){
						for(int c = 0; c < ITVal.length; ++c){
							if(conventionalVal[c] + x < DP.length && ITVal[c] + y < DP[x].length){
								DP[conventionalVal[c] + x][ITVal[c] + y] = Math.min(DP[x][y] + 1, DP[conventionalVal[c] + x][ITVal[c] + y]);
							}
							
							if(x * x + y * y == S_Square){
								sol = Math.min(sol, DP[x][y]);
							}
						}
					}
				}
				
				if(sol < INF){
					System.out.println(sol);
				} else {
					System.out.println("not possible");
				}
			}
		}
	}

}
