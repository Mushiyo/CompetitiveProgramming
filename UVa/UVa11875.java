import java.util.Scanner;

public class UVa11875 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int caseNum = 1; caseNum <= T; ++caseNum) {
				int N = input.nextInt();

				int halfN = (N / 2);

				int captainAge = 0;
				for (int i = 0; i < N; ++i) {
					int age = input.nextInt();

					if (i == halfN) {
						captainAge = age;
					}
				}

				System.out.printf("Case %d: %d\n", caseNum, captainAge);
			}

		}
	}
}
