package NPSC;

import java.util.Scanner;

public class b035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int conqueredHour = 0;
		int sideLength = 0;

		while (n != 0) {

			for (int i = 1; i <= n; ++i) {
				sideLength = input.nextInt();
				conqueredHour += (sideLength * sideLength);
			}

			System.out.println(conqueredHour);

			conqueredHour = 0;
			n = input.nextInt();
		}

	}

}
