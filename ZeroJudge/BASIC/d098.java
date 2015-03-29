// WA

/* Filename: d098.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;

public class d098 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String[] line = input.nextLine().split("\\s+");
			
			int sum = 0;
			for(int i = 0; i < line.length; ++i){
				if(line[i].matches("\\d+")){
					sum += Integer.parseInt(line[i]);
				}
			}
			
			System.out.println(sum);
		}
	}

}
