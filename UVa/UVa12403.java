/* Filename: UVa12403.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			int account = 0;
			
			while(T > 0){
				String operation = input.next();
				
				if(operation.equals("donate")){
					int K = input.nextInt();					
					account += K;
				}
				else{ //operation.equals("report")
					System.out.println(account);
				}
				
				--T;
			}
		}
	}

}
