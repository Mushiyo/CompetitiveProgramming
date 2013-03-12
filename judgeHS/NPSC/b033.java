package NPSC;

import java.util.Scanner;

public class b033 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int M = input.nextInt();
			int N = input.nextInt();
			int P = input.nextInt();
			int R = input.nextInt();
			
			int precision = (int) Math.pow(10, P);
			
			if(M == 0 && N == 0 && P == 0 && R == 0){
				break;
			}
			
			boolean mFirst = true;
			boolean draw = (M == N);
			if(N == Math.min(M, N)){
				mFirst = false;
			}
			
			while(R > 0){
				if(draw){
					M *= M;
					N *= N;
				}
				else{
					if(mFirst){
						M *= N;
					}
					else{
						N *= M;						
					}
				}
				
				mFirst = !mFirst;
				M %= precision;
				N %= precision;
				
				--R;
			}
			
			if(draw){
				System.out.println("Draw with " + (int)(M % Math.pow(10, P)) + ".");
				continue;
			}
			else if(mFirst){
				System.out.println("The ghost of childish won the game with " + (int)(N % Math.pow(10, P)) + ".");
			}
			else{
				System.out.println("The king of childish won the game with " + (int)(M % Math.pow(10, P)) + ".");
			}
			
		}
			
	}

}
