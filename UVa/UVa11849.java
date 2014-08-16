/* Filename: UVa11849.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;

public class UVa11849 {
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

	public static void main(String[] args) {
		Set<Integer> jack = new HashSet<Integer>();
		Set<Integer> jill = new HashSet<Integer>();
		FastScanner input = new FastScanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			int N = input.nextInt();
			int M = input.nextInt();

			if (N == 0 && M == 0) {
				break;
			}

			jack.clear();
			jill.clear();

			while (N > 0) {
				jack.add(input.nextInt());

				--N;
			}

			while (M > 0) {
				jill.add(input.nextInt());

				--M;
			}

			jack.retainAll(jill);
			output.append(jack.size() + "\n");
		}

		System.out.print(output);
	}

}
