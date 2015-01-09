/* Filename: UVa10469.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10469 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int int1 = input.nextInt();
			int int2 = input.nextInt();
			
			System.out.println(int1 ^ int2);
		}
	}

}
