package UVa;

import java.util.Scanner;

public class d281 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		
		while(n != -1){
			//the surface area of a sphere is 4πr^2
			//each part of the divided sphere will increase the surface area by πr^2
			//, which is the area of the two hemicycle on each divided part. 
			//so the profit is ((n * πr^2) / 4πr^2) * 100%, n ≧ 2
			//after simplified the equation, we got n * 25 %, n ≧ 2
			//NOTE that when n = 1, the profit is 0%
			
			if(n > 1){
				System.out.println(n * 25 + "%");
			}
			else{
				System.out.println("0%");
			}
			
			n = input.nextLong();
		}
	}

}
