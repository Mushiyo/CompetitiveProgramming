import java.util.Scanner;

public class Codeforces514A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			char[] x = input.next().toCharArray();

			for (int i = 0; i < x.length; ++i) {
				x[i] = (char) Math.min(x[i], '9' - x[i] + '0');
			}

			if (x[0] == '0') {
				x[0] = '9';
			}

			System.out.println(x);
		}
	}

}
