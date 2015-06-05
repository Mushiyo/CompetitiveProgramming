/* Filename: Timus1792.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1792 {
	static final int DISK1 = 0, DISK2 = 1, DISK3 = 2, DISK4 = 3;
	static final int PETAL1 = 4, PETAL2 = 5, PETAL3 = 6;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int[] bit = new int[7];

			for (int i = 0; i < bit.length; ++i) {
				bit[i] = input.nextInt();
			}

			for (int i = 0; i < bit.length; ++i) {
				if (isHammingCode(bit)) {
					break;
				} else {
					bit[i] ^= 1;
					if (isHammingCode(bit)) {
						break;
					} else {
						bit[i] ^= 1;
					}
				}
			}

			System.out.print(bit[0]);
			for (int i = 1; i < bit.length; ++i) {
				System.out.print(" " + bit[i]);
			}
			System.out.println();
		}
	}

	private static boolean isHammingCode(int[] bit) {
		boolean valid1 = (bit[DISK2] + bit[DISK3] + bit[DISK4]) % 2 == bit[PETAL1];
		boolean valid2 = (bit[DISK1] + bit[DISK3] + bit[DISK4]) % 2 == bit[PETAL2];
		boolean valid3 = (bit[DISK1] + bit[DISK2] + bit[DISK4]) % 2 == bit[PETAL3];
		return valid1 && valid2 && valid3;
	}

}
