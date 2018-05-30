/* Filename: UVa10920.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10920 {
	final static int[] dx = { 0, -1, 0, 1 };
	final static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int SZ = input.nextInt();
			long P = input.nextLong();

			if (SZ == 0 && P == 0) {
				break;
			}

			long currentX = SZ / 2 + 1;
			long currentY = SZ / 2 + 1;
			long floorSqrtP = (int) Math.floor(Math.sqrt(P));
			long currentP = floorSqrtP * floorSqrtP;

			if (floorSqrtP % 2 == 1) {
				currentX += floorSqrtP / 2;
				currentY += floorSqrtP / 2;
			} else {
				currentX -= floorSqrtP / 2;
				currentY = currentY - floorSqrtP / 2 + 1;
			}

			if (P > currentP) {
				if(floorSqrtP % 2 == 1){
					++currentP;
					++currentY;
				} else {
					++currentP;
					--currentY;
				}
				
				long step = floorSqrtP;
				int stage = floorSqrtP % 2 == 1 ? 1 : 3;

				while (currentP != P) {
					long currentStep = step;
					int direction = stage % 4;

					while (currentP != P && currentStep > 0) {
						++currentP;
						currentX += dx[direction];
						currentY += dy[direction];
						--currentStep;
					}

					++stage;
					stage %= 4;

					if ((stage % 4) % 2 == 0) {
						++step;
					}
				}
			}

			System.out.printf("Line = %d, column = %d.\n", currentY, currentX);
		}
	}

}
