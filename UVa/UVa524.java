// TLE

/* Filename: UVa524.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintWriter;
import java.util.Arrays;

public class UVa524 {
	private static Set<Integer> prime = new HashSet<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31));
	private static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int caseNum = 1;

		while (input.hasNext()) {
			int n = input.nextInt();
			int[] ring = new int[n];
			ring[0] = 1;
			boolean[] isUsed = new boolean[n + 1];
			isUsed[0] = true;
			isUsed[1] = true;

			if (caseNum > 1) {
				out.println();
			}
			out.printf("Case %d:\n", caseNum++);

			buildRing(1, ring, isUsed);
		}
		
		out.close();
	}

	private static void buildRing(int pos, int[] ring, boolean[] isUsed) {
		if (pos == ring.length) {
			if (prime.contains(ring[ring.length - 1] + 1)) {
				out.print(ring[0]);
				for (int i = 1; i < ring.length; ++i) {
					out.printf(" %d", ring[i]);
				}
				out.println();
			}
		} else {
			for (int i = pos % 2 + 1; i < isUsed.length; i += 2) {
				if (isUsed[i] == false && prime.contains(ring[pos - 1] + i)) {
					ring[pos] = i;
					isUsed[i] = true;
					buildRing(pos + 1, ring, isUsed);
					isUsed[i] = false;
				}
			}
		}
	}
}