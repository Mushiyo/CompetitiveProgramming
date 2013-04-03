package BASIC;

import java.util.Scanner;
import java.util.ArrayList;

public class a040 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			ArrayList<Integer> armstrongNumbers = new ArrayList<Integer>();
			
			for(int i = n; i < m; ++i){
				if(isArmstrongNumber(i)){
					armstrongNumbers.add(i);
				}
			}
			
			if(armstrongNumbers.isEmpty()){
				System.out.println("none");
			}
			else{
				for(int i = 0; i < armstrongNumbers.size(); ++i){
					if(i != armstrongNumbers.size() - 1){
						System.out.print(armstrongNumbers.get(i) + " ");
					}
					else{
						System.out.println(armstrongNumbers.get(i));
					}
				}
			}
		}
	}
	
	public static boolean isArmstrongNumber(int num){
		String numStr = String.valueOf(num);
		
		int sumOfDigits = 0;
		for(int i = 0; i < numStr.length(); ++i){
			sumOfDigits += Math.pow(numStr.charAt(i) - '0', numStr.length());
		}
		
		if(sumOfDigits == num){
			return true;
		}
		
		return false;
	}
}
