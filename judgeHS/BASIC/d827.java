package BASIC;

import java.util.Scanner;

public class d827 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int people = input.nextInt();
			int dozen = people / 12;
			int remain = people % 12;
			
			System.out.println(dozen * 50 + remain * 5);
		}
	}

}
