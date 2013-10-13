package BASIC;

import java.util.Scanner;

public class a022 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String inString = input.nextLine();
			
			if(isPalindrom(inString)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}
	
	public static boolean isPalindrom(String inString){
		StringBuilder reverseBuilder = new StringBuilder(inString).reverse();
		String reverseInString = reverseBuilder.toString();
		
		return inString.equals(reverseInString);		
	}

}
