import java.util.Scanner;

public class u11827 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[100];

		while (input.hasNext()) {
			int N = input.nextInt();
			input.nextLine(); // eat change line

			while (N > 0) {
				Scanner numIn = new Scanner(input.nextLine());

				int M = 0;
				while (numIn.hasNext()) {
					num[M] = numIn.nextInt();
					++M;
				}

				int maxGCD = 0;
				for (int i = 0; i < M; ++i) {
					for (int j = i + 1; j < M; ++j) {
						int currentGCD = gcd(num[i], num[j]);

						if (currentGCD > maxGCD) {
							maxGCD = currentGCD;
						}
					}
				}

				System.out.println(maxGCD);

				--N;
			}
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
