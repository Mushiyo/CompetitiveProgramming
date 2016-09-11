//TLE
/* Filename: ARC061D.java
 * Author: Mushiyo
 */

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.awt.Point;

public class ARC061D {
	static int[] dx = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
	static int[] dy = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int H = input.nextInt(), W = input.nextInt(), N = input.nextInt();

			if (N == 0) {
				System.out.println((long) (H - 2) * (W - 2));

				for (int i = 1; i <= 9; ++i) {
					System.out.println(0);
				}

				continue;
			}

			Set<Point> blackCell = new HashSet<Point>();
			for (int i = 0; i < N; ++i) {
				blackCell.add(new Point(input.nextInt(), input.nextInt()));
			}

			long[] count = new long[10];
			for (int i = 2; i < H; ++i) {
				for (int j = 2; j < W; ++j) {
					int countBlack = 0;
					for (int d = 0; d < dx.length; ++d) {
						int a = i + dx[d];
						int b = j + dy[d];

						if (blackCell.contains(new Point(a, b))) {
							++countBlack;
						}
					}

					++count[countBlack];
				}
			}

			for (long i : count) {
				System.out.println(i);
			}
		}
	}
}
