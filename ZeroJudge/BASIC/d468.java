// RE

package BASIC;

import java.util.Scanner;
import java.math.BigDecimal;

;

public class d468 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int a = input.nextInt();
			int n = input.nextInt();

			if (a == 0 && n == 0) {
				System.out.println("All Over.");
				break;
			} else {

				System.out.printf(String.format("%.0f\n", Math.pow(a, n)));
			}
		}
	}

}
