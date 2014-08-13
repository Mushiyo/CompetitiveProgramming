/* Filename: UVa686.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UVa686 {
	private static boolean[] isPrime = new boolean[1 << 16 + 1];

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
		final ArrayList<Integer> prime = primeList(1 << 16 + 1);

		while (input.hasNext()) {
			int num = input.nextInt();

			if (num == 0) {
				break;
			}

			int countPair = 0;
			for (int i = 0; i < prime.size() && num - prime.get(i) >= prime.get(i); ++i) {
				if (isPrime[num - prime.get(i)]) {
					++countPair;
				}
			}
			
			System.out.println(countPair);
		}
	}

}
