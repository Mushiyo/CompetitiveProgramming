/* Filename: UVa455.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa455 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isFirstOutput = true;

		while (input.hasNext()) {
			int N = input.nextInt();

			while (N > 0) {
				if (isFirstOutput) {
					isFirstOutput = false;
				} else {
					System.out.println();
				}

				String s = input.next();

				int period = 1;
				for (; period < s.length(); ++period) {
					if (s.length() % period == 0) {
						int shift = period;
						boolean isPeriod = true;
						
						while (shift < s.length() && isPeriod) {	
							for (int i = 0; i < period; ++i) {
								if (s.charAt(i) != s.charAt(i + shift)) {
									isPeriod = false;
									break;
								}
							}
							shift += period;
						}
						
						if(isPeriod){
							break;
						}
					}
				}
				
				System.out.println(period);

				--N;
			}
		}
	}

}
