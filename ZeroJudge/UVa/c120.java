/* Filename: c120.java
 * Author: Mushiyo
 */
package UVa;

import java.math.BigInteger;
import java.util.Scanner;

public class c120 {
	static final int maxN = 1000 + 1;
	static BigInteger[] factorials = new BigInteger[maxN];
	
	public static void countFactorials(){
		factorials[0] = BigInteger.valueOf(1);
		
		for(int i = 1; i < factorials.length; ++i){
			factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i));
		}
	}

	public static void main(String[] args) {
		countFactorials();
		
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			System.out.printf("%d!\n", n);
			System.out.println(factorials[n]);
		}
	}
}
