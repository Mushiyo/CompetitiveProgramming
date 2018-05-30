/* Filename: Kickstart2018RA_A.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kickstart2018RA_A {

	public static void main(String[] args) throws FileNotFoundException {
		final boolean STD_IO = false;
		final String INPUT_FILE = "A-large.in";
		InputStream inStream = STD_IO ? System.in : new FileInputStream(new File(INPUT_FILE));
		OutputStream outStream = STD_IO ? System.out : new FileOutputStream(new File("GCJ.out"));
		Scanner input = new Scanner(inStream);
		PrintWriter out = new PrintWriter(outStream);

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				long N = input.nextLong();
				long roundUpN = roundUp(N);
				long roundDownN = roundDown(N);
				
				//System.err.println(roundDownN);
								
				out.printf("Case #%d: %d\n", t, Math.min(roundUpN - N, N - roundDownN));
			}
		}

		out.close();
		input.close();
	}
	
	private static long roundDown(long n){
		char[] strN = String.valueOf(n).toCharArray();
		
		int msOddIndex = -1;
		for(int i = 0; i < strN.length; ++i){
			if((strN[i] - '0') % 2 == 1){
				msOddIndex = strN.length - i - 1;
				break;
			}
		}
		
		if(msOddIndex < 0){
			return n;
		}
		
		long exp = 1;
		long tail = 0;
		for(int i = 0; i < msOddIndex; ++i) {
			tail += 8 * exp;
			exp *= 10;
		}
		
		long result = ((n / exp) - 1) * exp + tail; 
				
		return roundDown(result);
	}
	
	private static long roundUp(long n){
		char[] strN = String.valueOf(n).toCharArray();
		
		int msOddIndex = -1;
		for(int i = 0; i < strN.length; ++i){
			if((strN[i] - '0') % 2 == 1){
				msOddIndex = strN.length - i - 1;
				break;
			}
		}
		
		if(msOddIndex < 0){
			return n;
		}
		
		long exp = 1;
		for(int i = 0; i < msOddIndex; ++i) {
			exp *= 10;
		}
		
		long result = ((n / exp) + 1) * exp; 
				
		return roundUp(result);
	}
}
