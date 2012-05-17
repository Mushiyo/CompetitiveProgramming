import java.util.Scanner;

public class t1581 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt() - 1;
			int num = input.nextInt();
			int count = 1;
			if (N == 0) {
				System.out.println(count + " " + num);
				continue;
			}
			
			int nextNum = input.nextInt();
			

			while (N >= 0) {
				if (N != 0) {
					if (num == nextNum) {
						++count;
					} else {
						System.out.print(count + " " + num + " ");

						num = nextNum;
						count = 1;
					}
				} else {
					System.out.print(count + " " + num + " ");
				}

				--N;
				if (N > 0) {
					nextNum = input.nextInt();
				}
			}

			System.out.println();
		}
	}

}
