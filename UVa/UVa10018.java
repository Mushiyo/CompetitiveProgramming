/* Filename: UVa10018.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10018 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		while (N > 0) {
			StringBuilder num = new StringBuilder(input.next());
			StringBuilder numRev = new StringBuilder(num).reverse();

			int plusTimes = 0;
			do {
				long sum = Long.valueOf(num.toString())
						+ Long.valueOf(numRev.toString());
				num = new StringBuilder(Long.toString(sum));
				numRev = new StringBuilder(num).reverse();

				++plusTimes;
			} while (!num.toString().matches(numRev.toString()));

			System.out.println(plusTimes + " " + num);

			--N;
		}
	}

}
