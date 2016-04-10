// WA on large

/* Filename: GCJ2015QD.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GCJ2015QD {

	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(System.in);
		Scanner input = new Scanner(new File("D-large.in"));
		PrintWriter out = new PrintWriter(new File("pD.out"));

		final String richard = "RICHARD";
		final String gabriel = "GABRIEL";
		while (input.hasNext()) {
			int T = input.nextInt();

			for (int caseNum = 1; caseNum <= T; ++caseNum) {
				int X = input.nextInt();
				int R = input.nextInt();
				int C = input.nextInt();

				String winner = "";

				if (X >= 7 || X > R * C) {
					winner = richard;
				} else if (X == 1) {
					winner = gabriel;
				} else if ((R * C) % X != 0) {
					winner = richard;
				} else {
					if (X == 2) {
						winner = gabriel;
					} else if (R == 1 || C == 1) {
						winner = richard;
					} else {
						switch (X) {
						case 3:
							winner = gabriel;
							break;
						case 4:
							if (R * C <= 11) {
								winner = richard;
							} else if (R >= 4 || C >= 4) {
								winner = gabriel;
							} else {
								winner = richard;
							}
							break;
						case 5:
							if (R < 3 || C < 3) {
								winner = richard;
							} else if (R >= 5 || C >= 5) {
								winner = gabriel;
							} else {
								winner = richard;
							}
							break;
						case 6:
							if (R < 4 || C < 4) {
								winner = richard;
							} else if (R >= 6 || C >= 6) {
								winner = gabriel;
							} else {
								winner = richard;
							}
							break;
						}
					}
				}

				out.printf("Case #%d: %s\n", caseNum, winner);
			}
		}

		input.close();
		out.close();
	}

}
