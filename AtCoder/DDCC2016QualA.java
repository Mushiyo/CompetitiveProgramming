/* Filename: DDCC2016QualA.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class DDCC2016QualA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int A = input.nextInt();
			int B = input.nextInt();
			int C = input.nextInt();
			
			System.out.println(B * C / (double) A);
		}
	}

}
