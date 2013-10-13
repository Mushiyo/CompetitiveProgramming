package UVa;

import java.util.Scanner;

public class d379 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N > 0){
			int num1 = Integer.parseInt(input.next(), 16);
			String operator = input.next();
			int num2 = Integer.parseInt(input.next(), 16);
			
			int result = 0;
			if(operator.equals("+")){
				result = num1 + num2;
				
			}
			else{
				result = num1 - num2;
			}
			
			System.out.print(toBinWith0(num1) + " " + operator);
			System.out.println(" " + toBinWith0(num2) + " = " + result);
			
			--N;
		}
	}
	
	public static String toBinWith0(int num){
		String binNo0 = Integer.toBinaryString(num);
		StringBuilder withLeading0 = new StringBuilder();
		
		for(int i = 0; i + binNo0.length() < 13; ++i){
			withLeading0.append(0);
		}
		
		return withLeading0.append(binNo0).toString();
	}

}
