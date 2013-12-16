import java.util.Scanner;

public class UVa11364 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int t = input.nextInt();

			while (t > 0) {
				int n = input.nextInt();

				int[] x = new int[n];
				int min = Integer.MAX_VALUE;
				int max = Integer.MIN_VALUE;
				for (int i = 0; i < n; ++i) {
					x[i] = input.nextInt();

					if (x[i] < min) {
						min = x[i];
					}

					if (x[i] > max) {
						max = x[i];
					}
				}

				System.out.println((max - min) * 2);
				
				--t;
			}
		}
	}

}
