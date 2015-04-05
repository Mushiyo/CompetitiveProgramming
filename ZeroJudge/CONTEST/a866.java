/* Filename: a866.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a866 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int[] countRating = new int[5 + 1];
			int totalRating = 0;
			int ratingNum = 0;
			int rating = input.nextInt();

			while (rating != 0) {
				++countRating[rating];
				totalRating += rating;
				++ratingNum;
				rating = input.nextInt();
			}

			for (int i = 5; i > 0; --i) {
				String ratingBar = "";
				if (countRating[i] > 0) {
					ratingBar = String.format("%" + countRating[i] + "s", " ")
							.replaceAll(" ", "=");
				}

				System.out.printf("%d (%2d) |%s\n", i, countRating[i],
						ratingBar);
			}
			System.out.printf("Average rating: %.4f\n", totalRating
					/ (double) ratingNum);
		}
	}

}
