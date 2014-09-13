/* Filename: UVa12626.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12626 {
	final static int M_INDEX = 'M' - 'A';
	final static int A_INDEX = 'A' - 'A';
	final static int R_INDEX = 'R' - 'A';
	final static int G_INDEX = 'G' - 'A';
	final static int I_INDEX = 'I' - 'A';
	final static int T_INDEX = 'T' - 'A';

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				String ingredients = input.next().replaceAll("[^MARGARITA]", "");
				int[] count = new int[26];
				
				for(int i = 0; i < ingredients.length(); ++i){
					++count[ingredients.charAt(i) - 'A'];
				}
				
				// in the word "MARGARITA", we have 3 'A' and 2 'R'
				count[A_INDEX] /= 3;
				count[R_INDEX] /= 2;
				
				int pizzaMade = Math.min(Math.min(Math.min(Math.min(Math.min(count[M_INDEX], count[A_INDEX]), count[R_INDEX]), count[G_INDEX]) , count[I_INDEX]), count[T_INDEX]);
				
				System.out.println(pizzaMade);
				
				--N;
			}
		}
	}

}
