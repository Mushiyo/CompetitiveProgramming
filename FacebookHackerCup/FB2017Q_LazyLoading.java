/* Filename: FB2017Q_LazyLoading.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class FB2017Q_LazyLoading {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("lazy_loading.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();
				int[] W = new int[N];

				for (int i = 0; i < W.length; ++i) {
					W[i] = input.nextInt();
				}

				Arrays.sort(W);
				int head = 0;
				int tail = W.length - 1;
				int trip = 0;
				while (head < tail) {
					if (W[tail] >= 50) {
						++trip;
					} else {
						int shift = 50 / W[tail]
								+ ((50 % W[tail] == 0) ? 0 : 1) - 1;

						if (head + shift <= tail) {
							++trip;
							head += shift;
						}
					}

					--tail;
				}

				out.printf("Case #%d: %d\n", t, trip);
			}
		}
		
		out.close();
		input.close();
	}

}
