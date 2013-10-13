package ORIGINAL;

import java.util.Scanner;
import java.math.BigInteger;

public class d618 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String aLineOfExpression = input.nextLine().trim();
			Scanner expression = new Scanner(aLineOfExpression);
			
			String operand = expression.next();
			while(expression.hasNext()){
				String operator = expression.next();
				if(operator.equals("or")){
					operand = OR(operand, expression.next());
				}
				else{
					operand = AND(operand, expression.next());
				}
			}
			
			aLineOfExpression = aLineOfExpression.replaceAll(" or ", "||");
			aLineOfExpression = aLineOfExpression.replaceAll(" and ", "&&");
			System.out.println(aLineOfExpression + " = " + operand);
		}
	}
	
	public static String OR(String str1, String str2){
		StringBuilder or = new StringBuilder();
		
		for(int i = 0; i < str1.length(); ++i){
			if((str1.charAt(i) != '0') || (str2.charAt(i) != '0')){
				or.append(1);
			}
			else{
				or.append(0);
			}
		}
		
		return or.toString();
	}

	public static String AND(String str1, String str2){
		StringBuilder and = new StringBuilder();
		
		for(int i = 0; i < str1.length(); ++i){
			if(str1.charAt(i) == '1' && str2.charAt(i) == '1'){
				and.append(1);
			}
			else{
				and.append(0);
			}
		}
		
		return and.toString();
	}
}
