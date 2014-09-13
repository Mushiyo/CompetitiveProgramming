/* Filename: UVa12602.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12602 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				String licencePlate = input.next();
				int firstPart = toBase10(licencePlate.substring(0, 3));
				int secondPart = Integer.parseInt(licencePlate.substring(4));
				
				if(Math.abs(firstPart - secondPart) <= 100){
					System.out.println("nice");
				}
				else{
					System.out.println("not nice");
				}
				
				--N;
			}
		}
	}

	static int toBase10(String base26){
		return (base26.charAt(0) - 'A') * 26 * 26 + (base26.charAt(1) - 'A') * 26 + (base26.charAt(2) - 'A');
	}
}
