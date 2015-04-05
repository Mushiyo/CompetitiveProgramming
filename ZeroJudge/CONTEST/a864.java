/* Filename: a864.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a864 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String name = input.next();

			if (name.equals("END")) {
				break;
			}

			double mB = input.nextDouble();
			double mV = input.nextDouble();
			double mBMinusMV = mB - mV;

			System.out.printf("%s %.2f ", name, mBMinusMV);
			if (mBMinusMV > 1.499) {
				System.out.println("M");
			} else if (mBMinusMV > 0.999) {
				System.out.println("K");
			} else if (mBMinusMV > 0.499) {
				System.out.println("G");
			} else if (mBMinusMV > 0.249) {
				System.out.println("F");
			} else if (mBMinusMV > -0.001) {
				System.out.println("A");
			} else if (mBMinusMV > -0.251) {
				System.out.println("B");
			} else if (mBMinusMV >= -0.350) {
				System.out.println("O");
			}
		}
	}
}
