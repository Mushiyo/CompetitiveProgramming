/* Filename: UVa10433.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10433 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String number = input.next();
			BigInteger numSquare = new BigInteger(number).pow(2);
			
			if(numSquare.toString().endsWith(number)){
				System.out.printf("Automorphic number of %d-digit.\n", number.toString().length());
			}
			else{
				System.out.println("Not an Automorphic number.");
			}
		}
	}

}
