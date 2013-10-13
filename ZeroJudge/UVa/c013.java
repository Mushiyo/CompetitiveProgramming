package UVa;

import java.util.Scanner;

public class c013 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while(n > 0){
			int A = input.nextInt();
			int F = input.nextInt();
			
			while(F > 0){
				for(int i = 1; i <= A; ++i){
					for(int j = 1; j <= i; ++j){
						System.out.print(i);
					}
					System.out.println();
				}
				for(int i = A - 1; i > 0; --i){
					for(int j = i; j > 0; --j){
						System.out.print(i);
					}
					System.out.println();
				}
				
				
				System.out.println();
				--F;
			}
			
			--n;
		}
		
	}

}
