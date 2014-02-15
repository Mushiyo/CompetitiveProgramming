/* Filename: UVa10814.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10814 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				BigInteger p = input.nextBigInteger();
				
				input.next(); // eat slash
				
				BigInteger q = input.nextBigInteger();
				BigInteger gcd = p.gcd(q);
				
				System.out.println(p.divide(gcd) + " / " + q.divide(gcd));
				
				--N;
			}
		}
	}

}
