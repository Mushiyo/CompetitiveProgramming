/* Filename: UVa113.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa113 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			double n = input.nextDouble();
			double p = input.nextDouble();
			
			System.out.printf("%.0f\n",Math.pow(p, 1/n));
		}
	}

}
