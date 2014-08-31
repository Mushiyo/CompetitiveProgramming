/* Filename: UVa11634.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11634 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean[] isAppeared = new boolean[10000];

		while (input.hasNext()) {
			int a0 = input.nextInt();
			
			if(a0 == 0){
				break;
			}
			
			
			int a = a0;
			int countDifferent = 0;
			while(isAppeared[a] == false){
				isAppeared[a] = true;
				++countDifferent;
				
				a = Integer.valueOf(String.format("%08d", a * a).substring(2, 6));
			}
			
			System.out.println(countDifferent);
		}
	}

}
