import java.util.Scanner;

public class u10071 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int v = input.nextInt();
			int t = input.nextInt();
			
			//when time is 2t, velocity will become 2v
			//so the displacement wiil be (1/2) * 2v * 2t = 2 * v * t
			System.out.println(2 * v * t);
		}
	}

}
