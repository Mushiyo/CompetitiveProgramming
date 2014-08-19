/* Filename: UVa498.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa498 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			String[] cs = input.nextLine().split("\\s+");
			int[] c = new int[cs.length];
			for(int i = 0; i < c.length; ++i){
				c[i] = Integer.valueOf(cs[i]);
			}
			
			String[] xs = input.nextLine().split("\\s+");
			
			for(int i = 0; i < xs.length; ++i){
				int value = 0;
				int x = Integer.valueOf(xs[i]);
				
				for(int j = c.length - 1, powX = 1; j >= 0; --j, powX *= x){
					value += c[j] * powX;
				}
				
				if(i != 0){
					out.append(" " + value);
				}
				else{
					out.append(value);
				}
			}
			out.append('\n');
		}
		
		System.out.print(out);
	}

}
