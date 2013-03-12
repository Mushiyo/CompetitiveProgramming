package BASIC;

import java.util.Scanner;

public class d124 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String num = input.nextLine();
			
			if(isThreeMultiple(num)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}

	public static boolean isThreeMultiple(String num){
		if(num.startsWith("-")){
			num = num.substring(1);
		}			
		
		int sumOfDigits = 0;
		
		for(int i = 0; i < num.length(); ++i){
			sumOfDigits += Character.getNumericValue(num.charAt(i));
		}
		
		if(sumOfDigits % 3 != 0){
			return false;
		}
		else{
			return true;
		}
	}
}
