/* Filename: UVa10945.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10945 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String sentence = input.nextLine();
			
			if(sentence.equals("DONE")){
				break;
			}
			
			if(isPalindrome(sentence)){
				System.out.println("You won't be eaten!");
			}
			else{
				System.out.println("Uh oh..");
			}
		}
	}

	public static boolean isPalindrome(String s){
		s = s.replaceAll("\\W", "").toLowerCase();
		
		for(int i = 0, j = s.length() - 1; i < j; ++i, --j){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		
		return true;
	}
}
