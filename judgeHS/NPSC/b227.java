package NPSC;

import java.util.Scanner;

public class b227 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int setOfTest = input.nextInt();
			
			while(setOfTest > 0){
				int n = input.nextInt();
				int p = input.nextInt();
				
				int paySmile = (int) Math.ceil((n / 2) * p * 0.6 + (n / 2 + n % 2) * p);
				int payLion = (int) Math.ceil(n * p * 0.812);
				
				if(paySmile < payLion){
					System.out.println(": )");
				}
				else if(payLion < paySmile){
					System.out.println("8-12=-4");
				}
				else{
					System.out.println("SAME");
				}
				
				--setOfTest;
			}
		}
	}

}
