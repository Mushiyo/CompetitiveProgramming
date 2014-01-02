/* Filename: UVa441.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa441 {

	public static void main(String[] args) {
		final int MAX_K = 13;
		int[] S = new int[MAX_K];
		boolean isFirstCase = true;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int k = input.nextInt();

			if (k == 0) {
				break;
			}

			for (int i = 0; i < k; ++i) {
				S[i] = input.nextInt();
			}

			if (isFirstCase) {
				isFirstCase = false;
			} else {
				System.out.println();
			}

			for (int i = 0; i < k - 5; ++i) {
				for (int j = i + 1; j < k - 4; ++j) {
					for (int l = j + 1; l < k - 3; ++l) {
						for (int m = l + 1; m < k - 2; ++m) {
							for (int n = m + 1; n < k - 1; ++n) {
								for (int o = n + 1; o < k; ++o) {
									System.out.println(S[i] + " " + S[j] + " "
											+ S[l] + " " + S[m] + " " + S[n]
											+ " " + S[o]);
								}
							}
						}
					}
				}
			}
		}
	}

}
