/* Filename: d212.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;
import java.math.BigInteger;

public class d212 {

	public static void main(String[] args) {
		BigInteger[] fib = new BigInteger[100];
		fib[0] = BigInteger.valueOf(1);
		fib[1] = BigInteger.valueOf(1);
		
		for(int i = 2; i < fib.length; ++i){
			fib[i] = fib[i - 1].add(fib[i - 2]);
		}
		
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			System.out.println(fib[n]);
		}
	}

}
