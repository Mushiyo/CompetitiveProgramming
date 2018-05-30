/* Filename: ABC076D.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC076D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int[] t = new int[N];
			int[] v = new int[N];
			
			for(int i = 0; i < t.length; ++i){
				t[i] = input.nextInt();
			}
			
			for(int i = 0; i < v.length; ++i){
				v[i] = input.nextInt();
			}
		}
		
	}

}
