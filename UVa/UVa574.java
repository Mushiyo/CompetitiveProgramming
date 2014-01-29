/* Filename: UVa574.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UVa574 {
	static final int MAX_N = 12 + 1;
	static int[] x = new int[MAX_N];
	static boolean[] isUsed = new boolean[MAX_N];
	static int n = 0;
	static boolean hasSum = false;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int t = input.nextInt();
			n = input.nextInt();

			if (n == 0) {
				break;
			}

			for (int i = 1; i <= n; ++i) {
				x[i] = input.nextInt();
			}

			Arrays.fill(isUsed, 1, n + 1, false);
			hasSum = false;

			System.out.printf("Sums of %d:\n", t);
			findSum(t, 1, new ArrayList<Integer>());

			if (!hasSum) {
				System.out.println("NONE");
			}
		}
	}

	static void findSum(int t, int index, List<Integer> solution) {
		if (t == 0) {
			System.out.print(solution.get(0));
			for (int i = 1; i < solution.size(); ++i) {
				System.out.print("+" + solution.get(i));
			}
			System.out.println();

			hasSum = true;
		} else if (t > 0) {
			for (int i = index; i <= n; ++i) {
				if (x[i] == x[i - 1] && !isUsed[i - 1]) {
					continue;
				}
				
				isUsed[i] = true;
				solution.add(x[i]);

				findSum(t - x[i], i + 1, solution);

				solution.remove(solution.size() - 1);
				isUsed[i] = false;
			}
		}
	}
}
