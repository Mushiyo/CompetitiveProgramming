/* Filename: UVa10260.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10260 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String word = input.next();
			
			
			word = word.replaceAll("[BFPV]", "1");
			word = word.replaceAll("[CGJKQSXZ]", "2");
			word = word.replaceAll("[DT]", "3");
			word = word.replaceAll("[L]", "4");
			word = word.replaceAll("[MN]", "5");
			word = word.replaceAll("[R]", "6");
			
			for(int i = 1; i <= 6; ++i){
				String regex = String.format("%d+", i);
				word = word.replaceAll(regex, Integer.toString(i));
			}
			
			word = word.replaceAll("[AEIOUHWY]", "");
			
			System.out.println(word);
		}
	}

}
