package UVa;

import java.util.Scanner;
import java.math.BigInteger;

public class d056 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			while(N > 0){
				int M = input.nextInt();
				int[] num1 = new int[M + 1];
				int[] num2 = new int[M + 1];
				
				for(int i = M - 1 ; i >= 0; --i){
					num1[i] = input.nextInt();
					num2[i] = input.nextInt();
				}
				
				int[] sum = new int[M + 1];
				int carry = 0;
				
				for(int i = 0; i < sum.length; ++i){
					if(i < M + 1){
					sum[i] = (carry + num1[i] + num2[i]) % 10;
					carry = (carry + num1[i] + num2[i]) / 10;
					}
					else{
						sum[i] = carry;
					}
				}
				
				int startIndex = M;
				if(sum[M] == 0){
					startIndex = M - 1;
				}
				
				
				for(int i = startIndex; i >= 0; --i){
					System.out.print(sum[i]);
				}
				System.out.println();
				
				if(N > 1){
					System.out.println();
				}
				
				--N;
			}
		}
	}

}
