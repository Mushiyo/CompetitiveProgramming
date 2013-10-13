package BASIC;

import java.util.Scanner;

public class a065 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String cipher = input.nextLine();
			
			for(int i = 1; i < cipher.length(); ++i){
				System.out.print(Math.abs(cipher.charAt(i) - cipher.charAt(i- 1)));
			}
			System.out.println();
		}
	}

}
