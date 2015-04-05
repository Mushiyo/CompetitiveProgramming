/* Filename: a865.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a865 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int[] val = { 1, 2, 600, 4, 5, 500, 3, 9, 10, 0, 20, 30, 40, 50,
				70, 80, 90, 100, 200, 300, 400, 0, 800, 60, 8, 7 };

		while (input.hasNext()) {
			String numStr = input.nextLine();

			if (numStr.equals(".")) {
				break;
			}

			int num = 0;
			for (int i = 0; i < numStr.length(); ++i) {
				switch (numStr.charAt(i)) {
				case '#':
					num += 6;
					break;
				case '$':
					num += 700;
					break;
				case '3':
					num += 900;
					break;
				default:
					num += val[numStr.charAt(i) - 'A'];
					break;
				}
			}
			
			System.out.println(num);
		}
	}

}
