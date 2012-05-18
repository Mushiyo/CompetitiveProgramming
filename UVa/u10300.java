import java.util.Scanner;

public class u10300 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		while (n > 0) {
			int f = input.nextInt();

			long totalPrize = 0;
			while (f > 0) {
				long area = input.nextLong();
				long animalNum = input.nextLong();
				long ecoLevel = input.nextLong();

				totalPrize += (area * ecoLevel);
				--f;
			}

			System.out.println(totalPrize);

			--n;
		}
	}

}
