// TLE

/* Filename: UVa10689.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVa10689 {
	static int[] tenPow = {1, 10, 100, 1000, 10000}; 

	public static void main(String[] args) {
		FastScanner input = new FastScanner(System.in);
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			int totalCase = input.nextInt();
			
			while(totalCase > 0){				
				--totalCase;
				
				int a = input.nextInt();
				int b = input.nextInt();
				int n = input.nextInt();
				int m = input.nextInt();
				
				out.append(findFN(a, b, n, m) + "\n");
			}
		}
		
		System.out.print(out);
	}

	static int findFN(int f0, int f1, int n, int m){		
		if(n == 0){
			return f0;
		}
		
		if(n == 1){
			return f1;
		}
		
		int currentTerm = 1;
		int fi_1 = f0;
		int fi = f1;
		
		do{
			int tmp = (fi + fi_1) % tenPow[m];
			fi_1 = fi;
			fi = tmp;
			++currentTerm;
		}while(currentTerm < n);
		
		return fi;
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
	}
}
