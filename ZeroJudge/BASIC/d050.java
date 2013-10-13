package BASIC;

import java.util.Scanner;

public class d050 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int TaiwanTime = input.nextInt();
			int AmericanTime = (TaiwanTime + 9) % 24;
			
			System.out.println(AmericanTime);
		}
	}

}
