//RE
import java.util.Scanner;

public class u713 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N > 0){
			StringBuilder num1Str = new StringBuilder(input.next());
			StringBuilder num2Str = new StringBuilder(input.next());
			int revAddResult = Integer.parseInt(num1Str.reverse().toString()) + Integer.parseInt(num2Str.reverse().toString());
			StringBuilder result = new StringBuilder(String.valueOf(revAddResult)).reverse();
			
			System.out.println(Integer.parseInt(result.toString()));
			
			--N;
		}
	}
}
