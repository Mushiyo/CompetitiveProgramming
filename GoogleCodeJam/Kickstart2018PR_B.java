
/* Filename: Kickstart2018PR_B.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Kickstart2018PR_B {

	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(System.in);
		// PrintWriter out = new PrintWriter(System.out);
		 Scanner input = new Scanner(new File("B-large.in"));
		 PrintWriter out = new PrintWriter(new File("pB.out"));
		
		long[] seqLen = new long[60 + 1];
		for(int i = 1; i < seqLen.length; ++i){
			seqLen[i] = 2 * seqLen[i - 1] + 1;
		}
		
		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				long K = input.nextLong();
				int N = findN(K);
				int switchTimes = 0;

				while ((K != 1) && (K != seqLen[N] / 2 + 1)) {
					K = seqLen[N] - K + 1;
					N = findN(K);
					++switchTimes;
				}

				out.printf("Case #%d: ", t);
				if (switchTimes % 2 == 0) {
					out.println(0);
				} else {
					out.println(1);
				}
			}
		}

		out.close();
		input.close();
	}

	private static int findN(long K) {
		long seqLen = 1;
		int N = 1;

		while (seqLen < K) {
			seqLen = 2 * seqLen + 1;
			++N;
		}

		return N;
	}
}
