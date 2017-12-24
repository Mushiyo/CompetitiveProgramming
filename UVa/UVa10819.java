
// need debug
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

			if (m + 200 > 2000) {
				m += 200;
			}

			int[][] DP = new int[n + 1][m + 1];
			for (int itemId = 1; itemId < DP.length; ++itemId) {
				for (int money = 1; money < DP[itemId].length; ++money) {
					if (money - p[itemId] >= 0) {
						DP[itemId][money] = Math.max(DP[itemId - 1][money],
								DP[itemId - 1][money - p[itemId]] + f[itemId]);
					}
				}
			}

			System.out.println(DP[n][m]);
		}
	}
}
