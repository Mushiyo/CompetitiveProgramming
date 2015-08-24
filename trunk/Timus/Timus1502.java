/* Filename: Timus1502.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1502 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			System.out.println((sumOfSquare(N) + sumOfFirstN(N)) / 2 * 3 );
		}
	}
	
	// the sum of 1^2 + 2^2 + ... + n^2
	private static long sumOfSquare(long n){
		return (n * (n + 1) * (2 * n + 1)) / 6;
	}
	
	
	// the sum of 1^3 + 2^3 + ... + n^3
	private static long sumOfFirstN(long n){
		return ((1 + n) * n) / 2;
	}

}
