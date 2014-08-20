//TLE
/* Filename: UVa10892.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UVa10892 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			if (N == 0) {
				break;
			}

			List<Integer> factor = factor(N);
			int cardinality = 0;
			for (int i = 0; i < factor.size(); ++i) {
				for (int j = 0; j <= i; ++j) {
					if (lcm(factor.get(i), factor.get(j)) == N) {
						++cardinality;
					}
				}
			}

			System.out.printf("%d %d\n", N, cardinality);
		}

	}

	public static ArrayList<Integer> factor(int n) {
		ArrayList<Integer> factor = new ArrayList<Integer>();

		for (int i = 1; i <= n; ++i) {
			if (n % i == 0) {
				factor.add(i);
			}
		}

		return factor;
	}

	public static int lcm(int a, int b) {
		// gcd(a, b) * lcm(a, b) = a * b
		// lcm(a, b) = (a * b) / gcd(a, b)
		// since a * b might overflow
		// so use a / gcd(a, b) * b
		return a / gcd(a, b) * b;
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}
