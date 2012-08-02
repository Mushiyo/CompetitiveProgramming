import java.util.Scanner;

public class a007 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		while (input.hasNext()) {
			int checkNum = input.nextInt();
			int i = 2;

			for (i = 2; i <= Math.sqrt(checkNum); ++i) {
				if ((checkNum % i) != 0) {
					continue;
				} else {
					System.out.println("非質數");
					break;
				}
			}

			if (i > Math.sqrt(checkNum)) {
				System.out.println("質數");
			}
		}

	}

}
