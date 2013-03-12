package BASIC;

import java.util.Scanner;

public class d559 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int classNum = input.nextInt();
			
			System.out.println("'C' can use printf(\"%d\",n); to show integer like " + classNum);
		}
	}

}
