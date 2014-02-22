/* Filename: UVa10235.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10235 {

	public static void main(String[] args) {
		final int CERTAINTY = 10;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			BigInteger N = input.nextBigInteger();
			
			if(N.isProbablePrime(CERTAINTY)){
				BigInteger revN =  new BigInteger(new StringBuilder(N.toString()).reverse().toString());
				
				if(revN.equals(N) == false && revN.isProbablePrime(CERTAINTY)){
					System.out.println(N + " is emirp.");
				}
				else{
					System.out.println(N + " is prime.");
				}
			}
			else{
				System.out.println(N + " is not prime.");
			}
		}
	}

}
