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
	
	public static boolean nextPermutation(char[] element) {
		int i = element.length - 2;

		// find the first decreasing point
		while (i >= 0 && element[i] >= element[i + 1]) {
			--i;
		}

		if (i < 0) {
			for (int j = 0, k = element.length - 1; j < k; ++j, --k) {
				char tmp = element[j];
				element[j] = element[k];
				element[k] = tmp;
			}

			return false;
		}

		int j = element.length - 1;
		while (element[i] >= element[j]) {
			--j;
		}

		char tmp = element[i];
		element[i] = element[j];
		element[j] = tmp;

		int r = element.length - 1;
		int s = i + 1;

		while (r > s) {
			tmp = element[r];
			element[r] = element[s];
			element[s] = tmp;

			--r;
			++s;
		}

		return true;
	}
}
