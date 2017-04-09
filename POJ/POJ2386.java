/* Filename: POJ2386.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class POJ2386 {
	private static int N = 0;
	private static int M = 0;
	private static char[][] field = new char[100][];
	private static final char WATER = 'W';
	private static final char DRY_LAND = '.';

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			N = input.nextInt();
			M = input.nextInt();

			for (int i = 0; i < N; ++i) {
				field[i] = input.next().toCharArray();
			}

			int poundNum = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < M; ++j) {
					if (field[i][j] == WATER) {
						++poundNum;
						DFS_Fill(i, j);
					}
				}
			}

			System.out.println(poundNum);

		}
	}

	private static void DFS_Fill(int x, int y) {
		field[x][y] = DRY_LAND;

		for (int dx = -1; dx <= 1; ++dx) {
			for (int dy = -1; dy <= 1; ++dy) {
				int newX = x + dx;
				int newY = y + dy;

				if (newX >= 0 && newX < N && newY >= 0 && newY < M
						&& field[newX][newY] == WATER) {
					DFS_Fill(newX, newY);
				}
			}
		}
	}
}
