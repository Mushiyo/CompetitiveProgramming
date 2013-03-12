package BASIC;

import java.util.Scanner;

public class a020 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] correspondNum = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20,
				21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 33 };
		
		while(input.hasNext()){
			String ID = input.next();
			char initialChar = ID.charAt(0);
			int[] IDNum = new int[9];
			
			for(int i = 0; i < IDNum.length; ++i){
				IDNum[i] = Character.getNumericValue(ID.charAt(i + 1));
			}
			
			int checkCode = (correspondNum[initialChar - 'A'] / 10) + (correspondNum[initialChar - 'A'] % 10) * 9;
			for(int i = 0; i < IDNum.length - 1; ++i){
				checkCode += IDNum[i] * (8 - i);
			}
			checkCode += IDNum[IDNum.length - 1];
			
			if(checkCode % 10 != 0){
				System.out.println("fake");
			}
			else{
				System.out.println("real");
			}
		}

	}

}
