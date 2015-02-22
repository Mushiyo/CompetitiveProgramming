/* Filename: UVa1594.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class UVa1594 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX_N = 15;
		int[] ducciSeq = new int[MAX_N];
		Set<Integer> appearedSeq = new HashSet<Integer>();

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T > 0) {
				int n = input.nextInt();
				appearedSeq.clear();

				for (int i = 0; i < n; ++i) {
					ducciSeq[i] = input.nextInt();
				}

				int hashCode = Arrays.hashCode(ducciSeq);
				while (appearedSeq.contains(hashCode) == false) {
					appearedSeq.add(hashCode);

					int ducciSeq0 = ducciSeq[0];
					for (int i = 0; i < n - 1; ++i) {
						ducciSeq[i] = Math.abs(ducciSeq[i] - ducciSeq[i + 1]);
					}
					ducciSeq[n - 1] = Math.abs(ducciSeq[n - 1] - ducciSeq0);

					hashCode = Arrays.hashCode(ducciSeq);
				}

				if (isAllZero(ducciSeq, n)) {
					System.out.println("ZERO");
				} else {
					System.out.println("LOOP");
				}

				--T;
			}
		}
	}

	private static boolean isAllZero(int[] ducciSeq, int size) {
		for (int i = 0; i < size; ++i) {
			if (ducciSeq[i] != 0) {
				return false;
			}
		}

		return true;
	}
}
