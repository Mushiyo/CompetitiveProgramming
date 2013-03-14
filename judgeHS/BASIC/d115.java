package BASIC;
import java.util.Scanner;
import java.util.Arrays;

public class d115 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			if(n == 0){
				break;
			}
			
			int[] A = new int[n];
			for(int i = 0; i < A.length; ++i){
				A[i] = input.nextInt();
			}
			
			Arrays.sort(A);
			
			int m = input.nextInt();
			
			for(int i = (int)Math.pow(2, n) - 1; i > 0; --i){
				String bitI = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
				
				if(Integer.bitCount(i) == m){
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
