/* Filename: d047.java
 * Author: Mushiyo
 */
package UVa;

import java.math.BigInteger;
import java.util.Scanner;

public class d047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isFirstOutput = true;

		while (input.hasNext()) {
			BigInteger year = input.nextBigInteger();

			if (isFirstOutput) {
				isFirstOutput = false;
			} else {
				System.out.println();
			}

			boolean isSpecialYear = false;
			if (isLeapYear(year)) {
				isSpecialYear = true;
				System.out.println("This is leap year.");
			}

			if (isHuluculu(year)) {
				isSpecialYear = true;
				System.out.println("This is huluculu festival year.");
			}

			if (isBulukulu(year)) {
				isSpecialYear = true;
				System.out.println("This is bulukulu festival year.");
			}

			if (isSpecialYear == false) {
				System.out.println("This is an ordinary year.");
			}
		}
	}

	static boolean isLeapYear(BigInteger year) {
		if (year.mod(BigInteger.valueOf(400)).equals(BigInteger.ZERO)) {
			return true;
		} else if (year.mod(BigInteger.valueOf(100)).equals(BigInteger.ZERO)) {
			return false;
		} else if (year.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO)) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isHuluculu(BigInteger year) {
		if (year.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO)) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isBulukulu(BigInteger year) {
		if (year.mod(BigInteger.valueOf(55)).equals(BigInteger.ZERO)
				&& isLeapYear(year)) {
			return true;
		} else {
			return false;
		}
	}
}
