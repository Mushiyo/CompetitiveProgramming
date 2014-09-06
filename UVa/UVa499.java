/* Filename: UVa499.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa499 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String str = input.nextLine();
			int[] upperCount = new int[26];
			int[] lowerCount = new int[26];
			
			for(int i = 0; i < str.length(); ++i){
				if(Character.isUpperCase(str.charAt(i))){
					++upperCount[str.charAt(i) - 'A'];
				}
				
				if(Character.isLowerCase(str.charAt(i))){
					++lowerCount[str.charAt(i) - 'a'];
				}
			}
			
			int mostFreq = 0;
			for(int i = 0; i < upperCount.length; ++i){
				mostFreq = Math.max(mostFreq, upperCount[i]);
				mostFreq = Math.max(mostFreq, lowerCount[i]);
			}
			
			for(int i = 0; i < upperCount.length; ++i){
				if(upperCount[i] == mostFreq){
					System.out.print((char)(i + 'A'));
				}
			}
			
			for(int i = 0; i < lowerCount.length; ++i){
				if(lowerCount[i] == mostFreq){
					System.out.print((char)(i + 'a'));
				}
			}
			
			System.out.println(" " + mostFreq);
		}
	}

}
