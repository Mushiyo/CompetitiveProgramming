package BASIC;

import java.util.Scanner;

public class d072 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			for (int caseNum = 1; caseNum <= n; ++caseNum) {
				int y = input.nextInt();

				System.out.print("Case " + caseNum + ": ");
				if ((y % 4 == 0) && ((y % 100 != 0) || (y % 400 == 0))) {
					System.out.println("a leap year");
				} else {
					System.out.println("a normal year");
				}
			}
		}
	}
}
