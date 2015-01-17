/* Filename: UVa11340.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class UVa11340 {

	public static void main(String[] args) {
		FastScanner input = new FastScanner(System.in);
		Map<Character, Integer> charVal = new HashMap<Character, Integer>();
		
		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				charVal.clear();
				int K = input.nextInt();
				
				while(K > 0){
					charVal.put(input.next().charAt(0), input.nextInt());	
					--K;
				}
				
				int M = input.nextInt();
				long paid = 0;
				while(M > 0){
					String lineOfChar = input.nextLine();
					
					for(int i = 0; i < lineOfChar.length(); ++i){
						if(charVal.containsKey(lineOfChar.charAt(i))){
							paid += charVal.get(lineOfChar.charAt(i)); 
						}
					}
					
					--M;
				}
				
				System.out.printf("%.2f$\n", paid / 100.0);
				
				--N;
			}
		}
	}
	
	private static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		
		public FastScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
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
