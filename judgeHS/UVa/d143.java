package UVa;

import java.util.Scanner;

public class d143 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			while (n > 0) {
				int num1 = input.nextInt();
				int num2 = input.nextInt();

				if (num1 < num2) {
					System.out.println("<");
				} else if (num1 > num2) {
					System.out.println(">");
				} else {
					System.out.println("=");
				}

				--n;
			}
		}
	}

}
