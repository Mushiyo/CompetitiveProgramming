/* Filename: ABC073A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC073A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			boolean has9 = false;
			
			while(N > 0){
				int mod = N % 10;
				if(mod == 9){
					has9 = true;
					break;
				} else {
					N /= 10;
				}
			}
			
			if(has9){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
