/* Filename: UVa10222.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10222 {
	final static String decodeFunc = " czaqsdfyghjbvui w etx  r ";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String encodedMessage = input.nextLine().toLowerCase();
			StringBuilder decodedMessage = new StringBuilder();

			for (int i = 0; i < encodedMessage.length(); ++i) {
				char current = encodedMessage.charAt(i);
				if (Character.isLetter(current)) {
					decodedMessage.append(decodeFunc.charAt(current - 'a'));
				} else {
					switch (current) {
					case '[':
						decodedMessage.append('o');
						break;
					case ']':
						decodedMessage.append('p');
						break;
					case ';':
						decodedMessage.append('k');
						break;
					case '\'':
						decodedMessage.append('l');
						break;
					case ',':
						decodedMessage.append('n');
						break;
					case '.':
						decodedMessage.append('m');
						break;
					case '/':
						decodedMessage.append(',');
						break;
					default:
						decodedMessage.append(current);
						break;
					}
				}
			}

			System.out.println(decodedMessage);
		}
	}

}
