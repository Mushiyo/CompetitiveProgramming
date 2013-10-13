package NPSC;

import java.util.Scanner;

public class d588 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		while(T > 0){
			int N = input.nextInt();
			int maxHeight = 0;
			
			while(N > 0){
				input.nextInt();
				input.nextInt();
				int h1 = input.nextInt();				
				input.nextInt();
				input.nextInt();
				int h2 = input.nextInt();
				
				if(maxHeight < h1){
					maxHeight = h1;
				}
				
				if(maxHeight < h2){
					maxHeight = h2;
				}
				
				--N;
			}
			
			System.out.println(maxHeight);
			
			--T;
		}
	}

}
