/* Filename: Kickstart2017RA_A.java
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

public class Kickstart2017RA_A {
	public static void main(String[] args) throws FileNotFoundException {
		final int MOD = 1000000007;
		final boolean STD_IO = false;
		final String INPUT_FILE = "A-large-practice.in";
		InputStream inStream = STD_IO ? System.in : new FileInputStream(new File(INPUT_FILE));
		OutputStream outStream = STD_IO ? System.out : new FileOutputStream(new File("GCJ.out"));
		Scanner input = new Scanner(inStream);
		PrintWriter out = new PrintWriter(outStream);

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int R = input.nextInt();
				int C = input.nextInt();
				int shortSide = Math.min(R, C);
				long sizeMod = ((long) R * C) % MOD;

				long sol = (sizeMod * (sumOfN(shortSide) % MOD)) % MOD;
				sol %= MOD;
				sol -= (((long) R + C) % MOD) * (sumOfSquareMod(shortSide, MOD) % MOD) % MOD;
				sol %= MOD;
				sol += sumOfCubeMod(shortSide, MOD) % MOD;
				sol = (sol + MOD) % MOD;

				out.printf("Case #%d: %d\n", t, sol);
			}
		}

		out.close();
		input.close();
	}

	/*
	 * return the sum of a finite arithmetic progression (AP)
	 */
	public static long finiteAPSum(long firstTerm, long lastTerm, long height) {
		return ((firstTerm + lastTerm) * height) / 2;
	}

	/*
	 * return the sum of the first natural numbers, i.e. 1 + 2 + ... + n
	 */
	public static long sumOfN(long n) {
		return finiteAPSum(1, n, n);
	}

	/*
	 * return the sum of (1^2 + 2^2 + ... + n^2) % m
	 */
	public static long sumOfSquareMod(long n, long m) {
		long sum = 0;

		if ((2 * n + 1) % 3 == 0) {
			return ((((n * (n + 1) / 2)) % m) * ((2 * n + 1) / 3)) % m;
		} else { // then either n % 3 == 0 or (n + 1) % 3 == 0
			return ((((n * (n + 1) / 6)) % m) * (2 * n + 1)) % m;
		}
	}

	/*
	 * return the sum of (1^3 + 2^3 + ... + n^3) % m
	 */
	public static long sumOfCubeMod(long n, long m) {
		long root = finiteAPSum(1, n, n) % m;
		return (root * root) % m;
	}
}
