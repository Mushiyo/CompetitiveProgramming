// TLE

/* Filename: UVa11951.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11951 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			
			for(int t = 1; t <= T; ++t){
				int N = input.nextInt();
				int M = input.nextInt();
				int K = input.nextInt();
				
				long[][] DP = new long[N + 1][M + 1];
				for(int i = 1; i < DP.length; ++i){
					for(int j = 1; j < DP[i].length; ++j){
						DP[i][j] = input.nextInt();
						DP[i][j] += DP[i - 1][j] + DP[i][j - 1] - DP[i - 1][j - 1];
					}
				}
				
				int S = 0;
				long P = Integer.MAX_VALUE;
				
				for(int up = 0; up < DP.length; ++up){
					for(int left = 0; left < DP[up].length; ++left){
						for(int low = up + 1; low < DP.length; ++low){
							int side1Len = low - up;
							int side2BaseLen = 1;
							
							if(S > 0){
								side2BaseLen = S / side1Len + S % side1Len != 0 ? 1 : 0;
							}
							
							for(int right = left + side2BaseLen; right < DP[low].length; ++right){
								long currentCost = DP[low][right] - DP[low][left] - DP[up][right] + DP[up][left];
								int currentArea = (right - left) * (low - up);
								
								if(currentCost <= K && currentArea >= S){									
									if(currentArea == S){
										P = Math.min(P, currentCost);
									} else {
										P = currentCost;
									}
									
									S = currentArea;
								}
							}
						}
					}
				}
				
				if(S == 0){ // no solution
					P = 0;
				}
				
				System.out.printf("Case #%d: %d %d\n", t, S, P);
			}
		}
	}

}
