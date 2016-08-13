/* Filename: ABC043B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC043B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.next();
			StringBuilder result = new StringBuilder();

			for (int i = 0; i < s.length(); ++i) {
				switch (s.charAt(i)) {
				case '0':
					result.append('0');
					break;
				case '1':
					result.append('1');
					break;
				case 'B':
					if (result.length() > 0){
						result.deleteCharAt(result.length() - 1);
					}
					break;
				}
			}
			
			System.out.println(result);
		}
	}
}
