/* Filename: d048.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d048 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			while(n > 0){
				String currentTime = input.next();
				int HH = Integer.parseInt(currentTime.substring(0, 2));
				int MM = Integer.parseInt(currentTime.substring(3, 5));
				
				do{
					++MM;
					if(MM % 60 == 0){
						++HH;
						MM = 0;
					}
					
					if(HH % 24 == 0){
						HH = 0;
					}
				} while(!isPalindrome(HH*100 + MM));
				
				System.out.printf(String.format("%2d:%2d\n", HH, MM).replace(' ', '0'));
				
				--n;
			}
		}
	}
	
	static boolean isPalindrome(int n){
		String s = Integer.toString(n);
		
		for(int i = 0, j = s.length() - 1; i < j; ++i, --j){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		
		return true;
	}
}
