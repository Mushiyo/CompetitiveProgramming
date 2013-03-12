package UVa;

import java.util.Scanner;

public class d111 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}
			
			double sqrtN = Math.sqrt(n);
			
			if(Math.floor(sqrtN) == Math.ceil(sqrtN)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}

}
