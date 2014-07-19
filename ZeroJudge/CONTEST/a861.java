/* Filename: a861.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a861 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int H = input.nextInt();
			int W = input.nextInt();
			int P = 2 * H + 2 * W;
			
			System.out.println(P);
		}
	}

}
