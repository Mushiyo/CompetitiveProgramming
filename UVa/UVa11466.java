/* Filename: UVa11466.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11466 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			long N = input.nextLong();

			if (N == 0) {
				break;
			}

			System.out.println(largestPrimeDivisor(Math.abs(N)));
		}
	}

	public static long largestPrimeDivisor(long n) {
		int sqrtN = (int) Math.sqrt(n);
		long largestPrimeDivisor = -1;
		int primeDivisorNum = 0;

		if (n != 2) {
			if (n % 2 == 0) {
				++primeDivisorNum;
				largestPrimeDivisor = 2;
				while (n % 2 == 0) {
					n /= 2;
				}
			}
		}

		for (int i = 3; i <= sqrtN && n != 1; i += 2) {
			if (n % i == 0) {
				++primeDivisorNum;
				largestPrimeDivisor = i;
				while (n % i == 0) {
					n /= i;
				}
			}
		}

		if (n != 1 && largestPrimeDivisor != -1) {
			return n;
		} else if (primeDivisorNum == 1) {
			return -1;
		} else {
			return largestPrimeDivisor;
		}
	}
}
