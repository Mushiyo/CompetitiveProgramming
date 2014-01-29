/* Filename: UVa591.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa591 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int setNum = 1;

		while (input.hasNext()) {
			int n = input.nextInt();
			if (n == 0) {
				break;
			}

			int[] brickHeight = new int[n];
			int brickSum = 0;

			for (int i = 0; i < brickHeight.length; ++i) {
				brickHeight[i] = input.nextInt();
				brickSum += brickHeight[i];
			}

			int brickAvg = brickSum / n;

			int brickMove = 0;
			for (int i = 0; i < brickHeight.length; ++i) {
				if (brickHeight[i] > brickAvg) {
					brickMove += brickHeight[i] - brickAvg;
				}
			}

			System.out.println("Set #" + setNum);
			System.out.println("The minimum number of moves is " + brickMove
					+ ".");
			System.out.println();

			++setNum;
		}
	}

}
