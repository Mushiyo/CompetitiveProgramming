import java.util.Scanner;

public class b004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			double D = input.nextDouble();
			double L = input.nextDouble();
			
			double a = L / 2;
			double b = Math.sqrt((L / 2) * (L / 2) - (D / 2) * (D / 2));
			
			System.out.printf("%.3f\n", Math.PI * a * b);
		}
	}

}
