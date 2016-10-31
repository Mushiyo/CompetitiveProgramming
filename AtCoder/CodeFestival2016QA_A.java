/* Filename: CodeFestival2016QA_A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class CodeFestival2016QA_A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			StringBuilder sb = new StringBuilder(input.next());
			
			System.out.println(sb.insert(4, ' '));
		}
	}

}
