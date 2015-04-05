/* Filename: a818.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;
import java.util.Arrays;

public class a818 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] tmp = new char[20];

		while (input.hasNext()) {
			int n = input.nextInt();
			int[] keyNum = new int[n];
			
			for(int i = 0; i < keyNum.length; ++i){
				keyNum[i] = input.nextInt();
			}
			
			char[] encryptedStr = input.next().toCharArray();
			int k = input.nextInt();
			
			while(k > 0){
				for(int i = 0; i < keyNum.length; ++i){
					tmp[i] = encryptedStr[keyNum[i] - 1];
				}
				
				System.arraycopy(tmp, 0, encryptedStr, 0, n);
				
				--k;
			}
			
			System.out.println(encryptedStr);
		}
	}

}
