/* Filename: UVa11448.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa11448 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int testCase = input.nextInt();
			
			while(testCase > 0){
				BigInteger A = input.nextBigInteger();
				BigInteger B = input.nextBigInteger();
				
				System.out.println(A.subtract(B));
				
				--testCase;
			}
		}
	}

}
