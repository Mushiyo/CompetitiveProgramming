package UVa;

import java.util.Scanner;

public class a518 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a == -1 && b == -1){
				break;
			}
			
			int distAB = Math.abs(b - a);
			
			System.out.println(Math.min(distAB, 100 - distAB));
		}
	}

}
