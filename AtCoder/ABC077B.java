/* Filename: ABC077B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC077B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int sqrtN = (int) Math.sqrt(N);
			
			System.out.println(sqrtN * sqrtN);
		}
	}

}
