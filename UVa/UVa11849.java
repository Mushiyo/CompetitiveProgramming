//TLE

/* Filename: UVa11849.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UVa11849 {

	public static void main(String[] args) {
		Set<Integer> jack = new HashSet<Integer>();
		Set<Integer> jill = new HashSet<Integer>();
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			int N = input.nextInt();
			int M = input.nextInt();
			
			if(N == 0 && M == 0){
				break;
			}
			
			jack.clear();
			jill.clear();
			
			while(N > 0){
				jack.add(input.nextInt());
				
				--N;
			}
			
			while(M > 0){
				jill.add(input.nextInt());
				
				--M;
			}
			
			jack.retainAll(jill);
			output.append(jack.size() + "\n");
		}
		
		System.out.print(output);
	}

}
