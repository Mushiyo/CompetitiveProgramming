/* Filename: AGC006A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class AGC006A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			String s = input.next();
			String t = input.next();
			StringBuilder ans = new StringBuilder(s);
			
			
			for(int i = 0; i < s.length(); ++i){
				boolean isAllMatch = true;
				int j = 0;
				
				for( ; j < t.length() && i + j < s.length(); ++j){
					if(s.charAt(i + j) != t.charAt(j)){
						isAllMatch = false;
						break;
					}
				}
				
				if(isAllMatch){
					ans.append(t.substring(j));
					break;
				}
			}
			
			if(ans.indexOf(t) == -1){
				ans.append(t);
			}
			
			System.out.println(ans.length());
		}
	}

}
