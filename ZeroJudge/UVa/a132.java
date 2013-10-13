package UVa;

import java.util.Scanner;

public class a132 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int I = input.nextInt();
		while(I != 0){
			System.out.print("The parity of " + Integer.toBinaryString(I) + " is ");
			System.out.println(Integer.bitCount(I) + " (mod 2).");
			
			I = input.nextInt();
		}
	}

}
