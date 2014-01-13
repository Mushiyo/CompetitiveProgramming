// TLE

/* Filename: UVa410.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVa410 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();				
		final int MAX_S = 10;
		int [] specimen = new int[MAX_S];
		int setNum = 1;

		while (input.hasNext()) {
			int C = input.nextInt();
			int C2 = 2 * C;
			int S = input.nextInt();
			int totalMass = 0;
			Arrays.fill(specimen, 0, C2, 0);
			for (int i = 0; i < S; ++i) {
				specimen[i] = input.nextInt();
				totalMass += specimen[i];
			}
			Arrays.sort(specimen, 0, C2);

			double AM = (double) totalMass / C;
			double imbalance = 0;
			output.append(String.format("Set #%d\n", setNum));
			for (int i = 0; i < C; ++i) {
				output.append(String.format("%2d:", i));
				int CM = 0;
				
				if (specimen[i] > 0) {
					output.append(" " + specimen[i]);
					CM += specimen[i];
				}
				
				if(specimen[C2 - i - 1] > 0){
					output.append(" " + specimen[C2 - i - 1]);
					CM +=  specimen[C2 - i - 1];
				}
				output.append("\n");
				
				imbalance += Math.abs(AM - CM);
			}

			output.append(String.format("IMBALANCE = %.5f\n", imbalance));
			output.append("\n");

			++setNum;
		}
		System.out.print(output);
	}
}
