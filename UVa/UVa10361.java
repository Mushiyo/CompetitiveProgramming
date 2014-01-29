/* Filename: UVa10361.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10361 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			input.nextLine(); // eat change line
			

			while (n > 0) {
				String l1 = input.nextLine();
				String l2 = input.nextLine();

				int leftBracket1 = l1.indexOf('<');
				int rightBracket1 = l1.indexOf('>', leftBracket1);
				int leftBracket2 = l1.indexOf('<', rightBracket1);
				int rightBracket2 = l1.indexOf('>', leftBracket2);

				String s2 = l1.substring(leftBracket1 + 1, rightBracket1);
				String s3 = l1.substring(rightBracket1 + 1, leftBracket2);
				String s4 = l1.substring(leftBracket2 + 1, rightBracket2);
				String s5 = l1.substring(rightBracket2 + 1);
				
				String c1 = l1.replaceAll("<|>", "");
				String c2 = l2.replaceAll("\\.\\.\\.", s4 + s3 + s2 + s5);
				
				System.out.println(c1);
				System.out.println(c2);

				--n;
			}
		}
	}

}
