package NPSC;

import java.util.Scanner;

public class d594 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N > 0){
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.println((a + b) * 2);
			--N;
		}
	}

}
