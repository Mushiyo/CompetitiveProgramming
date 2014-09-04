/* Filename: UVa445.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa445 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String mazeDescription = input.nextLine();		

			if (mazeDescription.startsWith(" ")) {
				System.out.println();
				continue;
			}

			int width = 0;
			for (int i = 0; i < mazeDescription.length(); ++i) {
				char current = mazeDescription.charAt(i);
				if (Character.isDigit(current)) {
					width += current - '0';
				} else if (current == '!') {
					System.out.println();
				} else {
					if (current == 'b') {
						System.out.printf("%" + width + "c", ' ');
					} else {
						System.out.printf(String.format("%" + width + "c",
								current).replace(' ', current));
					}
					width = 0;
				}
			}
			System.out.println();
		}
	}

}
