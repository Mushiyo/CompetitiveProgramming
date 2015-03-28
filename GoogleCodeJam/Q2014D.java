/* Filename: Q2014D.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Q2014D {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("D-large.in"));
		PrintWriter out = new PrintWriter(new File("pD.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int x = 1; x <= T; ++x) {
				int N = input.nextInt();
				double[] naomi = new double[N];

				for (int i = 0; i < N; ++i) {
					naomi[i] = input.nextDouble();
				}
				Arrays.sort(naomi);

				double[] ken = new double[N];
				for (int i = 0; i < N; ++i) {
					ken[i] = input.nextDouble();
				}
				Arrays.sort(ken);

				int y = countPoint(ken, naomi, 2);
				//System.out.println("--------------");
				int z = countPoint(naomi, ken, 1);

				out.printf("Case #%d: %d %d\n", x, y, z);
			}
		}

		out.close();
	}

	public static int countPoint(double[] first, double[] second, int flag) {
		//System.out.println(Arrays.toString(first));
		//System.out.println(Arrays.toString(second));

		int f = 0, s = 0;
		int size = first.length;
		//int firstPoint = 0;
		int secondPoint = 0;

		while (f < size && s < size) {
			while (s < size && second[s] < first[f]) {
				//System.out.println(second[s] + " < " + first[f]);

				++s;
				//++firstPoint;
			}
			
			if(s >= size){
				break;
			}
			
			++s;
			++secondPoint;

			++f;
		}

//		if (s == size && f < size) {
//			firstPoint += size - f;
//		}

		int firstPoint = size - secondPoint;
		
//		System.out.println("first: " + firstPoint + ", second: "
//				+ (size - firstPoint));
		if (flag == 1) {
			return firstPoint;
		}
		
		return size - firstPoint;
		// return size - secondPoint;
	}
}
