/* Filename: UVa10530.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10530 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int low = 0;
		int high = 11;

		while (true) {
			int guess = input.nextInt();

			if (guess == 0) {
				break;
			}

			input.nextLine(); // eat change line
			String response = input.nextLine();

			if (response.equals("right on")) {
				if(low < guess && guess < high){
					System.out.println("Stan may be honest");
				}
				else{
					System.out.println("Stan is dishonest");
				}
				
				// reset value
				low = 0;
				high = 11;
			} else {
				if (response.equals("too high")) {
					high = Math.min(high, guess);
				}

				if (response.equals("too low")) {
					low = Math.max(low, guess);
				}
			}
		}
	}
}
