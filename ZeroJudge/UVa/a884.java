// TLE

/* Filename: a884.java
 * Author: Mushiyo
 */
package UVa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a884 {

	public static void main(String[] args) {
		FastScanner input = new FastScanner(System.in);
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			int testCase = input.nextInt();

			while (testCase > 0) {
				BigInteger A = input.nextBigInteger();
				BigInteger B = input.nextBigInteger();

				out.append(A.subtract(B) + "\n");

				--testCase;
			}
		}
		
		System.out.println(out);
	}

	static class FastScanner {
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
		
		public BigInteger nextBigInteger() {
			return new BigInteger(next());
		}
	}
}
