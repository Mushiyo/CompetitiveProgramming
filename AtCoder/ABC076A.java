/* Filename: ABC076A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC076A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int R = input.nextInt();
			int G = input.nextInt();
			
			System.out.println(2 * G - R);
		}
	}

}
