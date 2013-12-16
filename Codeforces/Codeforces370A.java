import java.util.Scanner;

public class Codeforces370A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int r1 = input.nextInt();
			int c1 = input.nextInt();
			int r2 = input.nextInt();
			int c2 = input.nextInt();

			System.out.println(rookMove(r1, c1, r2, c2) + " "
					+ bishopMove(r1, c1, r2, c2) + " "
					+ kingMove(r1, c1, r2, c2));
		}
	}

	public static int rookMove(int r1, int c1, int r2, int c2) {
		if (r1 == r2 && c1 == c2) {
			return 0;
		}

		if (r1 == r2 || c1 == c2) {
			return 1;
		}

		return 2;
	}

	public static int bishopMove(int r1, int c1, int r2, int c2) {
		if ((r1 + c1) % 2 != (r2 + c2) % 2) {
			return 0;
		}

		int f1 = r1 - c1;
		int f2 = r1 + c1;

		if (r2 - c2 == f1 || r2 + c2 == f2) {
			return 1;
		}

		return 2;
	}

	public static int kingMove(int r1, int c1, int r2, int c2) {
		return Math.max(Math.abs(r1 - r2), Math.abs(c1 - c2));
	}
}
