package UVa;

import java.util.Scanner;

public class d672 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String N = input.nextLine();

			if (N.equals("0")) {
				break;
			}

			int digitSum = 0;
			for (int i = 0; i < N.length(); ++i) {
				digitSum += N.charAt(i) - '0';
			}

			if (digitSum % 9 != 0) {
				System.out.println(N + " is not a multiple of 9.");
			} else {
				int nineDegree = 1;

				while ((digitSum % 9 == 0) && (digitSum > 10)){
					String S = String.valueOf(digitSum);

					digitSum = 0;
					for (int i = 0; i < S.length(); ++i) {
						digitSum += S.charAt(i) - '0';
					}

					++nineDegree;
				}

				System.out.println(N + " is a multiple of 9 and has 9-degree "
						+ nineDegree + ".");
			}
		}
	}
}
