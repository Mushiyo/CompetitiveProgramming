package BASIC;

import java.math.BigInteger;
import java.util.Scanner;

public class a021 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			BigInteger operand1 = new BigInteger(input.next());
			char operator = input.next().charAt(0);
			BigInteger operand2 = new BigInteger(input.next());

			switch (operator) {
			case '+':
				System.out.println(operand1.add(operand2));
				break;
			case '-':
				System.out.println(operand1.add(operand2.negate()));
				break;
			case '*':
				System.out.println(operand1.multiply(operand2));
				break;
			default:
				System.out.println(operand1.divide(operand2));
				break;

			}

		}
	}

}
