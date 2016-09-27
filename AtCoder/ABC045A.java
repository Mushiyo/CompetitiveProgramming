/* Filename: ABC045A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC045A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			int h = input.nextInt();
			
			System.out.println((a + b) * h / 2);
		}
	}

}
