// sieve too small

/* Filename: UVa443.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UVa443 {

	public static void main(String[] args) {
		int[] humbleNum = new int[5842 + 1];
		int index = 0;

		for (int i = 2; i <= 2000000000; ++i) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				humbleNum[index++] = i;
			}
		}

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n % 100 < 11 || n % 100 > 20) {
				switch (n % 10) {
				case 1:
					System.out.printf("The %dst humble number is %d.\n", n,
							humbleNum[n]);
					break;
				case 2:
					System.out.printf("The %dnd humble number is %d.\n", n,
							humbleNum[n]);
					break;
				case 3:
					System.out.printf("The %drd humble number is %d.\n", n,
							humbleNum[n]);
					break;
				default:
					System.out.printf("The %dth humble number is %d.\n", n,
							humbleNum[n]);
					break;
				}
			} else {
				System.out.printf("The %dth humble number is %d.\n", n,
						humbleNum[n]);
			}
		}
	}

}
