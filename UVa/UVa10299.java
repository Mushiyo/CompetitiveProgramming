/* Filename: UVa10299.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10299 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			if (n == 1) {
				out.append(0 + "\n");
			} else {
				out.append(eulersTotient(n) + "\n");
			}
		}
		
		System.out.print(out);
	}

	public static int eulersTotient(int n) {
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

		return relPrimeNum;
	}
}
