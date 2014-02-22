/* Filename: UVa11830.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11830 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String D = input.next();
			String N = input.next();
			
			if(D.equals("0") && N.equals("0")){
				break;
			}
			
			N = N.replace(D, "");
			
			if(N.matches("0*")){
				System.out.println(0);
			}
			else{
				System.out.println(N);
			}
		}
	}

}
