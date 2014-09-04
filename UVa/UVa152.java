/* Filename: UVa152.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa152 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Point[] tree = new Point[5000];

		int countTree = 0;

		while (true) {
			double x = input.nextDouble();
			double y = input.nextDouble();
			double z = input.nextDouble();

			if (x == 0 && y == 0 && z == 0) {
				break;
			}

			tree[countTree] = new Point(x, y, z);
			++countTree;
		}

		int[] histogram = new int[10];

		for (int i = 0; i < countTree; ++i) {
			double closestDist = Double.MAX_VALUE;

			for (int j = 0; j < countTree; ++j) {
				if (i == j) {
					continue;
				}

				closestDist = Math.min(closestDist, tree[i].dist(tree[j]));
			}

			if (closestDist < 10) {
				++histogram[(int) Math.floor(closestDist)];
			}
		}

		for (int i : histogram) {
			System.out.printf("%4d", i);
		}
		System.out.println();
	}

	private static class Point {
		double x;
		double y;
		double z;

		public Point(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public double dist(Point p) {
			return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y)
					+ (z - p.z) * (z - p.z));
		}
	}

}
