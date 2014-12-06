// WA

/* Filename: a263.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class a263 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			GregorianCalendar date1 = new GregorianCalendar(input.nextInt(), input.nextInt() - 1, input.nextInt());
			GregorianCalendar date2 = new GregorianCalendar(input.nextInt(), input.nextInt() - 1, input.nextInt());
			date1.setGregorianChange(new Date(Long.MIN_VALUE));
			date2.setGregorianChange(new Date(Long.MIN_VALUE));
			long diff = Math.abs(date1.getTimeInMillis() - date2.getTimeInMillis());
			
			System.out.println(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		}
	}

}
