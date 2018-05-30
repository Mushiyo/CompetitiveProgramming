
/* Filename: Kickstart2018RC_C.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Kickstart2018RC_C {
	public static void main(String[] args) throws FileNotFoundException {
		final boolean STD_IO = true;
		final String INPUT_FILE = "A-small-attempt0.in";
		InputStream inStream = STD_IO ? System.in : new FileInputStream(new File(INPUT_FILE));
		OutputStream outStream = STD_IO ? System.out : new FileOutputStream(new File("GCJ.out"));
		Scanner input = new Scanner(inStream);
		PrintWriter out = new PrintWriter(outStream);
		
		final int MOD = 1000000007;
		final BigInteger BIG_MOD = BigInteger.valueOf(1000000007);
		int[][] power = new int[100 + 1][20 + 1];
		for(int i = 1; i < power.length; ++i){
			BigInteger bigI = BigInteger.valueOf(i);
			for(int j = 1; j < power.length; ++j){
				BigInteger bigJ = BigInteger.valueOf(j);
				power[i][j] = bigI.modPow(bigJ, BIG_MOD).intValue(); 
			}
		}
		

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();
				int K = input.nextInt();
				int[] x = new int[N];
				int[] y = new int[N];
				x[0] = input.nextInt();
				y[0] = input.nextInt();
				int C = input.nextInt();
				int D = input.nextInt();
				int E1 = input.nextInt();
				int E2 = input.nextInt();
				int F = input.nextInt();
				int[] A = new int[N];

				A[0] = (x[0] + y[0]) % F;
				for (int i = 1; i < A.length; ++i) {
					x[i] = (C * x[i - 1] + D * y[i - 1] + E1) % F;
					y[i] = (D * x[i - 1] + C * y[i - 1] + E2) % F;
					A[i] = (x[i] + y[i]) % F;
				}

				System.err.println(Arrays.toString(A));

				out.printf("Case #%d: ", t);
			}
		}

		out.close();
		input.close();
	}
}