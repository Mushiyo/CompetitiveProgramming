// TLE

/* Filename: UVa11723.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa11723 {

	public static void main(String[] args) {
		FastScanner input = new FastScanner(System.in);
		StringBuilder out = new StringBuilder();
		int caseNum = 1;

		while (input.hasNext()) {
			int R = input.nextInt();
			int N = input.nextInt();
			
			if(R == 0 && N == 0){
				break;
			}
			
			int indexNeeded = (int)Math.ceil((double)R / N) - 1;
			out.append(String.format("Case %d: ", caseNum));
			if(indexNeeded > 26){
				out.append("impossible\n");
			}
			else{
				out.append(indexNeeded + "\n");
			}
			
			++caseNum;
		}
		
		System.out.print(out);
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
