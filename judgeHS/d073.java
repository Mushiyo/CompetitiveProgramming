import java.util.Scanner;

public class d073 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int seatNum = input.nextInt();
		
		System.out.println((seatNum - 1) / 3 + 1);
	}

}
