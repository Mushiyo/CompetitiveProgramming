//TLE

package BASIC;

import java.util.Scanner;

public class a289 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			long a = input.nextInt();
			long n = input.nextInt();

			long b = 1;
			while (a * b % n != 1) {
				if (b > n) {
					break;
				}

				++b;
			}

			if (b > n) {
				System.out.println("No Inverse");
			}
			else {
				System.out.println(b);
			}
		}
	}

}
