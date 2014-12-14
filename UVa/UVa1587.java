/* Filename: UVa1587.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa1587 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] countLen = new int[10000 + 1];
		int[] palletWidth = new int[6], palletHeight = new int[6];

		while (input.hasNext()) {
			int countType = 0;
			for (int i = 0; i < 6; ++i) {
				int w = input.nextInt();
				int h = input.nextInt();

				if (countLen[w] == 0) {
					++countType;
				}

				++countLen[w];

				if (countLen[h] == 0) {
					++countType;
				}

				++countLen[h];

				palletWidth[i] = Math.min(w, h);
				palletHeight[i] = Math.max(w, h);
			}

			boolean isPossible = true;
			if (countType == 1) {
				isPossible = true;
			} else if (countType == 2) {
				for (int i = 0; i < palletWidth.length; ++i) {
					int w = palletWidth[i], h = palletHeight[i];
					if (w != h) {
						if (!((countLen[w] == 8 && countLen[h] == 4) || (countLen[w] == 4 && countLen[h] == 8))) {
							isPossible = false;
							break;
						}
					} else { // w == h
						if (countLen[w] != 8 || countLen[h] != 8) {
							isPossible = false;
							break;
						}
					}
				}
			} else if (countType == 3) {
				for (int i = 0; i < palletWidth.length; ++i) {
					int w = palletWidth[i], h = palletHeight[i];

					if (w == h) {
						isPossible = false;
						break;
					} else {
						if (countLen[w] != 4 || countLen[h] != 4) {
							isPossible = false;
							break;
						}
					}
				}
			} else {
				isPossible = false;
			}

			if (isPossible) {
				System.out.println("POSSIBLE");
			} else {
				System.out.println("IMPOSSIBLE");
			}
			
			// reset
			for(int i = 0; i < palletWidth.length; ++i){
				countLen[palletWidth[i]] = 0;
				countLen[palletHeight[i]] = 0;
			}
		}
	}

}
