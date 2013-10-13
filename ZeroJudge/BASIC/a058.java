package BASIC;

import java.util.Scanner;

public class a058 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] countRemainder = {0, 0, 0};
		int totalNum = input.nextInt();
		
		while(totalNum > 0){
			int number = input.nextInt();			
			++countRemainder[number % 3];
			--totalNum;
		}
		
		System.out.println(countRemainder[0] + " " + countRemainder[1] + " " + countRemainder[2]);
		
	}

}
