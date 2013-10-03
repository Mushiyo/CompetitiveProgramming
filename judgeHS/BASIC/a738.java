package BASIC;

import java.util.Scanner;
import java.math.BigInteger;

public class a738 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigInteger a = input.nextBigInteger();
			BigInteger b = input.nextBigInteger();
			
			System.out.println(a.gcd(b));
		}
	}

}
