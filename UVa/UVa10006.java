//TLE

/* Filename: UVa10006.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UVa10006 {
	final static int upperBound = 65000;
	static boolean[] isPrime = new boolean[upperBound];
	final static BigInteger[] bigA = new BigInteger[upperBound];

	public static void findPrime() {
		Arrays.fill(isPrime, 2, upperBound, true);

		int sqrtSize = (int) Math.sqrt(upperBound) + 1;

		for (int i = 2; i < sqrtSize; ++i) {
			if (isPrime[i] == true) {
				for (int j = i * i; j < upperBound; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		findPrime();

		for (int i = 0; i < upperBound; ++i) {
			bigA[i] = BigInteger.valueOf(i);
		}

		FastScanner input = new FastScanner(System.in);
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			if (isCarmichael(n)) {
				out.append(String.format(
						"The number %d is a Carmichael number.\n", n));
			} else {
				out.append(String.format("%d is normal.\n", n));
			}
		}

		System.out.print(out);
	}

	public static boolean isCarmichael(int n) {
		if (isPrime[n]) {
			return false;
		}

		BigInteger bigN = BigInteger.valueOf(n);
		for (int a = 2; a <= n - 1; ++a) {
			if (bigA[a].modPow(bigN, bigN).equals(bigA[a])) {
				return true;
			}
		}

		return false;
	}

	private static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		public boolean hasNext() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String line = br.readLine();
					if (line == null) {
						return false;
					}
					st = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return true;
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
