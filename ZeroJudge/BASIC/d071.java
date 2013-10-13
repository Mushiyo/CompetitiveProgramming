package BASIC;

import java.util.Scanner;

public class d071 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int y = input.nextInt();
			
			if((y % 4 == 0) && ((y % 100 != 0) || (y % 400 == 0))){
				System.out.println("a leap year");
			}
			else{
				System.out.println("a normal year");
			}
		}
	}

}
