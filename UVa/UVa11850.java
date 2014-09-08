/* Filename: UVa11850.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVa11850 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			int[] station = new int[n];
			for (int i = 0; i < station.length; ++i) {
				station[i] = input.nextInt();
			}

			Arrays.sort(station);

			boolean isPossible = true;
			for (int i = 1; i < station.length; ++i) {
				if (station[i] - station[i - 1] > 200) {
					isPossible = false;
				}
			}

			if ((1422 - station[station.length - 1]) * 2 > 200) {
				isPossible = false;
			}

			if (isPossible) {
				System.out.println("POSSIBLE");
			} else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}

}
