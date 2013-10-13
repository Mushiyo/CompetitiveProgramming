package CONTEST;

import java.util.Scanner;

public class d535 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String s = input.nextLine();
			
			if(isCipheredText(s)){
				System.out.println(decipher(s));
			}
			else{
				System.out.println("INCORRECT");
			}
			
		}
	}
	
	public static boolean isPalindrome(String s){
		for(int i = 0, j = s.length() - 1; i < s.length() / 2; ++i, --j){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		
		return true;
	}

	public static boolean isCipheredText(String s){
		if((s.length() < 10) || (s.length() > 30)){
			return false;
		}
		
		for(int i = 0; i < s.length(); ++i){
			if((s.charAt(i) - '0' < 0) || (s.charAt(i) - '0' > 9)){
				return false;
			}
		}
		
		if(!isPalindrome(s)){
			return false;
		}
		
		for(int i = 1; i < s.length(); ++i){
			int prevNum = s.charAt(i - 1) - '0';
			int currentNum = s.charAt(i) - '0';
			
			if(currentNum > prevNum * 2){
				return false;
			}
		}
		
		return true;
	}
	
	public static String decipher(String cipher){
		StringBuilder plaintext = new StringBuilder();
		
		for(int i = 0; i < cipher.length(); ++i){
			int num = cipher.charAt(i) - '0';
			if((num % 2) == 0){
				plaintext.append(num);
			}
		}
		
		if(plaintext.length() == 0){
			return "0";
		}
		
		return plaintext.toString();
	}
}
