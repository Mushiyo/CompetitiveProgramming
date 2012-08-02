import java.util.Scanner;

public class a008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] unit = { "", "�B", "��", "�a", "�U", "�B", "��", "�a", "��", "�B" };
		char[] character = { '1', '2', '3', '4', '5', '6', '7', '9', '8', '0' };

		while (input.hasNext()) {
			String num = input.nextLine();
			int end0s = countEnd0(num);

			for (int i = 0; i < (num.length() - end0s); ++i) {
				if (num.charAt(i) == '0') {
					if (unit[num.length() - i - 1] == "��"
							|| unit[num.length() - i - 1] == "�U") {
						System.out.print(unit[num.length() - i - 1]);
					}
					if (num.charAt(i - 1) == '0') {
						continue;
					}
				}
				System.out.print(character[num.charAt(i) - '0']);
				if (num.charAt(i) != '0') {
					System.out.print(unit[num.length() - i - 1]);
				} else if (unit[num.length() - i - 1] == "��"
						|| unit[num.length() - i - 1] == "�U") {
					System.out.print(unit[num.length() - i - 1]);
				}
			}

			if ((num.length() == 1) && (num.charAt(0) == '0')) {
				System.out.print("�s");
			}

			System.out.println();

		}

	}

	public static int countEnd0(String s) {
		int end0s = 0;
		for (int i = s.length() - 1; i >= 0; --i) {
			if (s.charAt(i) != '0') {
				break;
			} else {
				++end0s;
			}
		}

		return end0s;
	}

}
