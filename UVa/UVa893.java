/* Filename: UVa893.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.GregorianCalendar;

public class UVa893 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int days = input.nextInt();
			int DD = input.nextInt();
			int MM = input.nextInt();
			int YYYY = input.nextInt();
			
			if(days == 0 && DD == 0 && MM == 0 && YYYY == 0){
				break;
			}
			
			GregorianCalendar date = new GregorianCalendar(YYYY, MM - 1, DD);
			date.add(GregorianCalendar.DATE, days);
			
			System.out.println(date.get(GregorianCalendar.DATE) + " " + (date.get(GregorianCalendar.MONTH) + 1) + " " + date.get(GregorianCalendar.YEAR));
		}
	}

}
