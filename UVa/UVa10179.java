/* Filename: UVa10179.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UVa10179 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			System.out.println(eulersTotient(n));
		}
	}

	public static int eulersTotient(int n) {
		int sqrtN = (int) Math.sqrt(n);
		int relPrimeNum = n;

		if (n % 2 == 0) {
			relPrimeNum -= relPrimeNum / 2;

			while (n % 2 == 0) {
				n /= 2;
			}
		}

		for (int i = 3; i <= sqrtN && n != 1; i += 2) {
			if (n % i == 0) {
				relPrimeNum -= relPrimeNum / i;

				while (n % i == 0) {
					n /= i;
				}
			}
		}
		
		if(n != 1){
			relPrimeNum -= relPrimeNum / n;
		}

		return relPrimeNum;
	}
}
