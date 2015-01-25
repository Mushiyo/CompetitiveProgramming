/* Filename: UVa11462.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UVa11462 {

	public static void main(String[] args) {
		FastScanner input = new FastScanner(System.in);
		int[] ageCount = new int[100];
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			Arrays.fill(ageCount, 0);

			int minAge = Integer.MAX_VALUE;
			for (int i = 0; i < n; ++i) {
				int age = input.nextInt();
				++ageCount[age];

				minAge = Math.min(minAge, age);
			}

			out.append(minAge);
			--ageCount[minAge];
			for (int i = minAge; i < ageCount.length; ++i) {
				while (ageCount[i] > 0) {
					out.append(String.format(" %d", i));
					--ageCount[i];
				}
			}
			out.append('\n');

		}

		System.out.print(out);
	}
	
	private static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		
		public FastScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
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
}
