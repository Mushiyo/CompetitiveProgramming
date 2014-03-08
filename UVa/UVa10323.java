// WA
/* Filename: UVa10323.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10323 {
	static final long upperBound = 6227020800L;
	static final long lowerBound = 10000;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			long n = input.nextLong();
			System.out.println(factorial(n));
		}
	}
	
	public static String factorial(long n){
		long result = 1;
		
		for(int i = 1; i <= n; ++i){
			result *= i;
			
			if(result > upperBound){
				return "Overflow!";
			}
		}
		
		if(result < lowerBound){
			return "Underflow!";
		}
		else{
			return Long.toString(result);
		}
	}
}
