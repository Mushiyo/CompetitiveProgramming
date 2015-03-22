/* Filename: Timus2001.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus2001 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[4];
		int[] b = new int[4];

		while (input.hasNext()) {
			for(int i = 1; i < a.length; ++i){
				a[i] = input.nextInt();
				b[i] = input.nextInt();
			}
			
			System.out.printf("%d %d\n", a[1] - a[3], b[1] - b[2]);
		}
	}

}
