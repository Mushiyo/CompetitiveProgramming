/* Filename: UVa10310.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.awt.geom.Point2D;

public class UVa10310 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			Point2D gopherPos = new Point2D.Double(input.nextDouble(),
					input.nextDouble());
			Point2D dogPos = new Point2D.Double(input.nextDouble(),
					input.nextDouble());

			boolean canEscape = false;
			Point2D nearestHole = new Point2D.Double();
			for (int i = 0; i < n; ++i) {
				Point2D hole = new Point2D.Double(input.nextDouble(),
						input.nextDouble());

				if (canEscape == false && 2 * hole.distance(gopherPos) <= hole.distance(dogPos)) {
					canEscape = true;
					nearestHole = hole;
				}
			}

			if (canEscape) {
				System.out
						.printf("The gopher can escape through the hole at (%.3f,%.3f).\n",
								nearestHole.getX(), nearestHole.getY());
			} else {
				System.out.println("The gopher cannot escape.");
			}

		}
	}

}
