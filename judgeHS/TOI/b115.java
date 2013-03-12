package TOI;

import java.util.Scanner;
import java.math.*;

public class b115 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigInteger operand1 = input.nextBigInteger();
			char operator = input.next().charAt(0);
			BigInteger operand2 = input.nextBigInteger();
			
			if(operator == '*'){
				System.out.println(operand1.multiply(operand2));
			}
			else{
				System.out.println(operand1.divide(operand2));
			}
		}
	}

}
