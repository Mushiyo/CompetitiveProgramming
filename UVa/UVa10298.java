import java.util.Scanner;

public class UVa10298 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.next();

			if (s.equals(".")) {
				break;
			}

			StringBuilder a = new StringBuilder();
			for (int i = 0; i < s.length(); ++i) {
				a.append(s.charAt(i));

				if (s.length() % a.length() != 0) {
					continue;
				}

				boolean isPowerStrFound = true;
				for (int j = 0; j < s.length(); j += a.length()) {
					if (!s.substring(j, j + a.length()).equals(a.toString())) {
						isPowerStrFound = false;
						break;
					}
				}

				if (isPowerStrFound) {
					break;
				}
			}

			System.out.println(s.length() / a.length());
		}
	}
}
