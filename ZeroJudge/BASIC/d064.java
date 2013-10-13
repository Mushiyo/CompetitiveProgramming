package BASIC;

import java.util.Scanner;

public class d064 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if(number % 2 != 0){
			System.out.println("Odd");
		}
		else{
			System.out.println("Even");
		}
	}

}
