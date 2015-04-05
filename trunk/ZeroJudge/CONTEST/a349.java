/* Filename: a349.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a349 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] register = new int[4];
		int[] word = new int[8];
		for (int i = 0; i < word.length; ++i) {
			word[i] = input.nextInt();
		}

		while (input.hasNext()) {
			String cmd = input.next();

			if (cmd.equals("LOAD")) {
				int r = input.nextInt();
				int m = input.nextInt();
				
				register[r] = word[m];
			} else if (cmd.equals("STORE")) {
				int m = input.nextInt();
				int r = input.nextInt();
				
				word[m] = register[r];
			} else if (cmd.equals("ADD")) {
				int d = input.nextInt();
				int s1 = input.nextInt();
				int s2 = input.nextInt();
				
				register[d] = register[s1] + register[s2];
			} else if (cmd.equals("MOVE")) {
				int d = input.nextInt();
				int s = input.nextInt();
				
				register[d] = register[s];
			}
		}
		
		System.out.println(register[0]);
		System.out.println(word[0]);
	}

}
