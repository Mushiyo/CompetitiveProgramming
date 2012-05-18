import java.util.Scanner;

public class u913 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			long layers = ((N - 1) / 2) + 1;
			long lastSecondNum = 2 * layers * layers - 3;
			long sumOfLast3Num = lastSecondNum * 3;
			
			System.out.println(sumOfLast3Num);			
		}
	}
}
