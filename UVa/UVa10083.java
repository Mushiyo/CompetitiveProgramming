//TLE

/* Filename: UVa10083.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class UVa10083 {
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
		
		public BigInteger nextBigInteger() {
			return new BigInteger(next());
		}
	}
	
	final static int QUOTIENT = 0;
	final static int REMAINDER = 1;

	public static void main(String[] args) {
		FastScanner input = new FastScanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			BigInteger t = input.nextBigInteger();
			int a = input.nextInt();
			int b = input.nextInt();
			
			BigInteger numerator = t.pow(a).subtract(BigInteger.ONE);
			BigInteger denominator = t.pow(b).subtract(BigInteger.ONE);
			BigInteger[] ans = numerator.divideAndRemainder(denominator);
			
			output.append(String.format("(%s^%d-1)/(%s^%d-1) ", t, a, t, b));
			if(ans[QUOTIENT].toString().length() >= 100 || !ans[REMAINDER].equals(BigInteger.ZERO)){
				output.append("is not an integer with less than 100 digits.\n");
			}
			else{
				output.append(ans[QUOTIENT] + "\n");
			}
		}
		
		System.out.print(output);
	}

}
