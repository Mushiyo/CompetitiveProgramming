/* Filename: Timus1327.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1327 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int A = input.nextInt();
			int B = input.nextInt();
			
			System.out.println((B + B % 2) / 2 - (A - A % 2) / 2);
		}
	}

}
