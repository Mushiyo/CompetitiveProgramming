/* Filename: d202.java
 * Author: Mushiyo
 */
package ORIGINAL;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;

public class d202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			BigDecimal a = input.nextBigDecimal();
			BigDecimal b = input.nextBigDecimal();
			
			System.out.println(a.add(b).setScale(200, BigDecimal.ROUND_HALF_UP));
		}
	}

}
