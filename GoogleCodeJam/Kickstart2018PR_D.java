
/* Filename: Kickstart2018PR_D.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Kickstart2018PR_D {

	public static void main(String[] args) throws FileNotFoundException {
		final int MAX_ELEMENT = 100;
		int[] countSum = new int[200000 * MAX_ELEMENT + 1];
		int[] accuCountSum = new int[200000 * MAX_ELEMENT + 1];
//		Scanner input = new Scanner(System.in);
//		PrintWriter out = new PrintWriter(System.out);
		 Scanner input = new Scanner(new File("D-large.in"));
		 PrintWriter out = new PrintWriter(new File("GCJ.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();
				int Q = input.nextInt();
				int[] a = new int[N];
				final int MAX_SUM = N * MAX_ELEMENT + 1;
				Arrays.fill(countSum, 0, MAX_SUM, 0);
				Arrays.fill(accuCountSum, 0, MAX_SUM, 0);

				for (int i = 0; i < a.length; ++i) {
					a[i] = input.nextInt();
				}

				int[] accumulateA = new int[a.length + 1];
				for (int i = 1; i < accumulateA.length; ++i) {
					accumulateA[i] = accumulateA[i - 1] + a[i - 1];
				}

				for (int i = 0; i < accumulateA.length; ++i) {
					for (int j = i + 1; j < accumulateA.length; ++j) {
						++countSum[accumulateA[j] - accumulateA[i]];
					}
				}

				accuCountSum[0] = countSum[0];
				for (int i = 1; i < MAX_SUM; ++i) {
					accuCountSum[i] = accuCountSum[i - 1] + countSum[i];
				}

				out.printf("Case #%d:\n", t);

				while (Q-- > 0) {
					int L = input.nextInt();
					int R = input.nextInt();
					int index = 0;

					while (accuCountSum[index] < L) {
						++index;
					}

					long sum = index * (Math.min(accuCountSum[index], R) - L + 1);
					++index;
					while (index < MAX_SUM && accuCountSum[index] < R) {
						sum += index * (accuCountSum[index] - accuCountSum[index - 1]);
						++index;
					}
					sum += index * (R - accuCountSum[index - 1]);
					
					out.println(sum);
				}
			}
		}

		out.close();
		input.close();
	}
}
