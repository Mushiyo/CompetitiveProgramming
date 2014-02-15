/* Filename: UVa10464.java
 * Author: Mushiyo
 */

import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.BigDecimal;

public class UVa10464 {

	public static void main(String[] args) {
		DecimalFormat outputFormat = new DecimalFormat();
		outputFormat.setGroupingUsed(false);
		outputFormat.setMinimumFractionDigits(1);
		outputFormat.setMaximumFractionDigits(1000);
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				BigDecimal num1 = input.nextBigDecimal();
				BigDecimal num2 = input.nextBigDecimal();
				
				String output = outputFormat.format(num1.add(num2).stripTrailingZeros());
				System.out.println(output);
				
				--N;
			}
		}
	}

}
