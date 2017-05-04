// TLE

/* Filename: UVa13059.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa13059 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			BigInteger P = input.nextBigInteger();
			
			System.out.println(P.subtract(BigInteger.valueOf(-1)));
		}
	}

}
