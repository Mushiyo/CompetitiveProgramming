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

	public static long largestPrimeDivisor(long N) {
		int sqrtN = (int) Math.sqrt(N);
		long largestPrimeDivisor = -1;
		int primeDivisorNum = 0;

		if (N != 2) {
			if (N % 2 == 0) {
				++primeDivisorNum;
				largestPrimeDivisor = 2;
				while (N % 2 == 0) {
					N /= 2;
				}
			}
		}

		for (int i = 3; i <= sqrtN && N != 1; i += 2) {
			if (N % i == 0) {
				++primeDivisorNum;
				largestPrimeDivisor = i;
				while (N % i == 0) {
					N /= i;
				}
			}
		}

		if (N != 1 && largestPrimeDivisor != -1) {
			return N;
		} else if (primeDivisorNum == 1) {
			return -1;
		} else {
			return largestPrimeDivisor;
		}
	}
}
