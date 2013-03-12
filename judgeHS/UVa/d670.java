package UVa;

import java.util.Scanner;

public class d670 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] charVal = new int[26];
		int assignVal = 6;
		for(int i = 0; i < charVal.length; ++i){
			if((char)(i + 'A') == 'P'){
				charVal[i] = 7;
				continue;
			}
			
			if((char)(i + 'A') == 'W'){
				charVal[i] = 9;
				continue;
			}
			charVal[i] = assignVal / 3;
			++assignVal;
		}
		
		while(input.hasNext()){
			String phoneNum = input.nextLine();
			
			for(int i = 0; i < phoneNum.length(); ++i){
				if(Character.isLetter(phoneNum.charAt(i))){
					System.out.print(charVal[phoneNum.charAt(i) - 'A']);
				}
				else{
					System.out.print(phoneNum.charAt(i));
				}
			}
			
			System.out.println();
		}
	}

}
