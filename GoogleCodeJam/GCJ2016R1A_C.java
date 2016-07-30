// WA

/* Filename: GCJ2016R1A_C.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class GCJ2016R1A_C {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(System.in);
		// PrintWriter out = new PrintWriter(System.out);
		Scanner input = new Scanner(new File("C-small-attempt100.in"));
		PrintWriter out = new PrintWriter(new File("pC.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();
				int[] F = new int[N];

				for (int i = 0; i < F.length; ++i) {
					F[i] = input.nextInt() - 1;
				}

				// System.out.println(Arrays.toString(F));

				System.out.println(t);
				int maxCircleLen = 0;
				for (int i = 0; i < F.length; ++i) {
					boolean[] hasIn = new boolean[N];
					boolean[] hasOut = new boolean[N];
					int currentKid = i;

					int countKid = 0;
					while (hasOut[currentKid] == false) {
						int next = F[currentKid];
						System.out.printf("%d | ", currentKid);
						System.out.println("next: " + next);

						if (F[next] != currentKid && hasIn[next]
								&& hasOut[next]) {
							hasIn[currentKid] = false;
							// System.out.println("current: " + currentKid);
							System.out.println("$");
							break;
						} else if (F[next] == currentKid && hasIn[next]
								&& hasOut[next]) {
							System.out.println("#");
							hasOut[currentKid] = false;
							++countKid;
							break;
						} else {

							hasIn[next] = true;
							++countKid;
						}

						hasOut[currentKid] = true;
						currentKid = next;
					}
					System.out.println(Arrays.toString(hasIn));
					System.out.println(Arrays.toString(hasOut));

					int lastKid = 0;

					for (int j = 0; j < N; ++j) {
						if (hasOut[j] == false && hasIn[j] == true) {
							lastKid = j;
							break;
						}
					}

					if (hasIn[i] == false) {

						// System.out.println("!");
						while (true) {
							boolean added = false;
							for (int j = 0; j < N; ++j) {
								if (hasIn[j] == false && hasOut[j] == false) {
									System.out.printf("last:%d %d | %d\n",
											lastKid, j, F[j]);
									if (F[j] == lastKid) {
										lastKid = j;
										hasOut[j] = true;
										++countKid;
										added = true;
										break;
									}
								}
							}

							if (added == false) {
								break;
							}
						}
					}

					maxCircleLen = Math.max(maxCircleLen, countKid);
				}

				out.printf("Case #%d: %d\n", t, maxCircleLen);
			}
		}

		out.close();
		input.close();
	}
}
