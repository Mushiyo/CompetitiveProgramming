/* Filename: Codeforces716B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Codeforces716B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			char[] s = input.next().toCharArray();

			if (s.length < 26) {
				System.out.println(-1);
				continue;
			}

			int[] emptyCount = new int[s.length + 1];
			int[][] charCount = new int[26][50000 + 1];
			for (int i = 0; i < s.length; ++i) {
				if (s[i] == '?') {
					++emptyCount[i + 1];
				} else {
					++charCount[s[i] - 'A'][i + 1];
				}

				emptyCount[i + 1] += emptyCount[i];

				for (int j = 0; j < charCount.length; ++j) {
					charCount[j][i + 1] += charCount[j][i];
				}

			}

			boolean hasSol = false;
			for (int start = 0; start < s.length - 25; ++start) {
				int end = start + 25;
				int diffChar = 0;

				for (int i = 0; i < charCount.length; ++i) {
					if (charCount[i][end + 1] - charCount[i][start] > 0) {
						//System.err.println(i);
						++diffChar;
					}
				}
				//System.err.println(diffChar);
				if (diffChar + emptyCount[end + 1] - emptyCount[start] == 26) {
					hasSol = true;

					int missingChar = 0;

					for (int i = start; i <= end; ++i) {
						if (s[i] == '?') {
							while (charCount[missingChar][end + 1] != charCount[missingChar][start]) {
								++missingChar;
							}
							s[i] = (char) ('A' + missingChar);
							++missingChar;
						}
					}

					break;
				}
			}

			if (hasSol) {
				for (int i = 0; i < s.length; ++i) {
					if (s[i] == '?') {
						s[i] = 'A';
					}
				}

				System.out.println(s);
			} else {
				System.out.println(-1);
			}
		}
	}

}
