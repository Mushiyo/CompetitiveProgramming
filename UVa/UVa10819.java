/* Filename: UVa10819.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10819 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int m = input.nextInt();
			int n = input.nextInt();
			int[] p = new int[n + 1];
			int[] f = new int[n + 1];

			for (int i = 1; i < p.length; ++i) {
				p[i] = input.nextInt();
				f[i] = input.nextInt();
			}
			
			final int MAX_FAVOR = 5;
			int[][] DP = new int[n + 1][MAX_FAVOR * n + 1];
			final int INF = 1 << 20;
			Arrays.fill(DP[0], INF);
			DP[0][0] = 0;
			for (int itemId = 1; itemId < DP.length; ++itemId) {
				for (int favor = 1; favor < DP[itemId].length; ++favor) {
					if (favor - f[itemId] >= 0) {
						DP[itemId][favor] = Math.min(DP[itemId - 1][favor], DP[itemId - 1][favor - f[itemId]] + p[itemId]);
					} else {
						DP[itemId][favor] = DP[itemId - 1][favor];
					}
				}
			}
			
			int maxFavor = 0;
			for(int favor = DP[n].length - 1; favor > 0; --favor){
				if(DP[n][favor] <= m){
					maxFavor = favor;
					break;
				} else if(DP[n][favor] > 2000){
					if(DP[n][favor] - 200 <= m){
						maxFavor = favor;
						break;
					}
				}
			}
			
			System.out.println(maxFavor);
		}
	}
}
