package ORIGINAL;

import java.math.BigInteger;;

public class d218count {

	public static void main(String[] args) {
		int n = 1;
		BigInteger sum = BigInteger.ZERO;
		
		while(n <= 1000){
			sum.add(new BigInteger(Integer.toString(n)).pow(n));
			++n;
		}
		
		System.out.println(sum);
	}

}
