import java.util.Scanner;

public class UVa11150 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			System.out.println(maxDrinkedCola(N));
		}
	}

	public static int maxDrinkedCola(int initialCola) {
		int totalDrinked = 0;

		while (initialCola > 2) {
			int currentDrinked = initialCola / 3;
			totalDrinked += currentDrinked * 3;

			initialCola %= 3;
			initialCola += currentDrinked;
		}

		if (initialCola == 2) {
			totalDrinked += 3;
		} else {
			++totalDrinked;
		}

		return totalDrinked;
	}

}
