/* Filename: Timus2006.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus2006 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();

			System.out.println(Math.min(a - b * c, a - b - c));
		}
	}

}
