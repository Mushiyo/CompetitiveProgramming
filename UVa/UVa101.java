/* Filename: UVa101.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa101 {
	private static int NO_BLOCK = -1;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int[][] block = new int[n][n + 1];

			initialize(block);

			while (true) {
				String cmd = input.next();

				if (cmd.equals("quit")) {
					break;
				} else {
					int a = input.nextInt();
					String way = input.next();
					int b = input.nextInt();

					Position pA = findPosition(a, block);
					Position pB = findPosition(b, block);

					if (pA.row == pB.row) {
						continue;
					}

					if (way.equals("onto")) {
						returnAbove(pB, block);
					}

					if (cmd.equals("move")) {
						returnAbove(pA, block);
					}
					
					aToB(pA, pB, block);
				}
			}

			printBlock(block);
		}
	}

	private static void initialize(int[][] block) {
		for (int i = 0; i < block.length; ++i) {
			block[i][0] = i;
		}

		for (int i = 0; i < block.length; ++i) {
			for (int j = 1; j < block[i].length; ++j)
				block[i][j] = NO_BLOCK;
		}
	}

	private static void printBlock(int[][] block) {
		for (int i = 0; i < block.length; ++i) {
			System.out.printf("%d:", i);
			for (int j = 0; j < block[i].length; ++j) {
				if (block[i][j] != NO_BLOCK) {
					System.out.printf(" %d", block[i][j]);
				}
			}
			System.out.println();
		}
	}

	private static Position findPosition(int num, int[][] block) {
		int row = 0;
		int height = 0;

		for (int i = 0; i < block.length; ++i) {
			for (int j = 0; j < block[i].length; ++j) {
				if (block[i][j] == num) {
					row = i;
					height = j;
					break;
				}
			}
		}

		return new Position(row, height);
	}

	private static void returnAbove(Position p, int[][] block) {
		int row = p.row;
		int height = p.height;

		for (int h = height + 1; h < block[row].length; ++h) {
			if (block[row][h] != NO_BLOCK) {
				block[block[row][h]][0] = block[row][h];
				block[row][h] = NO_BLOCK;
			}
		}
	}

	private static void aToB(Position pA, Position pB, int[][] block) {
		int bEnd = pB.height;
		while (block[pB.row][bEnd] != NO_BLOCK) {
			++bEnd;
		}

		int cursor = pA.height;
		while (block[pA.row][cursor] != NO_BLOCK) {
			block[pB.row][bEnd] = block[pA.row][cursor];
			block[pA.row][cursor] = NO_BLOCK;
			++bEnd;
			++cursor;
		}
	}

	private static class Position {
		int row, height;

		Position(int row, int height) {
			this.row = row;
			this.height = height;
		}
	}
}
