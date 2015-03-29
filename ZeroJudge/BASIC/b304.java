// WA

/* Filename: b304.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;
import java.util.Stack;

public class b304 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			input.nextLine(); // eat change line

			while (n > 0) {
				String parentheses = input.nextLine();
				Stack<Character> checker = new Stack<Character>();

				boolean notMatch = false;
				for (int i = 0; notMatch == false && i < parentheses.length(); ++i) {
					char bracket = parentheses.charAt(i);
					
					switch (bracket) {
					case '(':
					case '[':
						checker.push(bracket);
						break;
						
					case ')':
						if (checker.empty() == false) {
							if (checker.peek() == '(') {
								checker.pop();
							}
						}
						else{
							notMatch = true;
						}
						break;

					case ']':
						if (checker.empty() == false) {
							if (checker.peek() == '[') {
								checker.pop();
							}
						}
						else{
							notMatch = true;
						}
						break;
					}
				}
				
				if(notMatch || checker.empty() == false){
					System.out.println("No");
				}
				else{
					System.out.println("Yes");
				}

				--n;
			}
		}
	}

}
