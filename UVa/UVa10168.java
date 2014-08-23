/* Filename: UVa10168.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UVa10168 {
	private final static int upperBound = 10000000 + 1;
	private static boolean[] isPrime = new boolean[upperBound];

	public static ArrayList<Integer> primeList() {
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
		ArrayList<Integer> prime = primeList();
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			boolean isPossible = false;

			if (N % 2 == 0) {
				if (N - 4 > 0) {
					N = N - 4;

					for (int i = 0; i < prime.size() && prime.get(i) < N; ++i) {
						if (isPrime[N - prime.get(i)]) {
							isPossible = true;
							int prime1 = prime.get(i);
							int prime2 = N - prime.get(i);

							System.out.println(2 + " " + 2 + " " + prime1 + " " + prime2);
							isPossible = true;
							break;
						}
					}
				}
			} else if (N - 5 > 2) {
				N = N - 2 - 3;

				for (int i = 0; i < prime.size() && prime.get(i) < N; ++i) {
					if (isPrime[N - prime.get(i)]) {
						isPossible = true;
						int prime1 = prime.get(i);
						int prime2 = N - prime.get(i);

						System.out.println(2 + " " + 3 + " " + prime1 + " " + prime2);
						isPossible = true;
						break;
					}
				}
			}

			if (isPossible == false) {
				System.out.println("Impossible.");
			}
		}
	}
}
