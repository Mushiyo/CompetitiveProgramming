/* Filename: UVa374.java
 * Author: Mushiyo
 */

import java.math.BigInteger;
import java.util.Scanner;

public class UVa374 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(input.hasNext()){
			BigInteger B = input.nextBigInteger();
			BigInteger P = input.nextBigInteger();
			BigInteger M = input.nextBigInteger();
			
			System.out.println(B.modPow(P, M));						
		}
	}

}
