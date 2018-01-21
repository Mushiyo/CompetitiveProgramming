/* Filename: UVa10337.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10337 {
	static final int INF = 1 << 20;
	static final int FUEL_CLIMB = 60;
	static final int FUEL_HOLD = 30;
	static final int FUEL_SINK = 20;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ALTITUDE_LEVEL = 10;
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			while(N-- > 0){
				int X = input.nextInt();
				int[][] windstrength = new int[ALTITUDE_LEVEL][X / 100];
				
				for(int altitude = 9; altitude >= 0; --altitude){
					for(int x = 0; x < windstrength[altitude].length; ++x){
						windstrength[altitude][x] = input.nextInt();
					}
				}
				
				int[][] DP = new int[ALTITUDE_LEVEL][X / 100];
				for(int i = 0; i < DP.length; ++i){
					Arrays.fill(DP[i], INF);
				}
				
				System.out.println(findMinFuel(0, 0, windstrength, DP));
				System.out.println();
			}
		}
	}

	private static int findMinFuel(int currAlt, int currPos, int[][] windstrength, int[][] DP){
		if(currPos == windstrength[0].length){
			if(currAlt > 0){
				return INF;
			} else {
				return 0;
			}
		}
		
		if(DP[currAlt][currPos] < INF){
			return DP[currAlt][currPos];
		} else {
			DP[currAlt][currPos] = findMinFuel(currAlt, currPos + 1, windstrength, DP) + FUEL_HOLD - windstrength[currAlt][currPos];
			
			if(currAlt + 1 <= 9){
				DP[currAlt][currPos] = Math.min(DP[currAlt][currPos], findMinFuel(currAlt + 1, currPos + 1, windstrength, DP) + FUEL_CLIMB - windstrength[currAlt][currPos]);
			}
			
			if(currAlt - 1 >= 0){
				DP[currAlt][currPos] = Math.min(DP[currAlt][currPos], findMinFuel(currAlt - 1, currPos + 1, windstrength, DP) + FUEL_SINK - windstrength[currAlt][currPos]);
			}
		}
		
		return DP[currAlt][currPos];
	}
}
