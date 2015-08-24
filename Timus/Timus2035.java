/* Filename: Timus2035.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus2035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int X = input.nextInt();
			int Y = input.nextInt();
			int C = input.nextInt();

			if (X + Y < C) {
				System.out.println("Impossible");
			} else {
				int minXY = Math.min(X, Y);
				if (C < minXY) {
					System.out.printf("%d %d\n", C, 0);
				} else {
					if (X == minXY) {
						System.out.printf("%d %d\n", X, C - X);
					} else if (Y == minXY) {
						System.out.printf("%d %d\n", C - Y, Y);
					}
				}

			}
		}
	}

}
