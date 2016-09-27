/* Filename: Codeforces711A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Codeforces711A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			String[] rows = new String[n];
			
			for(int i = 0; i < rows.length; ++i){
				rows[i] = input.next();
			}
			
			boolean isPossible = false;
			for(int i = 0; i < rows.length; ++i){
				if(rows[i].charAt(0) == 'O' && rows[i].charAt(1) == 'O'){
					rows[i] = "++" + rows[i].substring(2);
					isPossible = true;
					break;
				} else if (rows[i].charAt(3) == 'O' && rows[i].charAt(4) == 'O'){
					rows[i] = rows[i].substring(0,3) + "++";
					isPossible = true;
					break;
				}
			}
				
			if(isPossible){
				System.out.println("Yes");
				for(String row : rows){
					System.out.println(row);
				}
			} else {
				System.out.println("No");
			}
			
		}
	}

}
