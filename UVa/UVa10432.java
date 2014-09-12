/* Filename: UVa10432.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10432 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			double r = input.nextDouble();
			double n = input.nextDouble();
			double rad = Math.toRadians(360 / n);
			
			System.out.printf("%.3f\n", n * r * r * Math.sin(rad) * 0.5);
		}
	}

}
