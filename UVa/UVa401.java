/* Filename: UVa401.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa401 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.nextLine().trim();

			System.out.print(s + " -- ");
			if (isPalindrome(s)) {
				if (isMirrored(s)) {
					System.out.println("is a mirrored palindrome.");
				} else {
					System.out.println("is a regular palindrome.");
				}
			} else {
				if (isMirrored(s)) {
					System.out.println("is a mirrored string.");
				} else {
					System.out.println("is not a palindrome.");
				}
			}
			System.out.println();
		}
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isMirrored(String s) {
		for (int i = 0, j = s.length() - 1; i <= j; ++i, --j) {
			switch (s.charAt(i)) {
			case 'E':
				if (s.charAt(j) != '3') {
					return false;
				}
				break;

			case '3':
				if (s.charAt(j) != 'E') {
					return false;
				}
				break;

			case 'J':
				if (s.charAt(j) != 'L') {
					return false;
				}
				break;

			case 'L':
				if (s.charAt(j) != 'J') {
					return false;
				}
				break;

			case 'S':
				if (s.charAt(j) != '2') {
					return false;
				}
				break;

			case '2':
				if (s.charAt(j) != 'S') {
					return false;
				}
				break;

			case 'Z':
				if (s.charAt(j) != '5') {
					return false;
				}
				break;

			case '5':
				if (s.charAt(j) != 'Z') {
					return false;
				}
				break;

			case 'A':
			case 'H':
			case 'I':
			case 'M':
			case 'O':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case '8':
				if (s.charAt(i) != s.charAt(j)) {
					return false;
				}
				break;

			default:
				return false;
			}
		}

		return true;
	}
}
