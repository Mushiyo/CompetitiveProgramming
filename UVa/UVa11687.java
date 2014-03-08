/* Filename: UVa11687.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11687 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String xi = input.nextLine();
			
			if(xi.equals("END")){
				break;
			}
			
			String xi_1 = Long.toString(xi.length());
			int i = 1;
			while(!xi_1.equals(xi)){
				++i;
				xi = xi_1;
				xi_1 = Long.toString(xi.length());
			}
			
			System.out.println(i);
		}
	}

}
