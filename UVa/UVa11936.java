/* Filename: UVa11936.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11936 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				int a = input.nextInt();
				int b = input.nextInt();
				int c = input.nextInt();
				
				if(isTriangle(a, b, c)){
					System.out.println("OK");
				}
				else{
					System.out.println("Wrong!!");
				}
				
				--N;
			}
		}
	}

	static boolean isTriangle(int a, int b, int c){
		return a + b > c && Math.abs(a - b) < c;
	}
}
