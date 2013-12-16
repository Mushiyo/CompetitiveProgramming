import java.util.Scanner;

public class Timus1264 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int M = input.nextInt();
			
			System.out.println(N * (M + 1));
		}
	}

}
