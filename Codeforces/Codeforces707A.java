/* Filename: Codeforces707A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Codeforces707A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt(), m = input.nextInt();
			input.nextLine();
			boolean isBnW = true;
			
			for(int i = 0; i < n; ++i){
				String s = input.nextLine();
				
				for(int j = 0; j < s.length(); ++j){
					if(s.charAt(j) == 'C' || s.charAt(j) == 'M' || s.charAt(j) == 'Y'){
						isBnW = false;
					}
				}
			}
			
			if(isBnW){
				System.out.println("#Black&White");
			}else{
				System.out.println("#Color");
			}
		}
	}

}
