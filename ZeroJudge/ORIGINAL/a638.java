// TLE
/* Filename: a638.java
 * Author: Mushiyo
 */
package ORIGINAL;

import java.util.Scanner;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.awt.Point;

public class a638 {
	static PointComparator xMajor = new PointComparator(true);
	static PointComparator yMajor = new PointComparator(false);
	final static int MAX_N = 3000000 + 1;
	static Point[] xOrdered = new Point[MAX_N];
	static Point[] yOrdered = new Point[MAX_N];
	static Point[] lInRange = new Point[MAX_N];
	static Point[] rInRange = new Point[MAX_N];
	static Point[] yOrderedSepByX = new Point[MAX_N];
	static Point[] tmp;
	static Map<Point, Integer> posInX = new HashMap<Point, Integer>();
	final static double INF = Double.MAX_VALUE;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			for (int i = 0; i < N; ++i) {
				xOrdered[i] = new Point(input.nextInt(), input.nextInt());
			}
			Arrays.sort(xOrdered, 0, N, xMajor);

			posInX.clear();
			for (int i = 0; i < N; ++i) {
				posInX.put(xOrdered[i], i);
			}

			System.arraycopy(xOrdered, 0, yOrdered, 0, N);
			Arrays.sort(yOrdered, 0, N, yMajor);

			double minDist = closestPairDist(yOrdered, 0, N);

			System.out.printf("%.4f\n", minDist);
		}
	}

	static double closestPairDist(Point[] Y, int L, int R) { // [L,R)
		if (R - L == 1) {
			return INF;
		} else if (R - L == 2) {
			return xOrdered[L].distance(xOrdered[L + 1]);
		} else {
			// divide into two case
			int M = (L + R) / 2;

			// divide y into half by their x value
			int lHead = 0, rHead = 0;
			Point[] yL = new Point[M - L];
			Point[] yR = new Point[R - M];
			for (int i = 0; i < R - L; ++i) {
				if (posInX.get(Y[i]) < M) {
					yL[lHead++] = Y[i];
				} else {
					yR[rHead++] = Y[i];
				}
			}

			double minDistL = closestPairDist(yL, L, M);
			double minDistR = closestPairDist(yR, M, R);

			// merge
			return merge(yL, yR, L, M, R, Math.min(minDistL, minDistR));
		}
	}

	static double merge(Point[] yL, Point[] yR, int L, int M, int R, double d) {
		double divideLine = (double) (xOrdered[M - 1].x + xOrdered[M].x) / 2;
		double minDist = d;
		
		int lInRangeLen = 0;
		for (int i = 0; i < yL.length; ++i) {
			if (yL[i].x >= divideLine - d) {
				lInRange[lInRangeLen++] = yL[i];
			}
		}

		int rInRangeLen = 0;
		for (int i = 0; i < yR.length; ++i) {
			if (yR[i].x <= divideLine + d) {
				rInRange[rInRangeLen++] = yR[i];
			}
		}

		int head = 0;
		int end = 0;
		for (int i = 0; i < lInRangeLen; ++i) {
			while (head < rInRangeLen && rInRange[head].y < lInRange[i].y - d) {
				++head;
			}

			while (end < rInRangeLen && rInRange[end].y <= lInRange[i].y + d) {
				++end;
			}

			if (head == rInRangeLen) {
				break;
			}

			for (int j = head; j < end; ++j) {
				minDist = Math.min(minDist, lInRange[i].distance(rInRange[j]));
			}
		}

		return minDist;
	}

	static class PointComparator implements Comparator<Point> {
		boolean xMajor = true;
		boolean aScendingOrder = true;

		PointComparator(boolean majorAxis) {
			xMajor = majorAxis;
		}

		PointComparator(boolean majorAxis, boolean isAscending) {
			xMajor = majorAxis;
			aScendingOrder = isAscending;
		}

		@Override
		// compare p1 & p2, the result can vary depending the major axis and
		// sorting order
		public int compare(Point p1, Point p2) {
			if (aScendingOrder) {
				if (xMajor) {
					if (p1.x != p2.x) {
						return p1.x > p2.x ? 1 : -1;
					} else {
						if (p1.y != p2.y) {
							return p1.y > p2.y ? 1 : -1;
						} else {
							return 0;
						}
					}
				} else { // yMajor
					if (p1.y != p2.y) {
						return p1.y > p2.y ? 1 : -1;
					} else {
						if (p1.x != p2.x) {
							return p1.x > p2.x ? 1 : -1;
						} else {
							return 0;
						}
					}
				}
			} else {
				if (xMajor) {
					if (p1.x != p2.x) {
						return p1.x < p2.x ? 1 : -1;
					} else {
						if (p1.y != p2.y) {
							return p1.y < p2.y ? 1 : -1;
						} else {
							return 0;
						}
					}
				} else { // yMajor
					if (p1.y != p2.y) {
						return p1.y < p2.y ? 1 : -1;
					} else {
						if (p1.x != p2.x) {
							return p1.x < p2.x ? 1 : -1;
						} else {
							return 0;
						}
					}
				}
			}

		}

		// set the majorAxis, true for x major order, false for y major order
		public boolean setXMajor(boolean majorAxis) {
			xMajor = majorAxis;

			return xMajor;
		}

		// set to sort in ascending order (true) or descending order (false)
		public boolean setAsending(boolean isAscending) {
			aScendingOrder = isAscending;

			return aScendingOrder;
		}
	}
}
