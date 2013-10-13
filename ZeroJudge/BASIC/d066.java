package BASIC;

import java.util.Scanner;

public class d066 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hh = input.nextInt();
		int mm = input.nextInt();
		
		if(hh >= 7 && hh < 17){
			if(hh == 7 && mm < 30){
				System.out.println("Off School");
			}
			else{
				System.out.println("At School");
			}
		}
		else{
			System.out.println("Off School");
		}
	}

}
