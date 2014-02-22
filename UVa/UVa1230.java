/* Filename: UVa1230.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa1230 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int c = input.nextInt();
			
			if(c == 0){
				break;
			}
			
			while(c > 0){
				BigInteger x = input.nextBigInteger();
				BigInteger y = input.nextBigInteger();
				BigInteger n = input.nextBigInteger();
				
				System.out.println(x.modPow(y, n));
				
				--c;
			}
		}
	}

}
