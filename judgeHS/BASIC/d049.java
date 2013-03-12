package BASIC;

import java.util.Scanner;

public class d049 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int westernYear = input.nextInt();
			
			System.out.println(westernYear - 1911);
		}
	}

}
