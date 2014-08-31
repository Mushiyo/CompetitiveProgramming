// TLE

/* Filename: UVa10990.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVa10990 {
	final static int SIZE = 2000000 + 1;
	static boolean[] isPrime = new boolean[SIZE];
	static int[] depth = new int[SIZE];
	static int[] phi = new int[SIZE];
	private final static int NOT_COMPUTED = 0;

	public static void main(String[] args) {
		sievePrime();

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			while (N > 0) {
				int m = input.nextInt();
				int n = input.nextInt();

				System.out.println(SODF(m, n));

				--N;
			}
		}
	}

	public static void sievePrime() {
		Arrays.fill(isPrime, 2, SIZE, true);

		int sqrtSize = (int) Math.sqrt(SIZE) + 1;

		for (int i = 2; i < sqrtSize; ++i) {
			if (isPrime[i] == true) {
				for (int j = i * i; j < SIZE; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}

	static int SODF(int m, int n) {
		int sum = 0;

		for (int i = m; i <= n; ++i) {
			sum += depthphi(i);
		}

		return sum;
	}

	static int depthphi(int n) {
		int countDepth = 0;

		while (n != 1) {
			if (depth[n] == NOT_COMPUTED) {
				n = eulersTotient(n);
			} else {
				countDepth += depth[n];
				break;
			}

			++countDepth;
		}

		depth[n] = countDepth;

		return countDepth;
	}

	public static int eulersTotient(int n) {
		if (phi[n] != NOT_COMPUTED) {
			return phi[n];
		}

		if (isPrime[n]) {
			if (phi[n] != NOT_COMPUTED) {
				phi[n] = n - 1;
			}
			return n - 1;
		}

		int sqrtN = (int) Math.sqrt(n);
		int relPrimeNum = n;

		if (n % 2 == 0) {
			relPrimeNum -= relPrimeNum / 2;

			while (n % 2 == 0) {
				n /= 2;
			}
		}

		for (int i = 3; i <= sqrtN && n != 1; i += 2) {
			if (n % i == 0) {
				relPrimeNum -= relPrimeNum / i;

				while (n % i == 0) {
					n /= i;
				}
			}
		}

		if (n != 1) {
			relPrimeNum -= relPrimeNum / n;
		}

		phi[n] = relPrimeNum;
		return relPrimeNum;
	}
}
