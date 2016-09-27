/* Filename: ABC043A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC043A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			System.out.println(((1 + N) * N) / 2); 
		}
	}

}
