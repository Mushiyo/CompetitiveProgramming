/* Filename: ABC074A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC074A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int A = input.nextInt();
			
			System.out.println(N * N - A);
		}

	}

}
