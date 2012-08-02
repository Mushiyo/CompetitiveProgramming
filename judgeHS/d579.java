import java.util.Scanner;

public class d579 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			double num = input.nextDouble();
			System.out.printf("|%.4f|=%.4f\n", num, Math.abs(num));
		}
	}

}
