/* Filename: ABC049A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC049A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			char c = input.next().charAt(0);

			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
			default:
				System.out.println("consonant");
				break;
			}
		}
	}

}
