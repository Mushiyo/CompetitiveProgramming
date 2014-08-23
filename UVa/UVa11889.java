// WA

/* Filename: UVa11889.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11889 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T > 0) {
				int A = input.nextInt();
				int C = input.nextInt();
				
				if(C % A != 0){
					System.out.println("NO SOLUTION");
				}
				else{
					int B = C / gcd(A, C);
					System.out.println(B);
				}
				
				--T;
			}
		}
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
