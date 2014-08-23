// unfinished

/* Filename: UVa392.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa392 {

	public static void main(String[] args) {
		int[] coefficients = new int[9];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			for (int i = 0; i < coefficients.length; ++i) {
				coefficients[i] = input.nextInt();
			}

			boolean isFirstTerm = true;
			for (int i = 0, power = coefficients.length - 1; i < coefficients.length; ++i, --power) {
				if (coefficients[i] != 0) {
					if (isFirstTerm) {
						if (coefficients[i] == 1) {
							System.out.print("x^" + power);
						} else if (coefficients[i] == -1) {
							System.out.print("-x^" + power);
						} else {
							System.out.print(coefficients[i] + "x^" + power);
						}
						isFirstTerm = false;
					} else {
						if (coefficients[i] > 0) {
							System.out.print(" + ");
						} else {
							System.out.print(" - ");
							coefficients[i] = Math.abs(coefficients[i]);
						}

					}

					if (i < coefficients.length - 1) {
						if (coefficients[i] == 1) {
							System.out.print("x^" + power);
						} else if (coefficients[i] == -1) {
							System.out.print("-x^" + power);
						} else {
							System.out.print(coefficients[i] + "x^" + power);
						}
					} else {
						System.out.print(coefficients[i]);
					}
				}

			}
			System.out.println();
		}
	}
}
