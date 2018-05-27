/* Filename: GCJ2018QB.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class GCJ2018QB {
	public static void main(String[] args) {
		FastScanner input = new FastScanner(System.in);
		final int MAX_N = 100000;
		int[] oddV = new int[MAX_N / 2];
		int[] evenV = new int[MAX_N / 2];
		
		while(input.hasNext()){
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();
				
				for(int i = 0; i < N; ++i){
					if(i % 2 == 0){
						evenV[i / 2] = input.nextInt();
					} else {
						oddV[i / 2] = input.nextInt();
					}
				}
				
				Arrays.sort(evenV, 0 , N / 2 + N % 2);
				Arrays.sort(oddV, 0 , N / 2);
				
				int errorPoint = -1;
				for(int i = 0; i < N - 1; ++i){
					if(i % 2 == 0){
						if(evenV[i / 2] > oddV[i / 2]){
							errorPoint = i;
							break;
						}
					} else {
						if(oddV[i / 2] > evenV[i / 2 + 1]){
							errorPoint = i;
							break;
						}
					}
				}
				
				System.out.printf("Case #%d: ", t);
				System.out.println(errorPoint == -1 ? "OK": errorPoint);
			}
		}
	}
	
	private static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public FastScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		// source: http://codeforces.ru/blog/entry/7805#comment-134954
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

		public String nextLine() {
			String ret = null;
			try {
				ret = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return ret;
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
