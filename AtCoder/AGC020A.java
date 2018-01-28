/* Filename: AGC020A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class AGC020A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int A = input.nextInt();
			int B = input.nextInt();
			
			if((B - A + 1) % 2 == 1){
				System.out.println("Alice");
			} else {
				System.out.println("Borys");
			}
		}
	}

}
