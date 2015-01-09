/* Filename: UVa482.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa482 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			boolean isFirstOutput = true;
			while (T > 0) {
				input.nextLine(); // eat change line
				input.nextLine(); // eat change line

				String[] index = input.nextLine().split("\\W+");
				String[] number = new String[index.length];

				for (int i = 0; i < index.length; ++i) {
					number[Integer.parseInt(index[i]) - 1] = input.next();
				}

				if (isFirstOutput) {
					isFirstOutput = false;
				} else {
					System.out.println();
				}

				for (int i = 0; i < number.length; ++i) {
					System.out.println(number[i]);
				}

				--T;
			}
		}
	}

}
