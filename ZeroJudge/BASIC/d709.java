/* Filename: d709.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Arrays;
import java.util.Scanner;

public class d709 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int upperBound = 1000000;
		boolean[] isPrime = sieve(upperBound);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			int N = input.nextInt();

			if (N == 0) {
				break;
			}

			if (isPrime[N]) {
				output.append("0\n");
			} else {
				output.append("1\n");
			}

		}
		
		System.out.println(output);
	}

	public static boolean[] sieve(int upperBound) {
		boolean[] isPrime = new boolean[upperBound];

		Arrays.fill(isPrime, 2, upperBound, true);

		int sqrtSize = (int) Math.sqrt(upperBound) + 1;

		for (int i = 2; i < sqrtSize; ++i) {
			if (isPrime[i] == true) {
				for (int j = i * i; j < upperBound; j += i) {
					isPrime[j] = false;
				}
			}
		}

		return isPrime;
	}

}
