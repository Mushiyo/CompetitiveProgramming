import java.util.Scanner;

public class UVa256 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int halfBound = (int) Math.pow(10, N / 2);

			for (int i = 0; i < halfBound; ++i) {
				int squareI = i * i;
				int leftHalf = squareI / halfBound;
				int rightHalf = squareI % halfBound;

				if (Math.pow(leftHalf + rightHalf, 2) == squareI) {
					System.out.println(String.format("%" + N + "d", squareI)
							.replace(' ', '0'));
				}
			}

		}
	}

}
