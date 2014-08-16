//TLE

/* Filename: UVa347.java
 * Author: Mushiyo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UVa347 {
	static boolean[] posUsed = new boolean[10];
	static boolean[] digitUsed = new boolean[10];
	
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
		FastScanner input = new FastScanner(System.in);
		StringBuilder output = new StringBuilder();
		int caseNum = 1;

		while (input.hasNext()) {
			int num = input.nextInt();
			
			if(num == 0){
				break;
			}
			
			while(!isRunaround(num)){
				++num;
			}
			
			output.append(String.format("Case %d: %d\n", caseNum, num));
			
			++caseNum;
		}
		
		System.out.print(output);
	}
	
	public static boolean isRunaround(int num){
		String numStr = String.valueOf(num);
		int len = numStr.length();
		int pos = 0, move = numStr.charAt(pos) - '0';
		int sequenceLen = 0;
		Arrays.fill(digitUsed, 0, 10, false);
		Arrays.fill(posUsed, 0, len, false);
		
		do{
			pos = (pos + move) % len;
			move = numStr.charAt(pos) - '0';
			++sequenceLen;
			
			if(posUsed[pos] || digitUsed[move]){
				return false;
			}
			else{
				posUsed[pos] = true;
				digitUsed[move] = true;
			}
		}while(!posUsed[0]);
		
		if(sequenceLen != len){
			return false;
		}
		
		return true;
	}

}
