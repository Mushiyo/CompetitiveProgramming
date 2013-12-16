import java.util.Scanner;

public class Timus1293 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int A = input.nextInt();
			int B = input.nextInt();
			
			System.out.println(2 * N * A * B);
		}
	}

}
