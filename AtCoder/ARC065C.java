/* Filename: ARC065C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ARC065C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			StringBuilder S = new StringBuilder(input.next());

			while (S.length() >= 7) {
				if (S.substring(S.length() - "dreamer".length()).equals("dreamer")) {
					S.delete(S.length() - "dreamer".length(), S.length());
				} else if (S.substring(S.length() - "eraser".length()).equals("eraser")) {
					S.delete(S.length() - "eraser".length(), S.length());
				} else if (S.substring(S.length() - "erase".length()).equals("erase")) {
					S.delete(S.length() - "erase".length(), S.length());
				} else if (S.substring(S.length() - "dream".length()).equals("dream")) {
					S.delete(S.length() - "dream".length(), S.length());
				} else {
					break;
				}
			}

			switch (S.toString()) {
			case "dream":
			case "erase":
			case "eraser":
			case "":
				System.out.println("YES");
				break;
			default:
				System.out.println("NO");
				break;
			}
		}
	}

}
