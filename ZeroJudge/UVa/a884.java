// TLE

/* Filename: a884.java
 * Author: Mushiyo
 */
package UVa;

import java.math.BigInteger;
import java.util.Scanner;

public class a884 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			int testCase = input.nextInt();

			while (testCase > 0) {
				BigInteger A = input.nextBigInteger();
				BigInteger B = input.nextBigInteger();

				out.append(A.subtract(B) + "\n");

				--testCase;
			}
		}
		
		System.out.println(out);
	}

}
