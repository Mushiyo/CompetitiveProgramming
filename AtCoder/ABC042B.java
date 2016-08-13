/* Filename: ABC042B.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class ABC042B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int L = input.nextInt();
			String[] S = new String[N];
			
			for(int i = 0; i < S.length; ++i){
				S[i] = input.next();
			}
			
			Arrays.sort(S);
			
			StringBuilder sol = new StringBuilder();
			for(int i = 0; i < S.length; ++i){
				sol.append(S[i]);
			}
			
			System.out.println(sol);
		}
	}

}
