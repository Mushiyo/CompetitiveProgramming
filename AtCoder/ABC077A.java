/* Filename: ABC077A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC077A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String row1 = input.next();
			String row2 = input.next();
			
			boolean isSameAfterRotation = true;
			for(int i = 0, j = row2.length() - 1; i < row1.length(); ++i, --j){
				if(row1.charAt(i) != row2.charAt(j)){
					isSameAfterRotation = false;
					break;
				}
			}
			
			if(isSameAfterRotation){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
