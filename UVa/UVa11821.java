/* Filename: UVa11821.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class UVa11821 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			while (n > 0) {
				BigDecimal sum = BigDecimal.valueOf(0);
				BigDecimal num = BigDecimal.valueOf(0);

				do {
					num = input.nextBigDecimal();
					sum = sum.add(num);
				} while (num.equals(BigDecimal.ZERO) == false);

				// There's a bug in BigDecimal.stripTrailingZeros()
				// which will not make 0.0 to be output as 0
				// reference: http://bugs.java.com/bugdatabase/view_bug.do?bug_id=6480539
				if (sum.compareTo(BigDecimal.ZERO) == 0) {
					System.out.println(0);
				} else {
					System.out.println(sum.stripTrailingZeros().toPlainString());
				}

				--n;
			}
		}
	}

}
