/* Filename: UVa11240.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11240 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			final boolean lastGreater = true;
			final boolean lastLess = false;
			
			int T = input.nextInt();

			while (T > 0) {
				int n = input.nextInt();

				int lastMaryElement = input.nextInt();
				int maxMaryLen = 1;

				boolean state = lastGreater;
				for (int i = 1; i < n; ++i) {
					int currElement = input.nextInt();
					
					if (lastMaryElement > currElement) {
						if (state == lastGreater) {
							++maxMaryLen;
							lastMaryElement = currElement;
							state = lastLess;
						}
						else{ // state == lastLess
							lastMaryElement = currElement;
							/**
							 * We wish to find an element > last element,	
							 * if the last element is smaller, it would become
							 * easier for us to find an element greater than it.
							 * Note: since last - 1 > last, it does not matter if we
							 * replace the last element with an element less than it.
							 */
						}
					} else { // lastMaryElement < currElement
						if (state == lastLess) {
							++maxMaryLen;
							lastMaryElement = currElement;
							state = lastGreater;
						}
						else{ // state == lastGreater
							lastMaryElement = currElement;
							/**
							 * We wish to find an element < last element,
							 * if the last element is greater, it would become
							 * easier for us to find an element smaller than it.
							 * Note: since last - 1 < last, it does not matter if we
							 * replace the last element with an element greater than it.
							 */
						}
					}
				}
				
				System.out.println(maxMaryLen);

				--T;
			}
		}
	}

}
