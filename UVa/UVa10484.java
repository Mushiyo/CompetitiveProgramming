// unfinished

/* Filename: UVa10484.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10484 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int D = input.nextInt();

			int factorizeD = D;

			for (int i = N; i > 0 && factorizeD != 1; --i) {
				factorizeD /= gcd(i, factorizeD);
			}

			
		}
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}
