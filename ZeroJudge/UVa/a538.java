/* Filename: a538.java
 * Author: Mushiyo
 */
package UVa;

import java.math.BigInteger;
import java.util.Scanner;

public class a538 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final BigInteger big17 = BigInteger.valueOf(17);

		while (input.hasNext()) {
			BigInteger num = input.nextBigInteger();

			if (num.equals(BigInteger.ZERO)) {
				break;
			}

			if (num.mod(big17).equals(BigInteger.ZERO)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
