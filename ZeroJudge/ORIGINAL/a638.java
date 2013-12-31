/* Filename: a638.java
 * Author: Mushiyo
 */
package ORIGINAL;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class a638 {
	final static int MAX_N = 3000000 + 1;
	static Point[] p = new Point[MAX_N];

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			for (int i = 0; i < N; ++i) {
				p[i] = new Point(input.nextInt(), input.nextInt());
			}

			double minDist = closestPairDist(0, N);

			System.out.printf("%.4f\n", minDist);
		}
	}

	static double closestPairDist(int L, int R) { // [L,R)
		if (R - L < 5) {
			double minDist = Double.MAX_VALUE;

			for (int i = L; i < R; ++i) {
				for (int j = L; j < R; ++j) {
					if (i == j) {
						continue;
					}

					double currDist = Math.hypot(p[i].x - p[j].x, p[i].y
							- p[j].y);

					minDist = Math.min(currDist, minDist);
				}
			}

			return minDist;
		} else {
			// divide into two case
			int M = (L + R) / 2;
			double leftMin = closestPairDist(L, M);
			double rightMin = closestPairDist(M, R);
			double divideMin = Math.min(leftMin, rightMin);

			// merge
			double mergeMin = merge(L, M, R, divideMin);

			return Math.min(divideMin, mergeMin);
		}
	}

	static double merge(int L, int M, int R, double d) {
		double divideLine = (double) (p[M - 1].x + p[M].x) / 2;

		Point.setXMajor(false);
		ArrayList<Point> lInRange = new ArrayList<Point>();
		for (int i = M - 1; i >= L; --i) {
			if (p[i].x >= divideLine - d) {
				lInRange.add(new Point(p[i]));
			}
			else{
				break;
			}
		}
		Collections.sort(lInRange);

		ArrayList<Point> rInRange = new ArrayList<Point>();
		for (int i = M; i < R; ++i) {
			if (p[i].x <= divideLine + d) {
				lInRange.add(new Point(p[i]));
			}
			else{
				break;
			}
		}
		Collections.sort(rInRange);
		
		int head = 0, end = 0;
		double minDist = Double.MAX_VALUE;
		for(int i = 0; i < lInRange.size(); ++i){
			while(head < rInRange.size() && rInRange.get(head).y < lInRange.get(i).y - d){
				++head;
			}
			
			end = head;
			while(end < rInRange.size() && rInRange.get(end).y <= lInRange.get(i).y + d){
				++end;
			}
			
			for(int j = head; j < end; ++j){
				 double currDist = Math.hypot(lInRange.get(i).x - rInRange.get(j).x, lInRange.get(i).y - rInRange.get(j).y);
				 minDist = Math.min(currDist, minDist);
			}
		}
		
		return minDist;
	}

	static class Point implements Comparable {
		static boolean xMajor = true;
		int x;
		int y;

		public Point(Point p) {
			this.x = p.x;
			this.y = p.y;
		}

		public Point(Point p, boolean xMajor) {
			this.x = p.x;
			this.y = p.y;
			this.xMajor = xMajor;
		}

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Point(int x, int y, boolean xMajor) {
			this.x = x;
			this.y = y;
			this.xMajor = xMajor;
		}

		public int compareTo(Object p) {
			if (xMajor) { // xMajor order
				if (this.x < ((Point) p).x) {
					return -1;
				} else if (this.x > ((Point) p).x) {
					return 1;
				} else {
					if (this.y < ((Point) p).y) {
						return -1;
					} else if (this.y > ((Point) p).y) {
						return 1;
					} else {
						return 0;
					}
				}
			} else { // yMajor order
				if (this.y < ((Point) p).y) {
					return -1;
				} else if (this.y > ((Point) p).y) {
					return 1;
				} else {
					if (this.x < ((Point) p).x) {
						return -1;
					} else if (this.x > ((Point) p).x) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		}

		static public boolean isXMajor() {
			return xMajor;
		}

		static public boolean setXMajor(boolean majorOrder) {
			xMajor = majorOrder;

			return xMajor;
		}
	}
}
