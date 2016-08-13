/* Filename: AGC002A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class AGC002A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a > 0){
				System.out.println("Positive");
			} else if (b < 0){
				if((b - a + 1) % 2 == 0){
					System.out.println("Positive");
				} else {
					System.out.println("Negative");
				}
			} else {
				System.out.println("Zero");
			}
		}
	}
}
