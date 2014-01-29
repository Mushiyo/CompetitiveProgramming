/* Filename: UVa10474.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10474 {

	public static void main(String[] args) {
		final int MAX_N = 10000 + 1;
		int[] marble = new int[MAX_N];
		int caseNum = 1;
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			int N = input.nextInt();
			int Q = input.nextInt();
			
			if(N == 0 && Q == 0){
				break;
			}
			
			for(int i = 1; i <= N; ++i){
				marble[i] = input.nextInt();
			}
			
			Arrays.sort(marble, 1, N + 1);
			
			output.append(String.format("CASE# %d:\n", caseNum));
			for(int i = 0; i < Q; ++i){
				int queryMarble = input.nextInt();
				int index = upperBound(marble, 1, N + 1, queryMarble);
				
				if(index < 0){
					output.append(queryMarble + " not found\n");
				}
				else{
					output.append(queryMarble + " found at " + index + "\n");
				}
			}
			
			++caseNum;
		}
		
		System.out.print(output);
	}

	public static int upperBound(int[] a, int fromIndex, int toIndex, int key){
		int index = Arrays.binarySearch( a, fromIndex, toIndex, key);
		
		if(index < 0){
			return index;
		}
		
		while(index > 0 && a[index] == a[index - 1]){
			--index;
		}
		
		return index;
	}
}
