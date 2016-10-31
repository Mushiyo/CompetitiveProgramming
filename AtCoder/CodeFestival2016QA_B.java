/* Filename: CodeFestival2016QA_B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class CodeFestival2016QA_B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] a = new int[N + 1];
			
			for(int i = 1; i < a.length; ++i){
				a[i] = input.nextInt();
			}
			
			int friendlyPair = 0;
			for(int i = 1; i < a.length; ++i){
				if(a[a[i]] == i){
					++friendlyPair;
				}
			}
			
			System.out.println(friendlyPair / 2);
		}
	}

}
