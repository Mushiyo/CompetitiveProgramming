import java.math.BigInteger;
import java.util.Scanner;

public class a024 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			BigInteger int1 = new BigInteger(input.next());
			BigInteger int2 = new BigInteger(input.next());
			System.out.println(int1.gcd(int2));
		}
	}

}
