package BASIC;
import java.util.Scanner;

public class a417 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			
			while(T > 0){
				int N = input.nextInt();
				int M = input.nextInt();
				
				// special case
				if(N == 1){
					System.out.println("     1");
					
					--T;
					continue;
				}
				
				int[][] spiralArray = new int[N][N];
				int totalNum = N * N;
				
				// clockwise
				if(M == 1){
					int i = 1;
					int round = 1;
					while(i <= totalNum){
						
					}
				}
				
				--T;
			}
		}
	}

}
