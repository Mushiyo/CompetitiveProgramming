
/* Filename: UVa10130.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10130 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T-- > 0) {
				int N = input.nextInt();
				int[] P = new int[N + 1];
				int[] W = new int[N + 1];

				for (int i = 1; i < P.length; ++i) {
					P[i] = input.nextInt();
					W[i] = input.nextInt();
				}

				int G = input.nextInt();
				int[] MW = new int[G];
				int maxWeight = 0;
				for (int i = 0; i < MW.length; ++i) {
					MW[i] = input.nextInt();
					maxWeight = Math.max(maxWeight, MW[i]);
				}

				int[][] DP = new int[N + 1][maxWeight + 1];
				for (int item = 1; item < DP.length; ++item) {
					for (int weight = 1; weight < DP[item].length; ++weight) {
						if (weight - W[item] >= 0) {
							DP[item][weight] = Math.max(DP[item - 1][weight], DP[item - 1][weight - W[item]] + P[item]);
						} else {
							DP[item][weight] = DP[item - 1][weight];
						}
					}
				}

				int maxVal = 0;
				for(int i = 0; i < MW.length; ++i){
					maxVal += DP[N][MW[i]];
				}
								
				System.out.println(maxVal);
			}
		}
	}

}
