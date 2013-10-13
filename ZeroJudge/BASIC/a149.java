package BASIC;

import java.util.Scanner;

public class a149 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		while(T > 0){
			String numStr = input.next();
			int product = 1;
			
			for(int i = 0; i < numStr.length(); ++i){
				product *= Character.digit(numStr.charAt(i), 10);
			}
			System.out.println(product);
			
			--T;
		}
	}

}
