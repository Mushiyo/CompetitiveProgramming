/* Filename: c050.java
 * Author: Mushiyo
 */
package UVa;

import java.util.ArrayList;
import java.util.Scanner;

public class c050 {
	private static boolean[] isPrime = new boolean[1000000 + 1];

	public static ArrayList<Integer> primeList(int upperBound) {
		for (int i = 2; i < upperBound; ++i) {
			isPrime[i] = true;
		}

		int sqrtSize = (int) Math.sqrt(upperBound) + 1;

		for (int i = 2; i < sqrtSize; ++i) {
			if (isPrime[i] == true) {
				for (int j = i * i; j < upperBound; j += i) {
					isPrime[j] = false;
				}
			}
		}

		ArrayList<Integer> prime = new ArrayList<Integer>();
		for (int i = 2; i < upperBound; ++i) {
			if (isPrime[i]) {
				prime.add(i);
			}
		}

		return prime;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		final ArrayList<Integer> prime = primeList(1000000 + 1);

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			int a = 0, b = 0;
			for (int i = 1; i < prime.size() && n > prime.get(i); ++i) {
				if (isPrime[n - prime.get(i)]) {
					a = prime.get(i);
					b = n - prime.get(i);

					break;
				}
			}

			if (a != 0) { // the answer is found
				output.append(String.format("%d = %d + %d\n", n, a, b));
			} else {
				output.append("Goldbach's conjecture is wrong.\n");
			}
		}

		System.out.print(output);
	}
}
