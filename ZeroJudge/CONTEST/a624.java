/* Filename: a624.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a624 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String password = input.nextLine();

			boolean lenGT8 = false, hasLower = false, hasUpper = false, hasNumOrSymbol = false;

			if (password.length() >= 8) {
				lenGT8 = true;
			}

			for (int i = 0; i < password.length(); ++i) {
				if (Character.isLowerCase(password.charAt(i))) {
					hasLower = true;
				} else if (Character.isUpperCase(password.charAt(i))) {
					hasUpper = true;
				}
				else{
					hasNumOrSymbol = true;
				}
			}
			
			boolean hasLowerAndUpper = hasLower && hasUpper;
			boolean hasLetterAndNumOrSymbol = (hasLower || hasUpper) && hasNumOrSymbol;
			
			System.out.print("This password is ");
			if(!lenGT8 && !hasLowerAndUpper && !hasLetterAndNumOrSymbol){
				System.out.println("WEAK");
			}
			else if(lenGT8 && hasLowerAndUpper && hasLetterAndNumOrSymbol){
				System.out.println("STRONG");
			}
			else if((lenGT8 && hasLowerAndUpper) || (lenGT8 && hasLetterAndNumOrSymbol) || (hasLowerAndUpper && hasLetterAndNumOrSymbol)){
				System.out.println("GOOD");
			}
			else{
				System.out.println("ACCEPTABLE");
			}
		}
	}
}
