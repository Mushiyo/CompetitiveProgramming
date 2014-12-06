/* Filename: d636.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;
import java.math.BigInteger;

public class d636 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final BigInteger mod = BigInteger.valueOf(10007); 

		while (input.hasNext()) {
			BigInteger a = input.nextBigInteger();
			BigInteger b = input.nextBigInteger();
			
			System.out.println(a.modPow(b, mod));
		}
	}

}
