/* Filename: UVa10523.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10523 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			BigInteger A = input.nextBigInteger();
			BigInteger sum = BigInteger.valueOf(0);
			
			for(int i = 1; i <= N; ++i){
				sum = sum.add(A.pow(i).multiply(BigInteger.valueOf(i)));
			}
			
			System.out.println(sum);
		}
	}

}
