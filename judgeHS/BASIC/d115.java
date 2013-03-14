package BASIC;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class d115 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			if(n == 0){
				break;
			}
			
			Integer[] A = new Integer[n];
			for(int i = 0; i < A.length; ++i){
				A[i] = input.nextInt();
			}
			
			//Arrays.sort(A, Collections.reverseOrder());
			Arrays.sort(A);
			
			int m = input.nextInt();
			
			for(int i = 0; i <= (int)Math.pow(2, A.length); ++i){
				String bitI = Integer.toString(i, 2);
				//String bitI = new StringBuilder(Integer.toString(i, 2)).reverse().toString();
				
				if(Integer.bitCount(i) == m){
					System.out.println(bitI);
					int outputNum = 0;
					for(int j = 0; j < bitI.length(); ++j){
						if(bitI.charAt(j) == '1'){
							if(outputNum < m - 1){
								System.out.print(A[j] + " ");
							}
							else{
								System.out.print(A[j]);
							}
							
							++outputNum;
						}
					}
					
					System.out.println();
				}
			}
			
			System.out.println();
		}
	}

}
