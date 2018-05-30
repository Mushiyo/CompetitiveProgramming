/* Filename: UVa10827.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10827 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int caseNum = input.nextInt();
			
			while(caseNum-- > 0){
				int N = input.nextInt();
				int[][] DP = new int[2 * N + 1][2 * N + 1];
				
				for(int i = 1; i <= N; ++i){
					for(int j = 1; j <= N; ++j){
						DP[i][j] = input.nextInt();
						DP[i + N][j] = DP[i][j];
						DP[i][j + N] = DP[i][j];
						DP[i + N][j + N] = DP[i][j];
					}
				}
				
				for(int i = 1; i < DP.length; ++i){
					for(int j = 1; j < DP[i].length; ++j){
						DP[i][j] += DP[i - 1][j] + DP[i][j - 1] - DP[i - 1][j - 1];
					}
				}
				
				int max = Integer.MIN_VALUE;
				for(int left = 0; left < DP.length; ++left){
					for(int up = 0; up < DP[left].length; ++up){
						int rightBound = Math.min(DP.length, left + N + 1);
						int lowerBound = Math.min(DP[left].length, up + N + 1);
						for(int right = left + 1; right < rightBound; ++right){
							for(int low = up + 1; low < lowerBound; ++ low){
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

}
