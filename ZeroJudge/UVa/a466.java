/* Filename: a466.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class a466 {

	public static void main(String[] args) {
		final String one = "one";
		final String two = "two";
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int wordNum = input.nextInt();
			
			while(wordNum > 0){
				String word = input.next();
				
				if(word.length() == 5){ // only three is 5 digits
					System.out.println(3);
				}
				else{
					int diff1 = 0;
					for(int i = 0; i < one.length(); ++i){
						if(word.charAt(i) != one.charAt(i)){
							++diff1;
						}
					}
					
					int diff2 = 0;
					for(int i = 0; i < two.length(); ++i){
						if(word.charAt(i) != two.charAt(i)){
							++diff2;
						}
					}
					
					if(diff1 <= diff2){
						System.out.println(1);
					}
					else{
						System.out.println(2);						
					}
				}
				
				--wordNum;
			}
		}
	}

}
