import java.util.Scanner;
import java.math.BigInteger;

public class UVa713 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N > 0){
			StringBuilder num1Str = new StringBuilder(input.next());
			StringBuilder num2Str = new StringBuilder(input.next());
			BigInteger num1Rev = new BigInteger(num1Str.reverse().toString());
			BigInteger num2Rev = new BigInteger(num2Str.reverse().toString());
			BigInteger revAddResult = num1Rev.add(num2Rev);
			StringBuilder result = new StringBuilder(revAddResult.toString()).reverse();
			
			System.out.println(new BigInteger(result.toString()));
			
			--N;
		}
	}
}
