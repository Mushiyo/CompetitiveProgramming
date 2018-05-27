/* Filename: UVa10855.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10855 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int n = input.nextInt();

			if (N == 0 && n == 0) {
				break;
			}

			char[][] square1 = new char[N][N];
			for (int i = 0; i < square1.length; ++i) {
				square1[i] = input.next().toCharArray();
			}

			char[][] square2 = new char[n][n];
			for (int i = 0; i < square2.length; ++i) {
				square2[i] = input.next().toCharArray();
			}

			int[] countAppearance = new int[4];
			for (int i = 0; i < 4; ++i) {
				for (int i1 = 0; i1 + square2.length - 1 < square1.length; ++i1) {
					for (int j1 = 0; j1 + square2.length - 1 < square1[i1].length; ++j1) {
						if(isSubEqual(i1, j1, square1, square2)){
							++countAppearance[i];
						}
					}
				}
				
				square2 = clockwise90(square2);
			}
			
			System.out.print(countAppearance[0]);
			for(int i = 1; i < countAppearance.length; ++i){
				System.out.print(" " + countAppearance[i]);
			}
			System.out.println();
		}
	}

	private static boolean isSubEqual(int i1, int j1, char[][] square1, char[][] square2) {
		for (int i2 = 0; i2 < square2.length; ++i2) {
			for (int j2 = 0; j2 < square2[i2].length; ++j2) {
				if (square2[i2][j2] != square1[i1 + i2][j1 + j2]) {
					return false;
				}
			}
		}

		return true;
	}

	private static char[][] clockwise90(char[][] a) {
		char[][] cw90 = new char[a[0].length][a.length];

		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				cw90[i][j] = a[a.length - 1 - j][i];
			}
		}

		return cw90;
	}
}
