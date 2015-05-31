/* Filename: Timus1209.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Timus1209 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			for(int i = 0; i < N; ++i){
				if(i > 0){
					System.out.print(" ");
				}
				
				long k = input.nextLong();
				double root = (1 + Math.sqrt(1 - 4 * 1 * (-2) * (k - 1))) / 2;
				
				if(isInteger(root)){
					System.out.print(1);
				} else{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

	private static boolean isInteger(double n){
		return Math.ceil(n) == Math.floor(n);
	}
}
