/* Filename: UVa11713.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11713 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			while(n > 0){
				String name1 = input.next().replaceAll("[aeiou]", "");
				String name2 = input.next().replaceAll("[aeiou]", "");
				
				if(name1.equals(name2)){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
				
				--n;
			}
		}
	}

}
