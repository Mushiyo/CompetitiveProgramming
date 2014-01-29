//TLE
import java.util.Scanner;
import java.util.Arrays;

public class UVa10013 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			final int MAX_M = 1000000 + 1;
			int[] num1 = new int[MAX_M];
			int[] num2 = new int[MAX_M];
			int[] sum = new int[MAX_M];
			int N = input.nextInt();
			
			while (N > 0) {
				int M = input.nextInt();
				Arrays.fill(sum, 0, M + 1, 0);
				num1[M] = 0;
				num2[M] = 0;

				for (int i = M - 1; i >= 0; --i) {
					num1[i] = input.nextInt();
					num2[i] = input.nextInt();
				}
				
				int carry = 0;

				for (int i = 0; i < M + 1; ++i) {
					if (i < M + 1) {
						sum[i] = (carry + num1[i] + num2[i]) % 10;
						carry = (carry + num1[i] + num2[i]) / 10;
					} else {
						sum[i] = carry;
					}
				}

				int startIndex = M;
				if (sum[M] == 0) {
					startIndex = M - 1;
				}

				for (int i = startIndex; i >= 0; --i) {
					output.append(sum[i]);
				}
				output.append("\n");

				if (N > 1) {
					output.append("\n");
				}

				--N;
			}
			
			System.out.print(output);
		}
	}
}
