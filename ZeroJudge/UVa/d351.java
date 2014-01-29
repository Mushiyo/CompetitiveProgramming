/* Filename: d351.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d351 {
	static int[] val = { 0, 0, 1 << 6, 1 << 5, 1 << 4, 1 << 3, 0, 1 << 2, 2, 1,
			0 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			String record = input.nextLine();
			if (!record.equals("___________")) {
				output.append(decode(record));
			}
		}
		System.out.print(output);
	}

	public static char decode(String record) {
		char ascii = 0;

		for (int i = 0; i < record.length(); ++i) {
			if (record.charAt(i) == 'o') {
				ascii += val[i];
			}
		}

		return ascii;
	}
}
