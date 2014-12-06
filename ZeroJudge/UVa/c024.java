/* Filename: c024.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class c024 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			long N = input.nextLong();

			if (N < 0) {
				break;
			} else {
				System.out.println((N * (N + 1)) / 2 + 1);
			}
		}
	}

}
