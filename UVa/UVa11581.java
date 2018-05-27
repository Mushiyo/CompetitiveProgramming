/* Filename: UVa11581.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa11581 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int caseNum = input.nextInt();

			while (caseNum-- > 0) {
				int[][] g = new int[3 + 2][3 + 2];

				for (int i = 1; i <= 3; ++i) {
					String row = input.next();
					
					for (int j = 1; j <= 3; ++j) {
						g[i][j] = row.charAt(j - 1) - '0';
					}
				}

				int i = -1;
				int[][] fg = f(g);

				while (isEqual(g, fg) == false) {
					++i;
					g = fg;
					fg = f(g);
				}

				System.out.println(i);
			}
		}
	}

	static int[] dx = { 0, -1, 1, 0 };
	static int[] dy = { -1, 0, 0, 1 };

	private static int[][] f(int[][] g) {
		int[][] fg = new int[g.length][g[0].length];

		for (int i = 1; i <= 3; ++i) {
			for (int j = 1; j <= 3; ++j) {
				for (int d = 0; d < dx.length; ++d) {
					fg[i][j] += g[i + dx[d]][j + dy[d]];
				}

				fg[i][j] %= 2;
			}
		}

		return fg;
	}

	private static boolean isEqual(int[][] a1, int[][] a2) {
		for (int i = 0; i < a1.length; ++i) {
			if (Arrays.equals(a1[i], a2[i]) == false) {
				return false;
			}
		}

		return true;
	}
}
