import java.util.Scanner;

public class b951 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		while(T > 0){
			int N = input.nextInt();
			int X = input.nextInt();
			int Y = input.nextInt();
			int M = input.nextInt();
			int a = (N - M * Y) / (X - Y);
			int b = (N - M * X) / -(X - Y);
			
			System.out.println(a + " " + b);
			
			--T;
		}
	}

}
