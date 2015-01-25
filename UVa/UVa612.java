/* Filename: UVa612.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa612 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int M = input.nextInt();
			boolean isFirstOutput = true;
			
			while (M > 0){
				int n = input.nextInt();
				int m = input.nextInt();
				
				DNA[] sequences = new DNA[m];
				for(int i = 0; i < sequences.length; ++i){
					sequences[i] = new DNA(input.next());
				}
				
				Arrays.sort(sequences);
				
				if(isFirstOutput){
					isFirstOutput = false;
				} else {
					System.out.println();
				}
				
				for(int i = 0; i < sequences.length; ++i){
					System.out.println(sequences[i].sequence);
				}
				
				--M;
			}
		}
	}
	
	private static class DNA implements Comparable<DNA>{
		String sequence;
		int inversion;
		
		DNA(String seq){
			sequence = seq;
			
			inversion = 0;
			for(int i = 0; i < sequence.length(); ++i){
				for(int j = i + 1; j < sequence.length(); ++j){
					if(sequence.charAt(i) > sequence.charAt(j)){
						++inversion;
					}
				}
			}
		}
		
		@Override
		public int compareTo(DNA o) {
			return this.inversion - o.inversion;
		}
		
	}
}
