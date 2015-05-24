/* Filename: UVa400.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa400 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			String[] filenames = new String[N];
			int L = 0;

			for (int i = 0; i < filenames.length; ++i) {
				filenames[i] = input.next();
				L = Math.max(L, filenames[i].length());
			}

			Arrays.sort(filenames);

			int C = (60 - L) / (L + 2) + 1;
			int R = (int) Math.ceil((double) N / C);

			System.out.println("------------------------------------------------------------");

			for (int r = 0; r < R; ++r) {
				for (int c = 0; c < C; ++c) {
					int index = c * R + r;

					if (index < N) {
						if (index + R < N) {
							System.out.printf("%-" + (L + 2) + "s",
									filenames[index]);
						} else {
							System.out.printf("%-" + L + "s", filenames[index]);
						}
					}
				}
				System.out.println();
			}
		}
	}

}
