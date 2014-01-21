/* Filename: a671.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class a671 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			double n = input.nextDouble();
			double p = input.nextDouble();
			
			System.out.printf("%.0f\n",Math.pow(p, 1/n));
		}
	}

}
