/* Filename: a889.java
 * Author: Mushiyo
 */
package NPSC;

import java.util.Scanner;

public class a889 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T > 0) {
				int M = input.nextInt();
				int N = input.nextInt();

				long loop = pascalSum(N);

				if (N > M) {
					loop += pascalSum(N % M, N - M, (N - M - (N % M)) / M + 1);
				}

				System.out.println(loop);

				--T;
			}
		}
	}

	private static long pascalSum(long n) {
		return ((1 + n) * n) / 2;
	}

	private static long pascalSum(long head, long tail, long height) {
		return ((head + tail) * height) / 2;
	}
}
