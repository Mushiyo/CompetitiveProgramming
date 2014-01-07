/* Filename: UVa10220.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10220 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			BigInteger factorial = BigInteger.valueOf(1);
			for(int i = 2; i <= n; ++i){
				factorial = factorial.multiply(BigInteger.valueOf(i));
			}
			
			int sumDigit = 0;
			String factorialStr = factorial.toString();
			for(int i = 0; i < factorialStr.length(); ++i){
				sumDigit += factorialStr.charAt(i) - '0';
			}
			
			System.out.println(sumDigit);
		}
	}

}
