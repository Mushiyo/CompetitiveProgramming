/* Filename: UVa11532.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11532 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int C = input.nextInt();
			
			while (C > 0) {
				int P = input.nextInt();
				int Q = input.nextInt();
				StringBuilder bitNum = new StringBuilder();

				while (P >= 2 && Q > 0) {
					bitNum.append("101");
					P -= 2;
					--Q;
				}

				if (P > 0 && Q > 0) {
					bitNum.insert(0, 1);
					--P;
					--Q;
				}

				while (P > 0) {
					bitNum.append(1);
					--P;
				}

				bitNum.insert(0, 0);

				System.out.println(Long.valueOf(bitNum.toString(), 2));

				--C;
			}
		}

	}
}
