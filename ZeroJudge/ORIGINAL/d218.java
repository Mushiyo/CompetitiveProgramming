package ORIGINAL;

import java.math.BigInteger;

public class d218 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.valueOf(0);

		for (int i = 1; i <= 1000; ++i) {
			BigInteger term = BigInteger.valueOf(i).pow(i);
			sum = sum.add(term);
		}

		System.out.println(sum);
	}

}
