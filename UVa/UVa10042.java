/* Filename: UVa10042.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10042 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int caseNum = input.nextInt();
			while (caseNum > 0) {
				int n = input.nextInt();

				System.out.println(findNextSmithNum(n));
				--caseNum;
			}
		}
	}

	public static int findNextSmithNum(int n) {
		++n;

		while (digitSum(n) != primeFactorDigitSum(n)) {
			++n;
		}

		return n;
	}

	public static int digitSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

	public static int primeFactorDigitSum(int n) {
		int sqrtN = (int) Math.sqrt(n);
		int primeFactorDigitSum = 0;

		if (n != 2) {
			while (n % 2 == 0) {
				primeFactorDigitSum += 2;
				n /= 2;
			}
		}

		int digitSumI = 0;
		for (int i = 3; i <= sqrtN && n != 1; i += 2) {

			if (n % i == 0) {
				digitSumI = digitSum(i);
			}

			while (n % i == 0) {
				primeFactorDigitSum += digitSumI;
				n /= i;
			}
		}

		if (n != 1 && primeFactorDigitSum != 0) {
			primeFactorDigitSum += digitSum(n);
		}

		return primeFactorDigitSum;
	}
}
