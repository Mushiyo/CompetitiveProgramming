/* Filename: UVa735.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UVa735 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final Integer[] point = initializePoint();

		while (input.hasNext()) {
			int score = input.nextInt();

			if (score <= 0) {
				break;
			}

			int combination = 0;
			int permutation = 0;
			for (int i = 0; i < point.length; ++i) {
				if(score > 180){
					break;
				}
				
				for (int j = i; j < point.length; ++j) {
					for (int k = j; k < point.length; ++k) {
						if (point[i] + point[j] + point[k] == score) {
							++combination;
							break;							
						}
					}
					
					for (int k = 0; k < j; ++k) {
						if (point[i] + point[j] + point[k] == score) {
							++permutation;
							break;							
						}
					}
				}
				
				for (int j = 0; j < i; ++j) {					
					for (int k = 0; k < point.length; ++k) {
						if (point[i] + point[j] + point[k] == score) {
							++permutation;
							break;							
						}
					}
				}
			}

			permutation += combination;

			if (combination > 0) {
				System.out.printf(
						"NUMBER OF COMBINATIONS THAT SCORES %d IS %d.\n",
						score, combination);
				System.out.printf(
						"NUMBER OF PERMUTATIONS THAT SCORES %d IS %d.\n",
						score, permutation);
			} else {
				System.out.printf(
						"THE SCORE OF %d CANNOT BE MADE WITH THREE DARTS.\n",
						score);
			}
			System.out
					.println("**********************************************************************");
		}
		System.out.println("END OF OUTPUT");
	}

	public static Integer[] initializePoint() {
		Set<Integer> point = new TreeSet<Integer>();

		point.add(0);
		point.add(50);
		for (int i = 1; i <= 20; ++i) {
			point.add(i);
			point.add(i * 2);
			point.add(i * 3);
		}

		return point.toArray(new Integer[point.size()]);
	}

}
