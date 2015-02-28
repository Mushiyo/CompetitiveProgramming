/* Filename: a890.java
 * Author: Mushiyo
 */
package NPSC;

import java.util.Scanner;

public class a890 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				String s1 = input.next();
				String s2 = input.next();
				
				boolean canFix = true;
				char[] s = new char[s1.length()];			
				for(int i = 0; i < s.length; ++i){
					s[i] = (s1.charAt(i) == '?') ? s2.charAt(i) : s1.charAt(i);
					
					if(s[i] == '?'){
						canFix = false;
						break;
					}
				}
				
				if(canFix){
					System.out.print("Yes:");
					System.out.println(s);
				} else {
					System.out.println("No");
				}
				
				--T;
			}
		}
	}

}
