/* Filename: UVa11614.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11614 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int testCase = input.nextInt();

			while (testCase > 0) {
				long n = input.nextLong();
				long row = (long) Math.floor((-1 + Math.sqrt(1 + 8 * n)) / 2);

				System.out.println(row);
				
				--testCase;
			}
		}
	}

}
