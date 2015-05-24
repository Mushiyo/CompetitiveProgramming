// WA

/* Filename: Q2015B.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Q2015B {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner input = new Scanner(System.in);
		Scanner input = new Scanner(new File("B-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new File("pB.out"));
		int[] pancakeCount = new int[1000 + 1];

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int caseNum = 1; caseNum <= T; ++caseNum) {
				int D = input.nextInt();

				Arrays.fill(pancakeCount, 0); // initialize pancakeCount

				for (int i = 0; i < D; ++i) {
					++pancakeCount[input.nextInt()];
				}

				int mostOwnedPancake = maxIndex(pancakeCount);
				int minFinTime = mostOwnedPancake;
				int specialTime = 0;

				while (true) {
					specialTime += pancakeCount[mostOwnedPancake];
					
					if(mostOwnedPancake % 2 == 0){
						pancakeCount[mostOwnedPancake / 2] += 2 * pancakeCount[mostOwnedPancake];
					} else {
						pancakeCount[mostOwnedPancake / 2 + 1] += pancakeCount[mostOwnedPancake];
						pancakeCount[mostOwnedPancake / 2] += pancakeCount[mostOwnedPancake];
					}
					
					pancakeCount[mostOwnedPancake] = 0;
					mostOwnedPancake = maxIndex(pancakeCount);
					
					if(specialTime + mostOwnedPancake > minFinTime){
						break;
					} else {
						minFinTime = specialTime + mostOwnedPancake;
					}
				}

				out.printf("Case #%d: %d\n", caseNum, minFinTime);
			}
		}

		input.close();
		out.close();
	}

	private static int maxIndex(int[] pancakeCount) {
		for (int i = pancakeCount.length - 1; i >= 0; --i) {
			if (pancakeCount[i] > 0) {
				return i;
			}
		}

		return -1;
	}
}
