/* Filename: UVa11192.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11192 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int G = input.nextInt();
			
			if(G == 0){
				break;
			}
			
			String str = input.next();
			int groupLen = str.length() / G;
			StringBuilder groupRev = new StringBuilder(str.length());
			
			for(int i = 0; i < str.length(); i += groupLen){
				groupRev.append(new StringBuilder(str.substring(i, i + groupLen)).reverse());
			}
			
			System.out.println(groupRev);
		}
	}

}
