/* Filename: UVa11287.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa11287 {

	public static void main(String[] args) {
		final int CERTAINTY = 10;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			BigInteger p = input.nextBigInteger();
			BigInteger a = input.nextBigInteger();
			
			if(p.equals(BigInteger.ZERO) && a.equals(BigInteger.ZERO)){
				break;
			}

			if(!p.isProbablePrime(CERTAINTY) && a.modPow(p, p).equals(a)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}

}
