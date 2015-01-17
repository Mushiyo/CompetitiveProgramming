/* Filename: UVa10125.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10125 {

	public static void main(String[] args) {
		final int MAX_N = 1000;
		int[] set = new int[MAX_N];
		int[] aPlusB = new int[MAX_N * MAX_N];
		int[] aVal = new int[MAX_N * MAX_N];
		int[] bVal = new int[MAX_N * MAX_N];
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			for (int i = 0; i < n; ++i) {
				set[i] = input.nextInt();
			}

			int countAPlubB = 0;
			for (int a = 0; a < n; ++a) {
				for (int b = a + 1; b < n; ++b) {
					aPlusB[countAPlubB] = set[a] + set[b];
					aVal[countAPlubB] = set[a];
					bVal[countAPlubB] = set[b];
					++countAPlubB;
				}
			}

			Arrays.sort(aPlusB, 0, countAPlubB);

			boolean isDFound = false;
			int maxD = Integer.MIN_VALUE;
			for (int d = 0; d < n; ++d) {
				for (int c = 0; c < n; ++c) {
					if (c == d) {
						continue;
					}

					int pos = Arrays.binarySearch(aPlusB, 0, countAPlubB,
							set[d] - set[c]);
					if (pos >= 0
							&& isValidSol(pos, countAPlubB, aPlusB, aVal, bVal,
									set[c], set[d])) {
						maxD = Math.max(maxD, set[d]);
						isDFound = true;
					}
				}
			}

			if (isDFound) {
				output.append(maxD + "\n");
			} else {
				output.append("no solution\n");
			}
		}

		System.out.print(output);
	}

	private static boolean isValidSol(int pos, int len, final int[] aPlusB,
			final int[] aVal, final int[] bVal, int c, int d) {
		int target = aPlusB[pos];

		while (pos < len && aPlusB[pos] == target) {
			if (c != aVal[pos] && c != bVal[pos] && d != aVal[pos]
					&& d != bVal[pos]) {
				return true;
			}
			++pos;
		}

		return false;
	}

}
