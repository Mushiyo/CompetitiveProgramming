import java.util.Scanner;

public class u900 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long[] lenPattern = new long[51];
		lenPattern[1] = 1;
		lenPattern[2] = 2;
		for (int i = 3; i < lenPattern.length; ++i) {
			lenPattern[i] = lenPattern[i - 1] + lenPattern[i - 2];
		}

		while (input.hasNext()) {
			int length = input.nextInt();

			if (length == 0) {
				break;
			}

			System.out.println(lenPattern[length]);
		}
	}

}
