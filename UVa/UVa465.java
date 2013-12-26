/* Filename: UVa465.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa465 {
	final static BigInteger INT_MAX = new BigInteger(
			Integer.toString(Integer.MAX_VALUE));
	final static int GREATER_THAN = 1;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String expression = input.nextLine();
			System.out.println(expression);
			
			String[] token = expression.split("\\s+");			
			BigInteger num1 = new BigInteger(token[0]);
			char operator = token[1].charAt(0);
			BigInteger num2 = new BigInteger(token[2]);

			if (num1.compareTo(INT_MAX) == GREATER_THAN) {
				System.out.println("first number too big");
			}

			if (num2.compareTo(INT_MAX) == GREATER_THAN) {
				System.out.println("second number too big");
			}

			BigInteger result;
			switch (operator) {
			case '+':
				result = num1.add(num2);
				break;
			case '*':
				result = num1.multiply(num2);
				break;
			default:
				result = new BigInteger("0");
				break;
			}

			if (result.compareTo(INT_MAX) == GREATER_THAN) {
				System.out.println("result too big");
			}
		}

	}

}
