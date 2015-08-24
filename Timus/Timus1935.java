/* Filename: Timus1935.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1935 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int sheetNeeded = 0;
			int maxA = 0;
			
			for(int i = 0; i < n; ++i){
				int a = input.nextInt();
				sheetNeeded += a;
				maxA = Math.max(maxA, a);
			}
			
			sheetNeeded += maxA;

			System.out.println(sheetNeeded);
		}
	}

}
