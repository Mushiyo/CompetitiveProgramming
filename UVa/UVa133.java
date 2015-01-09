/* Filename: UVa133.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa133 {
	private static final int CCW = 1; // counter-clockwise
	private static final int CW = -1; // clockwise

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int k = input.nextInt();
			int m = input.nextInt();

			if (N == 0 && m == 0 && k == 0) {
				break;
			}

			int ccwPos = N, cwPos = 1; // set them to their "previous" position before count the next round
			boolean[] peopleOut = new boolean[N + 1];
			peopleOut[0] = true;
			// "peopleOut[i] == false" means people i is still in queue

			while (N > 0) {
				ccwPos = choosePerson(peopleOut, ccwPos, CCW, k);
				cwPos = choosePerson(peopleOut, cwPos, CW, m);

				if (ccwPos != cwPos) {
					peopleOut[ccwPos] = true;
					peopleOut[cwPos] = true;
					N -= 2;

					System.out.printf("%3d%3d", ccwPos, cwPos);
				} else {
					peopleOut[ccwPos] = true;
					--N;

					System.out.printf("%3d", ccwPos);
				}

				if (N > 0) {
					System.out.printf(",");
				}
			}
			System.out.printf("\n");
		}
	}

	private static int choosePerson(boolean[] peopleOut, int currPos,
			int direction, int length) {
		int totalPeople = peopleOut.length - 1;
		
		while (length > 0) {
			do {
				currPos = (currPos + direction + totalPeople - 1) % totalPeople + 1;
			} while (peopleOut[currPos] == true);

			--length;
		}

		return currPos;
	}
}
