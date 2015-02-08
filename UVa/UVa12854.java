/* Filename: UVa12854.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12854 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String X = input.nextLine();
			String Y = input.nextLine();
			
			boolean isConnected = true;
			for(int i = 0; i < X.length() && isConnected; ++i){
				if(X.charAt(i) == '1' && Y.charAt(i) == '1'){
					isConnected = false;
				}
				
				if(X.charAt(i) == '0' && Y.charAt(i) == '0'){
					isConnected = false;
				}
			}
			
			if(isConnected){
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}

}
