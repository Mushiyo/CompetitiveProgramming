/* Filename: a845.java
 * Author: Mushiyo
 */
package ORIGINAL;

import java.util.Scanner;

public class a845 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] drinkPrice = new int[N];
			
			for(int i = 0; i < drinkPrice.length; ++i){
				drinkPrice[i] = input.nextInt();
			}
			
			int T = input.nextInt();
			while(T > 0){
				int x = input.nextInt();
				int y = input.nextInt();
				
				int R = drinkPrice[x] + drinkPrice[y];
				
				System.out.println(R);
				--T;
			}
		}
	}

}
