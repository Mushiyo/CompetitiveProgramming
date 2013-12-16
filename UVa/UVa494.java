import java.util.Scanner;

public class UVa494 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.nextLine();
			int count = 0;

			for (int i = 0; i < s.length() - 1; ++i) {
				if (!Character.isLetter(s.charAt(i + 1))) {
					if (Character.isLetter(s.charAt(i))) {
						++count;
					}
				}
			}

			if (Character.isLetter(s.charAt(s.length() - 1))) {
				if (Character.isLetter(s.charAt(s.length() - 2))) {
					++count;
				}
			}

			if (!Character.isLetter(s.charAt(s.length() - 2))) {
				if (Character.isLetter(s.charAt(s.length() - 1))) {
					++count;
				}
			}

			System.out.println(count);
		}
	}
}
