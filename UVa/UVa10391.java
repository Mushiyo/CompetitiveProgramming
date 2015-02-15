/* Filename: UVa10391.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class UVa10391 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<String> dictionary = new HashSet<String>();
		List<String> words = new ArrayList<String>();

		while (input.hasNext()) {
			String word = input.next();
			words.add(word);
			dictionary.add(word);
		}

		for (int i = 0; i < words.size(); ++i) {
			String word = words.get(i);
			for (int j = 1; j < word.length(); ++j) {
				if (dictionary.contains(word.substring(0, j))
						&& dictionary.contains(word.substring(j))) {
					System.out.println(word);
					break;
				}
			}
		}
	}

}
