// WA
/* Filename: GCJ2016R1C_B.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GCJ2016R1C_B {
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner input = new Scanner(System.in);
//		PrintWriter out = new PrintWriter(System.out);
		 Scanner input = new Scanner(new File("B-small-attempt0.in"));
		 PrintWriter out = new PrintWriter(new File("pB.out"));
		final int MAX_B = 50;
		int[][] validWay = new int[MAX_B][MAX_B];

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int B = input.nextInt();
				int M = input.nextInt();
				boolean isPossible = M <= Math.pow(2, B - 2);

				out.printf("Case #%d: ", t);
				if (isPossible) {
					out.println("POSSIBLE");

					// reset
					for (int i = 0; i < B; ++i) {
						for (int j = 0; j < B; ++j) {
							validWay[i][j] = 0;
						}
					}

					int buildedWay = 0;
					for (int i = 0; i < B && buildedWay < M; ++i) {
						for (int j = i + 1; j < B && buildedWay < M; ++j) {
							validWay[i][j] = 1;
							++buildedWay;

							if (i == 0) {
								validWay[j][B - 1] = 1;
							}
						}
					}
					validWay[B - 1][B - 1] = 0;

					if (M == Math.pow(2, B - 2) - 1) {
						validWay[0][B - 1] = 0;
					}

					// print result
					for (int i = 0; i < B; ++i) {
						for (int j = 0; j < B; ++j) {
							out.print(validWay[i][j]);
						}
						out.println();
					}

				} else {
					out.println("IMPOSSIBLE");
				}
			}
		}

		out.close();
		input.close();
	}
}
