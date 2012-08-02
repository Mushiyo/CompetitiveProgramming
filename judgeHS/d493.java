import java.util.Scanner;

public class d493 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long base = input.nextLong();
		long exp = input.nextLong();
		
		System.out.printf("%.0f",Math.pow(base, exp));
	}

}
