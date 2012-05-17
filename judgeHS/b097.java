import java.math.BigInteger;
import java.util.Scanner;

public class b097 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while(n > 0){
			BigInteger m = input.nextBigInteger();
			BigInteger k = input.nextBigInteger();
			
			System.out.println(lcm(m, k));
			
			--n;
		}
		
	}
	
	public static BigInteger lcm(BigInteger a, BigInteger b){
		BigInteger lcm = a.multiply(b).divide(a.gcd(b));
		
		return(lcm);
	}

}
