// NA (MLE)
/* Filename: a737.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Arrays;
import java.util.Scanner;

public class a737 {

	public static void main(String[] args) {
		final int MAX_R = 500;
		int[] s = new int[MAX_R];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int totalCase = input.nextInt();
			while (totalCase > 0) {
				int r = input.nextInt();

				for (int i = 0; i < r; ++i) {
					s[i] = input.nextInt();
				}

				Arrays.sort(s, 0, r);

				int median = s[r / 2];
				int distanceSum = 0;
				for (int i = 0; i < r; ++i) {
					distanceSum += Math.abs(median - s[i]);
				}

				System.out.println(distanceSum);

				--totalCase;
			}
		}
	}

}
