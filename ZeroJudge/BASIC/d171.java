/* Filename: d171.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;
import java.math.BigInteger;

public class d171 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			BigInteger N = input.nextBigInteger();
			int M = input.nextInt();
			
			System.out.println(N.pow(M).toString().length());
		}
	}

}
