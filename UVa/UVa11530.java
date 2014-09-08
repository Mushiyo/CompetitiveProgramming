/* Filename: UVa11530.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11530 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int[] clickTimes = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3,
				1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4 };

		while (input.hasNext()) {
			int T = input.nextInt();

			input.nextLine(); // eat change line

			for (int caseNum = 1; caseNum <= T; ++caseNum) {
				String textMessage = input.nextLine();
				int pressCount = 0;

				for (int i = 0; i < textMessage.length(); ++i) {
					if (Character.isLetter(textMessage.charAt(i))) {
						pressCount += clickTimes[textMessage.charAt(i) - 'a'];
					} else {
						++pressCount;
					}
				}

				System.out.printf("Case #%d: %d\n", caseNum, pressCount);
			}
		}
	}

}
