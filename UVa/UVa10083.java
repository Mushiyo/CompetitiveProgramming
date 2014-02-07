//TLE

/* Filename: UVa10083.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10083 {
	final static int QUOTIENT = 0;
	final static int REMAINDER = 1;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			BigInteger t = input.nextBigInteger();
			int a = input.nextInt();
			int b = input.nextInt();
			
			BigInteger numerator = t.pow(a).subtract(BigInteger.ONE);
			BigInteger denominator = t.pow(b).subtract(BigInteger.ONE);
			BigInteger[] ans = numerator.divideAndRemainder(denominator);
			
			output.append(String.format("(%s^%d-1)/(%s^%d-1) ", t, a, t, b));
			if(ans[QUOTIENT].toString().length() >= 100 || !ans[REMAINDER].equals(BigInteger.ZERO)){
				output.append("is not an integer with less than 100 digits.\n");
			}
			else{
				output.append(ans[QUOTIENT] + "\n");
			}
		}
		
		System.out.print(output);
	}

}
