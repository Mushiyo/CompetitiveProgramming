import java.util.Scanner;
import java.math.BigInteger;

public class d219 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigInteger B = new BigInteger(input.next());
			BigInteger P = new BigInteger(input.next());
			BigInteger M = new BigInteger(input.next());
			
			System.out.println(B.modPow(P, M));						
		}
	}

}
