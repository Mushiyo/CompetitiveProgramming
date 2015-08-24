/* Filename: Timus1991.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1991 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int k = input.nextInt();
			int unusedBoomBoom = 0;
			int survivedDroid = n * k;
			
			while(n > 0){
				int a = input.nextInt();
				int usedBoomBoom = a >= k ? k : a;
				unusedBoomBoom += a - usedBoomBoom;
				survivedDroid -= usedBoomBoom;
				
				--n;
			}
			
			System.out.printf("%d %d\n", unusedBoomBoom, survivedDroid);
		}
	}

}
