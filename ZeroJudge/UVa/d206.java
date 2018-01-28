/* Filename: d206.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d206 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int[][] DP = new int[N + 1][N + 1];
			
			for(int i = 1; i < DP.length; ++i){
				for(int j = 1; j < DP[i].length; ++j){
					DP[i][j] = input.nextInt();
					// the sum from the original rectangle[1][1] to rectangle[i][j]
					DP[i][j] += DP[i - 1][j] + DP[i][j - 1] - DP[i - 1][j - 1];
				}
			}
			
			int max = Integer.MIN_VALUE;
			for(int left = 0; left < DP.length; ++left){
				for(int up = 0; up < DP[left].length; ++up){
					for(int right = left + 1; right < DP.length; ++right){
						for(int low = up + 1; low < DP[right].length; ++ low){
							int currentSum = DP[right][low] - DP[left][low] - DP[right][up] + DP[left][up];
							max = Math.max(max, currentSum);
						}
					}
				}
			}
			
			System.out.println(max);
		}
	}
}
