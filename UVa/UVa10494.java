/* Filename: UVa10494.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10494 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			BigInteger num1 = input.nextBigInteger();
			char operator = input.next().charAt(0);
			BigInteger num2 = input.nextBigInteger();
			
			switch(operator){
			case '/':
				System.out.println(num1.divide(num2));
				break;
			case '%':
				System.out.println(num1.mod(num2));
				break;
			}
		}
	}

}
