/*
ID: mushiyo1
LANG: JAVA
TASK: combo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class combo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("combo.in"));
		PrintWriter output = new PrintWriter("combo.out");
		final int SIZE = 3;

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] John = new int[SIZE];
			int[] master = new int[SIZE];

			for (int i = 0; i < John.length; ++i) {
				John[i] = input.nextInt();
			}

			for (int i = 0; i < master.length; ++i) {
				master[i] = input.nextInt();
			}

			output.println(countDistinct(N, John, master));
		}

		input.close();
		output.close();
	}

	public static int countDistinct(int N, int[] lock1, int[] lock2) {
		int distinctSetting = 0;

		for (int i = 1; i <= N; ++i) {
			for (int j = 1; j <= N; ++j) {
				for (int k = 1; k <= N; ++k) {
					if (canOpen(N, i, j, k, lock1)
							|| canOpen(N, i, j, k, lock2)) {
						++distinctSetting;
					}
				}
			}
		}

		return distinctSetting;
	}

	public static boolean canOpen(int N, int a, int b, int c, int[] lock) {
		if ((Math.abs(a - lock[0]) <= 2 || Math.abs(a - lock[0]) >= N - 2)
				&& (Math.abs(b - lock[1]) <= 2 || Math.abs(b - lock[1]) >= N - 2)
				&& (Math.abs(c - lock[2]) <= 2 || Math.abs(c - lock[2]) >= N - 2)) {
			return true;
		}

		return false;
	}
}
