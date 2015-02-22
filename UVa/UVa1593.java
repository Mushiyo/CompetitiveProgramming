/* Filename: UVa1593.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa1593 {

	public static void main(String[] args) {
		String[][] lines = new String[1000][];
		int rows = 0, cols = 0;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			lines[rows] = input.nextLine().trim().split("[^\\S]+");
			cols = Math.max(lines[rows].length, cols);
			++rows;
		}

		int[] maxWordLen = new int[cols];
		for (int c = 0; c < cols; ++c) {
			for (int r = 0; r < rows; ++r) {
				if (c < lines[r].length) {
					maxWordLen[c] = Math.max(maxWordLen[c],
							lines[r][c].length());
				}
			}
		}

		for (int r = 0; r < rows; ++r) {
			if (lines[r].length > 1) {
				System.out.print(String.format("%-" + maxWordLen[0] + "s",
						lines[r][0]));
			} else {
				System.out.print(lines[r][0]);
			}
			for (int c = 1; c < lines[r].length; ++c) {
				if (c < lines[r].length - 1) {
					System.out.print(String.format(" %-" + maxWordLen[c] + "s",
							lines[r][c]));
				} else {
					System.out.print(" " + lines[r][c]);
				}
			}
			System.out.println();
		}
	}

}
