/* Filename: a785.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a785 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int root = 0, suffix = 1;

		while (input.hasNext()) {
			String[] line = input.nextLine().split("-");

			if (line[0].equals("END")) {
				break;
			}

			if (line[suffix].startsWith("w")) {
				System.out.println(String.format("%sw%s",
						line[root].substring(0, line[root].length() - 1),
						line[suffix].substring(1)));
			} else if (line[suffix].startsWith("o")) {
				if (line[root].endsWith("a")) {
					line[suffix] = line[suffix].replaceFirst("ou|o", "w");
					System.out.println(String.format("%s%s",
							line[root].substring(0, line[root].length() - 1),
							line[suffix]));
				} else {
					System.out.println(String.format("%sou%s",
							line[root].substring(0, line[root].length() - 1),
							line[suffix].substring(1)));
				}
			} else if (line[suffix].startsWith("a")
					|| line[suffix].startsWith("y")) {
				if (line[root].endsWith("a")) {
					System.out.println(String.format("%s%s", line[root],
							line[suffix].substring(1)));
				} else if (line[root].endsWith("e")) {
					System.out.println(String.format("%sy%s",
							line[root].substring(0, line[root].length() - 1),
							line[suffix].substring(1)));
				} else {
					System.out.println(String.format("%sw%s",
							line[root].substring(0, line[root].length() - 1),
							line[suffix].substring(1)));
				}
			} else if (line[suffix].startsWith("i")) {
				System.out.println(line[root] + line[suffix]);
			} else if (line[suffix].startsWith("e")) {
				if (line[root].endsWith("a")) {
					System.out.println(String.format("%s%s", line[root],
							line[suffix].substring(1)));
				} else if (line[root].endsWith("e")) {
					System.out.println(String.format("%si%s", line[root],
							line[suffix].substring(1)));
				} else if (line[root].endsWith("o")) {
					System.out.println(String.format("%su%s", line[root],
							line[suffix].substring(1)));
				}
			}

		}
	}

}
