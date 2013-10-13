package BASIC;

import java.util.Scanner;

public class d059 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println((int)Math.pow(input.nextInt(), input.nextInt()));
		System.out.printf("%.3f\n",Math.sqrt(input.nextInt()));
		System.out.println(Math.abs(input.nextInt()));
		int a4 = input.nextInt();
		int b4 = input.nextInt();
		System.out.println((int)(Math.random() * (b4 - a4) + a4));
	}

}
