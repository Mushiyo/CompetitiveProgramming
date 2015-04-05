/* Filename: a867.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;
import java.util.Arrays;

public class a867 {

	public static void main(String[] args) {
		final int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
		final int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
		Scanner input = new Scanner(System.in);
		final int MAX_ROW = 15;
		final int MAX_COL = 30;
		char[][] board = new char[MAX_ROW + 2][MAX_COL + 2];

		while (input.hasNext()) {
			for (int i = 1; i < board.length - 1; ++i) {
				System.arraycopy(input.next().toCharArray(), 0, board[i], 1,
						MAX_COL);
			}

			for (int i = 1; i < board.length - 1; ++i) {
				for (int j = 1; j < board[i].length - 1; ++j) {
					if (board[i][j] == '.') {
						int countBomb = 0;

						for (int d = 0; d < dx.length; ++d) {
							if (board[i + dx[d]][j + dy[d]] == '*') {
								++countBomb;
							}
						}

						if (countBomb > 0) {
							board[i][j] = (char) (countBomb + '0');
						}
					}
				}

				System.out.println(new String(board[i], 1, MAX_COL));
			}
		}
	}

}
