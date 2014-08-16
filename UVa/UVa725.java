//TLE

/* Filename: UVa725.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVa725 {
	private static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public boolean hasNext() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String line = br.readLine();
					if (line == null) {
						return false;
					}
					st = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}	
			return true;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) {
		FastScanner input = new FastScanner();
		StringBuilder out = new StringBuilder();
		boolean isFirstOutput = true;

		while (input.hasNext()) {
			int N = input.nextInt();

			if (N == 0) {
				break;
			}

			boolean solutionFound = false;

			if (isFirstOutput) {
				isFirstOutput = false;
			} else {
				out.append('\n');
			}

			for (int abcde = 01234; abcde <= 98765; ++abcde) {
				if (abcde % N == 0) {
					int fghij = abcde / N;

					if (isSolution(abcde, fghij)) {
						out.append(String.format("%05d / %05d = %d\n", abcde, fghij, N));
						solutionFound = true;
					}
				}
			}

			if (solutionFound == false) {
				out.append("There are no solutions for " + N + ".\n");
			}
		}
		
		System.out.print(out);
	}

	private static boolean isSolution(int abcde, int fghij) {
		boolean[] digitUsed = new boolean[10];
		String num1 = String.format("%05d", abcde);
		String num2 = String.format("%05d", fghij);

		if (num1.length() > 5 || num2.length() > 5) {
			return false;
		}

		for (int i = 0; i < num1.length(); ++i) {
			if (digitUsed[num1.charAt(i) - '0']) {
				return false;
			} else {
				digitUsed[num1.charAt(i) - '0'] = true;
			}

			if (digitUsed[num2.charAt(i) - '0']) {
				return false;
			} else {
				digitUsed[num2.charAt(i) - '0'] = true;

			}
		}

		return true;
	}

}
