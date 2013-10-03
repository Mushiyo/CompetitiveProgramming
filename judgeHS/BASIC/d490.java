package BASIC;

import java.util.Scanner;

public class d490 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			long a = input.nextInt();
			long b = input.nextInt();
			
			if(a % 2 == 1){
				++a;
			}
			
			if(b % 2 == 1){
				--b;
			}
						
			long sum = ((a + b) * ((b - a) / 2 + 1) ) / 2;
			
			System.out.println(sum);
		}
	}

}
