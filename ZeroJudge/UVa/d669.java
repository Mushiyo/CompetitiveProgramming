/* Filename: d669.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d669 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int H1 = input.nextInt();
			int M1 = input.nextInt();
			int H2 = input.nextInt();
			int M2 = input.nextInt();

			if (H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0) {
				break;
			}

			if (H2 < H1) {
				H2 += 24;
			}

			if (H2 == H1 && M2 < M1) {
				H2 += 24;
			}

			int sleepMinute = 60 * H2 + M2 - (60 * H1 + M1);

			System.out.println(sleepMinute);
		}
	}

}
