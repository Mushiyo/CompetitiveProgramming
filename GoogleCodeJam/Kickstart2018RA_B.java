
/* Filename: Kickstart2018RA_B.java
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

public class Kickstart2018RA_B {

	public static void main(String[] args) throws FileNotFoundException {
		final boolean STD_IO = false;
		final String INPUT_FILE = "B-small-attempt1.in";
		InputStream inStream = STD_IO ? System.in : new FileInputStream(new File(INPUT_FILE));
		OutputStream outStream = STD_IO ? System.out : new FileOutputStream(new File("GCJ.out"));
		Scanner input = new Scanner(inStream);
		PrintWriter out = new PrintWriter(outStream);

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();
				int K = input.nextInt();
				long[] V = new long[N];
				long sum = 0;
				long max = 0;

				for (int i = 0; i < V.length; ++i) {
					V[i] = input.nextInt();
					sum += V[i];
					max = Math.max(max, V[i]);
				}

				double expVal = (double) sum / V.length;

				if (K != 0) {
					int expSmallCount = 0;
					
					
					int maxCount = 0;
					
					for(long v : V){
						if(v < max){
							++maxCount;
						}
						if(v < expVal){
							++expSmallCount;
						}
					}
					
					int notMaxCount = N - maxCount;
					double maxChance = (double)maxCount / N; 
					expVal = max * maxChance + (1 - (double)expSmallCount / N) * expVal;
				}

				out.printf("Case #%d: %.6f\n", t, expVal);
			}
		}

		out.close();
		input.close();
	}
}
