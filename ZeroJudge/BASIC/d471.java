package BASIC;

import java.util.Scanner;

public class d471 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int bit = input.nextInt();
			
			for(int i = 0; i < Math.pow(2, bit); ++i){
				printZero(bit - Integer.toBinaryString(i).length());
				System.out.println(Integer.toBinaryString(i));
			}
		}
	}
	
	public static void printZero(int numOfZero){
		for(int i = 1; i <= numOfZero; ++i){
			System.out.print(0);
		}		
	}

}
