/* Filename: ABC045B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC045B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String[] S = new String[3];
			
			for(int i = 0; i < S.length; ++i){
				S[i] = input.next();
			}
			
			int[] head = new int[3];
			int turn = 0;
			
			while(head[turn] < S[turn].length()){
				int next = S[turn].charAt(head[turn]) - 'a';
				++head[turn];
				turn = next;
			}
			
			System.out.println((char)(turn + 'A'));
		}
	}

}
