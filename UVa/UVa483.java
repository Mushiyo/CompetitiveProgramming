/* Filename: UVa483.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa483 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String seq = input.nextLine();
			StringBuilder word = new StringBuilder();
			StringBuilder output = new StringBuilder();
			
			for(int i = 0; i < seq.length(); ++i){
				if(seq.charAt(i) != ' '){
					word.append(seq.charAt(i));
				}
				else{
					output.append(word.reverse());
					output.append(seq.charAt(i));
					word = new StringBuilder();
				}
			}
			output.append(word.reverse());
			
			System.out.println(output);
		}
	}

}
