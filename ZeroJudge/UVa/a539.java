/* Filename: a539.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class a539 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] element = new int[1000];

		while (input.hasNext()) {
			int N = input.nextInt();
			
			for(int i = 0; i < N; ++i){
				element[i] = input.nextInt();
			}
			
			int countInversion = 0;
			for(int i = 0; i < N; ++i){
				for(int j = i + 1; j < N; ++j){
					if(element[i] > element[j]){
						++countInversion;
					}
				}
			}
			
			System.out.println("Minimum exchange operations : " + countInversion);
		}
	}
}
