/* Filename: Timus2012.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus2012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int f = input.nextInt();
			if((12 - f) * 45 <= 240){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
