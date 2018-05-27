
/* Filename: Kickstart2017R1A_C.java
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
import java.util.Arrays;

public class Kickstart2017RA_C {
	public static void main(String[] args) throws FileNotFoundException {
		final boolean STD_IO = true;
		final String INPUT_FILE = "C-small-practice.in";
		InputStream inStream = STD_IO ? System.in : new FileInputStream(new File(INPUT_FILE));
		OutputStream outStream = STD_IO ? System.out : new FileOutputStream(new File("GCJ.out"));
		Scanner input = new Scanner(inStream);
		PrintWriter out = new PrintWriter(outStream);

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();
				int[] X = new int[N];
				int[] Y = new int[N];
				int[] Z = new int[N];
				int[] R = new int[N];

				int xMin = Integer.MAX_VALUE;
				int xMax = Integer.MIN_VALUE;
				int yMin = Integer.MAX_VALUE;
				int yMax = Integer.MIN_VALUE;
				int zMin = Integer.MAX_VALUE;
				int zMax = Integer.MIN_VALUE;

				for (int i = 0; i < X.length; ++i) {
					X[i] = input.nextInt();
					Y[i] = input.nextInt();
					Z[i] = input.nextInt();
					R[i] = input.nextInt();

					xMin = Math.min(xMin, X[i] - R[i]);
					xMax = Math.max(xMax, X[i] + R[i]);
					yMin = Math.min(yMin, Y[i] - R[i]);
					yMax = Math.max(yMax, Y[i] + R[i]);
					zMin = Math.min(zMin, Z[i] - R[i]);
					zMax = Math.max(zMax, Z[i] + R[i]);
				}

				System.err.println(xMax + " " + yMax + " " + zMax);
				System.err.println(xMin + " " + yMin + " " + zMin);

				int max = Math.max(xMax, Math.max(yMax, zMax));
				int min = Math.min(xMin, Math.min(yMin, zMin));
				int upperBound = max - min;
				int lowerBound = 0;
				boolean[] isInCube = new boolean[N];

				while (upperBound - lowerBound > 1) {
					System.err.println(upperBound + " " + lowerBound);
					int edgeLen = (upperBound + lowerBound) / 2;
					Arrays.fill(isInCube, false);

					for (int i = 0; i < X.length; ++i) {
						System.err.println("min: " + (X[i] - R[i]) + " " + (Y[i] - R[i]) + " " + (Z[i] - R[i]));
						System.err.println("max: " + (X[i] + R[i]) + " " + (Y[i] + R[i]) + " " + (Z[i] + R[i]));
						if (xMin <= X[i] - R[i] && X[i] + R[i] <= xMin + edgeLen
								&& yMin <= Y[i] - R[i] && Y[i] + R[i] <= yMin + edgeLen
								&& zMin <= Z[i] - R[i] && Z[i] + R[i] <= zMin + edgeLen) {
							isInCube[i] = true;
						}

						if (xMax - edgeLen <= X[i] - R[i] && X[i] + R[i] <= xMax && yMax - edgeLen <= Y[i] - R[i]
								&& Y[i] + R[i] <= yMax && zMax - edgeLen <= Z[i] - R[i] && Z[i] + R[i] <= zMax) {
							isInCube[i] = true;
						}
					}

					boolean allIn = true;
					for (int i = 0; i < isInCube.length; ++i) {
						if (isInCube[i] == false) {
							allIn = false;
							break;
						}
					}
					System.err.println(Arrays.toString(isInCube));
					if (allIn) {
						upperBound = edgeLen;
					} else {
						lowerBound = edgeLen;
					}
				}

				out.printf("Case #%d: %d\n", t, upperBound);
			}
		}

		out.close();
		input.close();
	}
}
