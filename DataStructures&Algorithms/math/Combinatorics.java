/* Filename: Combinatorics.java
 * Author: Mushiyo
 */
package math;

public class Combinatorics {
	public static long factorial(int n) {
		int nFactorial = 1;

		for (int i = 2; i <= n; ++i) {
			nFactorial *= i;
		}

		return nFactorial;
	}

	public static long permutation(int n, int m) {
		int p = 1;

		for (int i = n - m + 1; i <= n; ++i) {
			p *= i;
		}

		return p;
	}

	public static long combination(int n, int m) {
		long c = 1;

		for (int i = Math.max(m, n - m) + 1, j = 1; i <= n; ++i, ++j) {
			c = (c * i) / j;
		}

		return c;
	}
}
