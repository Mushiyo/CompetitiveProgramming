package UVa;

import java.util.Scanner;

public class d117 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String word = input.next();
			int value = 0;
			
			for(int i = 0; i < word.length(); ++i){
				if(Character.isLowerCase(word.charAt(i))){
					value += word.charAt(i) - 'a' + 1;
				}
				else{
					value += word.charAt(i) - 'A' + 27;
				}
			}
			
			if(isPrime(value)){
				System.out.println("It is a prime word.");
			}
			else{
				System.out.println("It is not a prime word.");
			}
		}
	}
	
	public static boolean isPrime(int val){
		for(int i = 2; i <= Math.sqrt(val); ++i){
			if(val % i == 0){
				return false;
			}
		}
		
		return true;
	}

}
