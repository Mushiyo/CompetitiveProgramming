/* Filename: UVa11520.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa11520 {
	final static int DIRECTION = 4;
	final static int[] dx = { 0, -1, 1, 0 };
	final static int[] dy = { -1, 0, 0, 1 };

	// the 4 direction left, up, down, right

	public static char fillChar(char[][] grid, int x, int y){
		for(int i = 0; i < 26; ++i){
			boolean canFill = true;
			 for(int d = 0; d < DIRECTION; ++d){
				 if('A' + i == grid[x + dx[d]][y + dy[d]]){
					 canFill = false;
					 break;
				 }
			 }
			 
			 if(canFill){
				 return (char)('A' + i);
			 }
		}
		
		return 'A';
	}

	public static void main(String[] args) {
		final char SPACE = '.';
		final int maxN = 10 + 2;
		char[][] grid = new char[maxN][maxN];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int testCase = input.nextInt();

			for (int c = 1; c <= testCase; ++c) {
				int n = input.nextInt();

				for (int i = 0; i < grid.length; ++i) {
					Arrays.fill(grid[i], SPACE);
				}

				for (int i = 1; i <= n; ++i) {
					String row = input.next();

					for (int j = 1; j <= n; ++j) {
						grid[i][j] = row.charAt(j - 1);
					}
				}

				for (int i = 1; i <= n; ++i) {
					for (int j = 1; j <= n; ++j) {
						if (grid[i][j] == SPACE) {
							grid[i][j] = fillChar(grid, i, j);
						}
					}
				}

				System.out.printf("Case %d:\n", c);
				for (int i = 1; i <= n; ++i) {
					for (int j = 1; j <= n; ++j) {
						System.out.print(grid[i][j]);
					}
					System.out.println();
				}
			}
		}
	}
}
