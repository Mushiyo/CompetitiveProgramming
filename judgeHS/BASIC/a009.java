package BASIC;

import java.util.Scanner;
public class a009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String s = input.nextLine();
			
			for(int i = 0; i < s.length(); ++i){
				System.out.printf("%c", s.charAt(i) - 7);
			}
			System.out.println();
		}

	}

}
