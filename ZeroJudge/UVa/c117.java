/* Filename: c117.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class c117 {
	public static void main(String[] args) {
		final int[] dr = { -2, -1, 1, 2, 2, 1, -1, -2 };
		final int[] dc = { 1, 2, 2, 1, -1, -2, -2, -1 };
		final int DIRECTIONS = 8;
		final int SIZE = 8 + 1;
		int[][] chessboard = new int[SIZE][SIZE];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			for (int i = 0; i < chessboard.length; ++i) {
				Arrays.fill(chessboard[i], -1);
			}

			Coordinate start = new Coordinate(input.next());
			Coordinate end = new Coordinate(input.next());
			Queue<Coordinate> q = new LinkedList<Coordinate>();

			q.add(start);
			chessboard[start.r][start.c] = 0;

			while (!q.isEmpty()) {
				Coordinate current = q.poll();

				if (current.equals(end)) {
					break;
				}

				for (int d = 0; d < DIRECTIONS; ++d) {
					int newR = current.r + dr[d];
					int newC = current.c + dc[d];

					if (newR < 1 || newC < 1 || newR >= SIZE || newC >= SIZE
							|| chessboard[newR][newC] > 0) {
						continue;
					} else {
						chessboard[newR][newC] = chessboard[current.r][current.c] + 1;
						q.add(new Coordinate(newR, newC));
					}
				}
			}

			System.out.println("To get from " + start + " to " + end
					+ " takes " + chessboard[end.r][end.c] + " knight moves.");

		}
	}

	static class Coordinate {
		int r;
		int c;
		String coordinateStr;

		Coordinate(String coordinate) {
			r = coordinate.charAt(1) - '0';
			c = coordinate.charAt(0) - 'a' + 1;
			coordinateStr = coordinate;
		}

		Coordinate(int r, int c) {
			this.r = r;
			this.c = c;

			coordinateStr = new StringBuilder().append((char) ('a' + c - 1))
					.append((char) ('0' + r)).toString();
		}

		public String toString() {
			return coordinateStr;
		}

		public boolean equals(Coordinate c) {
			if (this.r == c.r && this.c == c.c) {
				return true;
			} else {
				return false;
			}
		}
	}

}
