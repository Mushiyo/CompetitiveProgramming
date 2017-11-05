/* Filename: ABC076B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC076B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int K = input.nextInt();
			
			int num = 1;
			while(N > 0){
				num = Math.min(num * 2, num + K);
				--N;
			}
			
			System.out.println(num);
		}
	}

}
