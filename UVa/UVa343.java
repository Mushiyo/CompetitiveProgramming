/* Filename: UVa343.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa343 {

	public static void main(String[] args) {
		final int BASES = 36 + 1;
		int[] num1InDifferentBase = new int[BASES];
		int[] num2InDifferentBase = new int[BASES];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String num1 = input.next();
			String num2 = input.next();

			for (int base = 2; base < BASES; ++base) {
				try {
					int num1InBase = Integer.parseInt(num1, base);
					num1InDifferentBase[base] = num1InBase;
				} catch (Exception e) {
					num1InDifferentBase[base] = -1;
				}

				try {
					int num2InBase = Integer.parseInt(num2, base);
					num2InDifferentBase[base] = num2InBase;
				} catch (Exception e) {
					num2InDifferentBase[base] = -1;
				}
			}

			boolean isEqualBaseFound = false;
			int base1 = 2, base2 = 2;
			for (base1 = 2; base1 < BASES; ++base1) {
				if(num1InDifferentBase[base1] < 0){
					continue;
				}
				
				for (base2 = 2; base2 < BASES; ++base2) {
					if(num2InDifferentBase[base2] < 0){
						continue;
					}
					
					if (num1InDifferentBase[base1] == num2InDifferentBase[base2]) {
						isEqualBaseFound = true;
						break;
					}
				}
				
				if(isEqualBaseFound){
					break;
				}
			}

			if (isEqualBaseFound) {
				System.out.printf("%s (base %d) = %s (base %d)\n", num1, base1,
						num2, base2);
			} else {
				System.out.println(num1 + " is not equal to " + num2
						+ " in any base 2..36");
			}
		}
	}
}
