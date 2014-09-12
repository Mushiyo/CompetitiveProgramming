/* Filename: UVa11233.java
 * Author: Mushiyo
 */

import java.security.Signature;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class UVa11233 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int L = input.nextInt();
			int N = input.nextInt();
			Map<String, String> irregularWord = new HashMap<String, String>(L);

			while (L > 0) {
				irregularWord.put(input.next(), input.next());

				--L;
			}

			while (N > 0) {
				String singular = input.next();

				if (irregularWord.containsKey(singular)) {
					System.out.println(irregularWord.get(singular));
				} else if (singular.endsWith("y")
						&& singular.matches("\\w*[aeiou]y") == false) {
					System.out.println(singular.substring(0,
							singular.length() - 1) + "ies");
				} else if (singular.endsWith("o") || singular.endsWith("s")
						|| singular.endsWith("x") || singular.endsWith("ch")
						|| singular.endsWith("sh")) {
					System.out.println(singular + "es");
				} else {
					System.out.println(singular + "s");
				}

				--N;
			}

		}
	}

}
