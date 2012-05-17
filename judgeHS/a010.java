import java.util.Scanner;

public class a010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int number = input.nextInt();
			boolean begin = true;
			
			for (int i = 2; i <= number; ++i) {
				
				int divisibleTimes = 0;
				
				if (number % i == 0) {
					if (!begin) {
						System.out.print(" * " + i);
					}
					else {
						begin = false;
						System.out.print(i);
					}
					while (number % i == 0) {
						number /= i;
						++divisibleTimes;
					}
				}

				if (divisibleTimes > 1) {
					System.out.print("^" + divisibleTimes);
				}
			}
			
			System.out.println();
		}

	}

}
