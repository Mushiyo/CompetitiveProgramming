/* Filename: UVa13025.java
 * Author: Mushiyo
 */

import java.util.Locale;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UVa13025 {

	public static void main(String[] args) {
		Calendar chosenDate = new GregorianCalendar(2013, Calendar.MAY, 29);
		
		System.out.printf("May 29, 2013 %s\n", chosenDate.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH));
	}

}
