/* Filename: a647.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;

public class a647 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			while(n > 0){
				int m = input.nextInt();
				int p = input.nextInt();
				double rate = (p - m) * 100.0 / m;
				
				if(rate >= 10.0 || rate <= -7.0){
					System.out.printf("%.2f%% dispose\n", rate);
				} else {
					System.out.printf("%.2f%% keep\n", rate);
				}
				
				
				--n;
			}
		}
	}

}
