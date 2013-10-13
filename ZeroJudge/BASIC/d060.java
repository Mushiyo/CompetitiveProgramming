package BASIC;

import java.util.Scanner;

public class d060 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int currentMinutes = input.nextInt();
			int waitingMinutes = (60 + 25 - currentMinutes) % 60;
			
			System.out.println(waitingMinutes);
		}
	}

}
