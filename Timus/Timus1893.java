/* Filename: Timus1893.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1893 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String seat = input.next();
			int row = Integer.parseInt(seat.substring(0, seat.length() - 1));
			char pos = seat.charAt(seat.length() - 1);
			
			if(row < 3){
				if(pos == 'A' || pos == 'D'){
					System.out.println("window");
				} else {
					System.out.println("aisle");
				}
			} else if(row < 21){
				if(pos == 'A' || pos == 'F'){
					System.out.println("window");
				} else{
					System.out.println("aisle");
				}
			} else {
				if(pos == 'A' || pos == 'K'){
					System.out.println("window");
				} else if (pos == 'C' || pos == 'D' || pos == 'G' || pos == 'H'){
					System.out.println("aisle");
				} else {
					System.out.println("neither");
				}
			}
		}
	}

}
