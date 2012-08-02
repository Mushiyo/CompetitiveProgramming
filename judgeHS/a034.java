import java.util.Scanner;

public class a034 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int dicemalNum = input.nextInt();
			System.out.println(Integer.toBinaryString(dicemalNum));
		}

	}

}
