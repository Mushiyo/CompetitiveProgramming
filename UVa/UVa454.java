/* Filename: UVa454.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVa454 {

	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		String[] phases = new String[MAX_SIZE];
		int[][] countChar = new int[MAX_SIZE][128];

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int numOfCase = input.nextInt();
			input.nextLine(); // eat change line
			input.nextLine(); // eat blank line

			while (numOfCase > 0) {
				int N = 0;
				while (input.hasNextLine()) {
					String phase = input.nextLine();

					if (phase.equals("")) {
						break;
					}

					phases[N++] = phase;
				}

				Arrays.sort(phases, 0, N);
				
				for(int i = 0; i < N; ++i){
					Arrays.fill(countChar[i], 0);
					
					String phaseI = phases[i];
					for(int j = 0; j < phaseI.length(); ++j){
						if(phaseI.charAt(j) != ' '){
							++countChar[i][phaseI.charAt(j)];
						}
					}					
				}
				
				for(int i = 0; i < N; ++i){
					for(int j = i + 1; j < N; ++j){
						if(Arrays.equals(countChar[i], countChar[j])){
							System.out.println(phases[i] + " = " + phases[j]);
						}
					}
				}
				
				if(numOfCase > 1){
					System.out.println();
				}

				--numOfCase;
			}
		}
	}

}
