/* Filename: UVa583.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UVa583 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			int g = input.nextInt();

			if (g == 0) {
				break;
			}

			ArrayList<Integer> factorG = factorization(Math.abs(g));
			if (g < 0) {

				out.append(g + " = -1");
				for (int i = 0; i < factorG.size(); ++i) {
					out.append(" x " + factorG.get(i));
				}
				out.append('\n');
			} else {
				out.append(g + " = " + factorG.get(0));
				for (int i = 1; i < factorG.size(); ++i) {
					out.append(" x " + factorG.get(i));
				}
				out.append('\n');
			}
		}

		System.out.print(out);
	}

	private static ArrayList<Integer> factorization(int n) {
		int sqrtN = (int) Math.sqrt(n);
		ArrayList<Integer> factor = new ArrayList<Integer>();

		for (int i = 2; i <= sqrtN && n != 1; ++i) {
			while (n % i == 0) {
				factor.add(i);
				n /= i;
			}
		}

		if (n != 1) {
			factor.add(n);
		}

		return factor;
	}

}
