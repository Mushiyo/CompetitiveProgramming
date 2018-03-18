
/* Filename: Kickstart2018PR_A.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kickstart2018PR_A {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(System.in);
		// PrintWriter out = new PrintWriter(out);
		Scanner input = new Scanner(new File("A-large.in"));
		PrintWriter out = new PrintWriter(new File("pA.out"));
		int T = input.nextInt();

		for (int t = 1; t <= T; ++t) {
			int N = input.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];

			for (int i = 0; i < a.length; ++i) {
				a[i] = input.nextInt();
				b[i] = input.nextInt();
			}

			int P = input.nextInt();
			int[] countPass = new int[P];

			for (int i = 0; i < countPass.length; ++i) {
				int city = input.nextInt();

				for (int j = 0; j < a.length; ++j) {
					if (a[j] <= city && city <= b[j]) {
						++countPass[i];
					}
				}
			}

			out.printf("Case #%d:", t);
			for (int i : countPass) {
				out.printf(" %d", i);
			}
			out.println();
		}
		
		out.close();
	}

}
