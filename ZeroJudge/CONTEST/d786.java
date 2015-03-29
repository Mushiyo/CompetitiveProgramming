/* Filename: d786.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class d786 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int totalCase = input.nextInt();
			
			while(totalCase > 0){
				int n = input.nextInt();
				
				int sum = 0;
				for(int i = 0; i < n; ++i){
					sum += input.nextInt();
				}
				
				System.out.printf("%.2f\n", sum / (double)n);
				
				--totalCase;
			}
		}
	}

}
