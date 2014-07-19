/* Filename: a862.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a862 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			double V = input.nextDouble();
			double R = input.nextDouble();
			double I1000 = (V * 1000) / R;
			
			System.out.printf("%.4f\n", I1000);
		}
	}

}
