/* Filename: a870.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class a870 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> list = new LinkedList<String>();

		while (input.hasNext()) {
			String cmd = input.next();

			if (cmd.equals("ADD")) {
				String X = input.next();

				list.add(X);
			} else if (cmd.equals("INSERT")) {
				String X = input.next();
				String N = input.next();
				int indexN = list.indexOf(N);

				list.add(indexN, X);
			} else if (cmd.equals("REMOVE")) {
				String X = input.next();
				int indexX = list.indexOf(X);

				list.remove(indexX);
			} else if (cmd.equals("SHOW")) {
				System.out.print(list.get(0));
				for (int i = 1; i < list.size(); ++i) {
					System.out.print(" " + list.get(i));
				}
				System.out.println();

				break;
			}
		}
	}

}
