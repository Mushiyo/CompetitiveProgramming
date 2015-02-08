/* Filename: d130.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d130 {
	public static void main(String[] args) {
		int countOutput = 0;
		int homeNum = 6;

		while (countOutput < 10) {
			long sumLeft = sumLeft(homeNum);

			long rightNum = homeNum + 1;
			long c = -(2 * sumLeft) - rightNum * rightNum + rightNum;
			double possibleLast = (-1 + Math.sqrt(1 - 4 * c)) / 2;

			if (Math.ceil(possibleLast) == Math.floor(possibleLast)) {
				System.out.printf("%10d%10d\n", homeNum, (int) possibleLast);
				++countOutput;
			}

			++homeNum;
		}
	}

	private static long sumLeft(int homeNum) {
		return (1L + homeNum - 1) * (homeNum - 1) / 2;
	}
}
