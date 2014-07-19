/* Filename: a781.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a781 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int BOUND = 8;
		final String[] BLACK = { "", "#", "##", "###", "####", "#####",
				"######", "#######", "########", "#########" };
		final String[] WHITE = { "", ".", "..", "...", "....", ".....",
				"......", ".......", "........", "........." };
		boolean firstBoard = true;

		while (input.hasNext()) {
			int size = input.nextInt();

			if (size == 0) {
				break;
			}
			
			if(firstBoard){
				firstBoard = false;
			}
			else{
				System.out.println();
			}

			for (int row = 0; row < BOUND; ++row) {
				for (int i = 0; i < size; ++i) {
					for (int col = 0; col < BOUND; ++col) {
						if ((row + col) % 2 == 0) {
							System.out.print(BLACK[size]);
						}
						else{
							System.out.print(WHITE[size]);
						}
					}
					System.out.println();
				}
			}
		}
	}

}
