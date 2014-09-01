/* Filename: d154.java
 * Author: Mushiyo
 */
package UVa;

import java.math.BigInteger;
import java.util.Scanner;

public class d154 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			while (N > 0) {
				BigInteger p = input.nextBigInteger();

				input.next(); // eat slash

				BigInteger q = input.nextBigInteger();
				BigInteger gcd = p.gcd(q);

				System.out.println(p.divide(gcd) + " / " + q.divide(gcd));

				--N;
			}
		}
	}

}
