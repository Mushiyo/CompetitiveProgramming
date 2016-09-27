/* Filename: AGC003A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class AGC003A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String S = input.next();
			
			boolean north = false, south = false;
			boolean east = false, west = false;
			
			for(int i = 0; i < S.length(); ++i){
				switch(S.charAt(i)){
				case'N': north = true;
				break;
				case'S': south = true;
				break;
				case'E': east = true;
				break;
				case'W': west = true;
				break;
				}
			}
			
			if((north ^ south) || (east ^ west)){
				System.out.println("No");
			} else{
				System.out.println("Yes");
			}
		}
	}
}
