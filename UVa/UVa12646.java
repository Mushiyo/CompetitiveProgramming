/* Filename: UVa12646.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12646 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int A = input.nextInt();
			int B = input.nextInt();
			int C = input.nextInt();

			if (A == B && B == C) {
				System.out.println("*");
			} else if (A == B && B != C) {
				System.out.println("C");
			} else if (A == C && B != C) {
				System.out.println("B");
			} else if (B == C && A != C) {
				System.out.println("A");
			}
		}
	}

}
