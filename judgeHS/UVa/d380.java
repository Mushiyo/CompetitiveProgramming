package UVa;

import java.math.BigInteger;
import java.util.Scanner;

public class d380 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigInteger X = new BigInteger(input.next());
			BigInteger Y = new BigInteger(input.next());
			
			System.out.println(X.multiply(Y));
		}
	}

}
