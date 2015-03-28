/* Filename: Q2014C.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Q2014C {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("pC.in"));
		PrintWriter out = new PrintWriter(new File("pC.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int R = input.nextInt();
				int C = input.nextInt();
				int boardSize = R * C;
				int M = input.nextInt();
				int diff = boardSize - M;

				char[][] board = new char[R][C];
				for (int i = 0; i < board.length; ++i) {
					Arrays.fill(board[i], '*');
				}

				out.printf("Case #%d:\n", t);
				if (M % C == 0 && boardSize - (M + C) > 0
						|| boardSize - (M + C + 1) > 0) {
					for (int i = 0; i < R && i * C < diff; ++i) {
						for (int j = 0; j < C; ++j) {
							if (i * C + j + 1 <= diff) {
								board[i][j] = '.';
							} else {
								break;
							}
						}
					}

					board[0][0] = 'c';

					for (int i = 0; i < board.length; ++i) {
						out.println(board[i]);
					}
				} else if ((M % R == 0 && boardSize - (M + R) > 0)
						|| boardSize - (M + R + 1) > 0) {
					for (int i = 0; i < C && i * R < diff; ++i) {
						for (int j = 0; j < R; ++j) {
							if (i * R + j + 1 <= diff) {
								board[j][i] = '.';
								
							} else {
								break;
							}
						}
					}

					board[0][0] = 'c';

					for (int i = 0; i < board.length; ++i) {
						out.println(board[i]);
					}
				} else {
					if (boardSize - M >= 4) {
						board[0][0] = 'c';
						//board[][]
					} else {
						out.println("Impossible");
					}
				}

			}
		}

		out.close();
	}
}
