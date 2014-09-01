// RE

/* Filename: d256.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d256 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T > 0) {
				int G = input.nextInt();
				int L = input.nextInt();

				if (gcd(G, L) == G) {
					System.out.println(G + " " + L);
				} else {
					System.out.println(-1);
				}

				--T;
			}
		}
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
