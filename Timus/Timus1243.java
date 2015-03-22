/* Filename: Timus1243.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class Timus1243 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger seven = BigInteger.valueOf(7);

		while (input.hasNext()) {
			BigInteger N = input.nextBigInteger();
			
			System.out.println(N.mod(seven));
		}
	}

}
