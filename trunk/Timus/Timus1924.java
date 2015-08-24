/* Filename: Timus1924.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1924 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			boolean hasEvenOddNum = ((n + 1) / 2) % 2 == 0 ? true : false;
			
			if(hasEvenOddNum){
				System.out.println("black");
			} else {
				System.out.println("grimy");
			}
		}
	}

}
