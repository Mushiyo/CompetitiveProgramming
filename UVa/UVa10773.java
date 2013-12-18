/* Filename: UVa10773.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10773 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();

		for (int t = 1; t <= testCase; ++t) {
			double d = input.nextDouble();
			double v = input.nextDouble();
			double u = input.nextDouble();

			if (u <= v || v == 0) {
				System.out.println("Case " + t + ": can't determine");
			} else {
				System.out.printf("Case %d: %.3f\n", t, countDiff(d, v, u));
			}

		}

	}

	public static double countDiff(double d, double v, double u) {
		return d / Math.sqrt(u * u - v * v) - d / u;
	}
}
