import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class u1152 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int MAX_SIZE = 4000;
		int[] A = new int[MAX_SIZE];
		int[] B = new int[MAX_SIZE];
		int[] C = new int[MAX_SIZE];
		int[] D = new int[MAX_SIZE];
		Map<Integer, Integer> cPlusDRec = new HashMap<Integer, Integer>();
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			for(int caseNum = 1; caseNum <= n; ++caseNum){
				int size = input.nextInt();
				
				for(int i = 0; i < size; ++i){
					A[i] = input.nextInt();
					B[i] = input.nextInt();
					C[i] = input.nextInt();
					D[i] = input.nextInt();
				}
				
				cPlusDRec.clear();
				for(int i = 0; i < size; ++i){
					for(int j = 0 ; j < size; ++j){
						if(cPlusDRec.containsKey(-(C[i] + D[j]))){
							int count = cPlusDRec.get(-(C[i] + D[j]));
							++count;
							cPlusDRec.put(-(C[i] + D[j]), count);
						}
						else{
							cPlusDRec.put(-(C[i] + D[j]), 1);
						}
					}
				}
				
				int countSum = 0;
				for(int i = 0; i < size; ++i){
					for(int j = 0 ; j < size; ++j){
						if(cPlusDRec.containsKey(A[i] + B[j])){
							countSum += cPlusDRec.get(A[i] + B[j]);
						}
					}
				}
				
				System.out.println(countSum);
				if(caseNum < n){
					System.out.println();
				}
				
			}
		}
	}

}
