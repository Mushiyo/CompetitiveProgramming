/* Filename: UVa1585.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa1585 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int T = input.nextInt();
		input.nextLine(); // eat change line

		while (T > 0) {
			String testResult = input.nextLine();

			int score = 0;
			int streak = 0;

			for (int i = 0; i < testResult.length(); ++i) {
				if (testResult.charAt(i) == 'O') {
					++streak;
					score += streak;
				} else {
					streak = 0;
				}
			}

			System.out.println(score);

			--T;
		}

	}

}
