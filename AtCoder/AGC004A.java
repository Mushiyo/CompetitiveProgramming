/* Filename: AGC004A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class AGC004A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int A = input.nextInt(), B = input.nextInt(), C = input.nextInt();

			if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
				System.out.println(0);
			} else {
				long AxB = (long) A * B;
				long BxC = (long) B * C;
				long AxC = (long) A * C;
				long minDiff = Math.min(AxB, Math.min(AxC, BxC));
				
				System.out.println(minDiff);
			}
		}
	}

}
