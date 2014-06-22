/* Filename: a779.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a779 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.nextLine();
			
			System.out.println(s);
			if(isPalindrome(s)){
				System.out.println("-- is a palindrome");
			}
			else{
				System.out.println("-- is not a palindrome");
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
