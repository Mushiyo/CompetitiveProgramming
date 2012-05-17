import java.util.Scanner;
import java.math.BigInteger;

public class d646 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigInteger num1 = new BigInteger(input.next(), 2);
			BigInteger num2 = new BigInteger(input.next(), 2);
			System.out.println(num1.gcd(num2).toString(2));
		}
	}

}
