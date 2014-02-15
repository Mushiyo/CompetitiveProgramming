/* Filename: UVa10473.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10473 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String number = input.next();
			
			if(number.startsWith("0x")){
				System.out.println(Long.parseLong(number.substring(2), 16));
			}
			else{
				int decimal = Integer.parseInt(number);
				if(decimal < 0){
					break;
				}
				
				System.out.printf("0x%X\n", decimal);
			}			
		}
	}

}
