package BASIC;

import java.util.Scanner;

public class d051 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int Fahrenheit = input.nextInt();
			double Celsius = (5.0 / 9) * (Fahrenheit - 32);
			
			System.out.printf("%.3f\n",Celsius);
		}
	}

}
