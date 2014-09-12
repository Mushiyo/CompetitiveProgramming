/* Filename: UVa11854.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11854 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int side1 = input.nextInt();
			int side2 = input.nextInt();
			int side3 = input.nextInt();
			
			if(side1 == 0 && side2 == 0 && side3 == 0){
				break;
			}

			if (isRightTriangle(side1, side2, side3)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}

	static boolean isRightTriangle(int side1, int side2, int side3) {
		int sideSum = side1 + side2 + side3;
		int maxSide = Math.max(Math.max(side1, side2), side3);
		int minSide = Math.min(Math.min(side1, side2), side3);
		int midSide = sideSum - maxSide - minSide;

		return Math.hypot(minSide, midSide) == maxSide;
	}

}
