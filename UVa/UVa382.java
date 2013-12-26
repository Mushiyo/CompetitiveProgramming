/* Filename: UVa382.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa382 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.printf("PERFECTION OUTPUT\n");
		while (input.hasNext()) {
			int N = input.nextInt();

			if (N == 0) {
				System.out.printf("END OF OUTPUT\n");
				break;
			}

			int sumOfProperDivisor = 0;
			for (int i = 1; i < N; ++i) {
				if (N % i == 0) {
					sumOfProperDivisor += i;
				}
			}

			System.out.printf("%5d  ", N);
			if (sumOfProperDivisor < N) {
				System.out.printf("DEFICIENT\n");
			} else if (sumOfProperDivisor > N) {
				System.out.printf("ABUNDANT\n");
			} else {
				System.out.printf("PERFECT\n");
			}
		}
	}

}
