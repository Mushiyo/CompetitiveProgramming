/* Filename: UVa1589.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class UVa1589 {
	private static final char[][] board = new char[10 + 1][9 + 1];
	private static final int G_INDEX = 0;
	private static final char EMPTY = '.';

	private static final int[] G_DIRECTX = { -1, 1, 0, 0 };
	private static final int[] G_DIRECTY = { 0, 0, -1, 1 };
	private static final int[] H_DIRECTX = { -2, -1, 1, 2, 2, 1, -1, -2 };
	private static final int[] H_DIRECTY = { 1, 2, 2, 1, -1, -2, -2, -1 };
	private static final int[] HOBBLEX = { -1, 0, 0, 1, 1, 0, 0, -1 };
	private static final int[] HOBBLEY = { 0, 1, 1, 0, 0, -1, -1, 0 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			if (N == 0) {
				break;
			}

			Piece[] pieces = new Piece[N + 1];
			pieces[G_INDEX] = new Piece('g', new Point(input.nextInt(),
					input.nextInt()));

			for (int i = 1; i < pieces.length; ++i) {
				pieces[i] = new Piece(input.next().charAt(0), new Point(
						input.nextInt(), input.nextInt()));
			}

			setBoard(pieces);

			if (isCheckmate(pieces)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static void setBoard(Piece[] pieces) {
		for (int i = 0; i < board.length; ++i) {
			Arrays.fill(board[i], EMPTY);
		}

		for (int i = 1; i < pieces.length; ++i) {
			board[pieces[i].position.x][pieces[i].position.y] = pieces[i].type;
		}
	}

	private static void printBoard() {
		for (int i = 1; i < board.length; ++i) {
			System.out.println(board[i]);
		}

		System.out.println("-----");
	}

	private static boolean isCheckmate(Piece[] pieces) {
		Point[] gMove = genMove(pieces[G_INDEX]);

		for (int g = 0; g < gMove.length; ++g) {
			char original = board[gMove[g].x][gMove[g].y];
			board[gMove[g].x][gMove[g].y] = 'g';
			pieces[G_INDEX].position = gMove[g];

			boolean isChecked = false;
			for (int i = 1; i < pieces.length && isChecked == false; ++i) {
				if (pieces[i].position.equals(gMove[g])) {
					continue;
				}

				switch (pieces[i].type) {
				case 'G':
				case 'R':
					if (pieces[i].position.y == pieces[G_INDEX].position.y) {
						if (countPieceBetween(pieces[i], pieces[G_INDEX]) == 0) {
							isChecked = true;
						}
					}
					if (pieces[i].type == 'R'
							&& pieces[i].position.x == pieces[G_INDEX].position.x) {
						if (countPieceBetween(pieces[i], pieces[G_INDEX]) == 0) {
							isChecked = true;
						}
					}
					break;
				case 'H':
					Point[] move = genMove(pieces[i]);
					for (int m = 0; m < move.length; ++m) {
						if (board[move[m].x][move[m].y] == 'g') {
							isChecked = true;
							break;
						}
					}
					break;
				case 'C':
					if ((pieces[i].position.y == pieces[G_INDEX].position.y)
							|| pieces[i].position.x == pieces[G_INDEX].position.x) {
						if (countPieceBetween(pieces[i], pieces[G_INDEX]) == 1) {
							isChecked = true;
						}
					}
					break;
				}
			}

			if (isChecked == false) {
				return false;
			}

			board[gMove[g].x][gMove[g].y] = original;
		}

		return true;
	}

	private static Point[] genMove(Piece p) {
		ArrayList<Point> moveList = new ArrayList<Point>();
		if (p.type == 'g') {
			for (int i = 0; i < G_DIRECTX.length; ++i) {
				int newGX = p.position.x + G_DIRECTX[i];
				int newGY = p.position.y + G_DIRECTY[i];
				if (1 <= newGX && newGX <= 3) {
					if (4 <= newGY && newGY <= 6) {
						moveList.add(new Point(newGX, newGY));
					}
				}
			}
		} else if (p.type == 'H') {
			for (int i = 0; i < H_DIRECTX.length; ++i) {
				int newGX = p.position.x + H_DIRECTX[i];
				int newGY = p.position.y + H_DIRECTY[i];
				if (1 <= newGX && newGX <= 10) {
					if (1 <= newGY && newGY <= 9) {
						int hobbleX = p.position.x + HOBBLEX[i];
						int hobbleY = p.position.y + HOBBLEY[i];
						if (board[hobbleX][hobbleY] == EMPTY) {
							moveList.add(new Point(newGX, newGY));
						}
					}
				}
			}
		}

		return moveList.toArray(new Point[moveList.size()]);
	}

	// count how many pieces between piece p1 and p2
	private static int countPieceBetween(Piece p1, Piece p2) {
		int count = 0;

		if (p1.position.y == p2.position.y) {
			int start = Math.min(p1.position.x, p2.position.x);
			int end = Math.max(p1.position.x, p2.position.x);

			for (int i = start + 1; i < end; ++i) {
				if (board[i][p1.position.y] != EMPTY) {
					++count;
				}
			}
		} else { // p1.position.x == p2.position.x
			int start = Math.min(p1.position.y, p2.position.y);
			int end = Math.max(p1.position.y, p2.position.y);

			for (int i = start + 1; i < end; ++i) {
				if (board[p1.position.x][i] != EMPTY) {
					++count;
				}
			}
		}

		return count;
	}

	private static class Piece {
		char type;
		Point position;

		Piece(char type, Point p) {
			this.type = type;
			position = p;
		}
	}

	private static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public boolean equals(Object p) {
			return this.x == ((Point) p).x && this.y == ((Point) p).y;
		}

		public String toString() {
			return String.format("(%d, %d)", x, y);
		}
	}
}
