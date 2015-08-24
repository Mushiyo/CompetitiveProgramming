/* Filename: Timus2023.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus2023 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int currentPos = 1;
			int step = 0;
			
			while(n > 0){
				String name = input.next();
				step += Math.abs(caseID(name.charAt(0)) - currentPos);
				currentPos = caseID(name.charAt(0));
				
				--n;
			}
			
			System.out.println(step);
		}
	}

	static int caseID(char initialChar) {
		switch (initialChar) {
		case 'A':
		case 'P':
		case 'O':
		case 'R':
			return 1;
		case 'B':
		case 'M':
		case 'S':
			return 2;
		case 'D':
		case 'G':
		case 'J':
		case 'K':
		case 'T':
		case 'W':
			return 3;
		}

		return 0;
	}
}
