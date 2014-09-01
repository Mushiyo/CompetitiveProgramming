/* Filename: c088.java
 * Author: Mushiyo
 */
package UVa;

import java.util.ArrayList;
import java.util.Scanner;

public class c088 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String[] xInPrimeBase = input.nextLine().split(" ");

			if (xInPrimeBase[0].equals("0")) {
				break;
			}

			int x = 1;

			for (int i = 0; i < xInPrimeBase.length; i += 2) {
				int base = Integer.valueOf(xInPrimeBase[i]);
				int exponential = Integer.valueOf(xInPrimeBase[i + 1]);
				x *= Math.pow(base, exponential);
			}

			ArrayList<Pair> primeBaseXMinus1 = factor(x - 1);
			int last = primeBaseXMinus1.size() - 1;

			System.out.print(primeBaseXMinus1.get(last).b + " "
					+ primeBaseXMinus1.get(last).e);
			for (int i = last - 1; i >= 0; --i) {
				Pair p = primeBaseXMinus1.get(i);

				System.out.print(" " + p.b + " " + p.e);
			}
			System.out.println();
		}
	}

	private static ArrayList<Pair> factor(int n) {
		ArrayList<Pair> factor = new ArrayList<Pair>();

		for (int i = 2; i <= n && n != 1; ++i) {

			if (n % i == 0) {
				int count = 0;
				while (n % i == 0) {
					++count;
					n /= i;
				}

				factor.add(new Pair(i, count));
			}
		}

		return factor;
	}

	private static class Pair {
		int b;
		int e;

		Pair(int b, int e) {
			this.b = b;
			this.e = e;
		}
	}

}
