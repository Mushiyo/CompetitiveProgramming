package UVa;

import java.util.Scanner;
import java.math.BigInteger;

public class c119 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			System.out.println(nFactorialSum(n));
		}
	}
	
	public static int nFactorialSum(int n){
		String factorial = bigFactorial(n);
		int sum = 0;
		
		for(int i = 0; i < factorial.length(); ++i){
			sum += Character.getNumericValue(factorial.charAt(i));
		}
		
		return sum;
	}
	
	public static String bigFactorial(int n){
		BigInteger factorial = new BigInteger("2");
		
		for(int i = 1; i <= n; ++i){
			BigInteger bigI = new BigInteger(Integer.toString(i));
			factorial.multiply(bigI);
		}
		
		return factorial.toString();
	}

}
