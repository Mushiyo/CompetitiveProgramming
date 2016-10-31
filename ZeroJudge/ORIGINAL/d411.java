package ORIGINAL;

import java.util.Scanner;
import java.math.BigInteger;

public class d411 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			String M = input.next();
			BigInteger bigNum = new BigInteger(M);
			int N = input.nextInt();

			if (bigNum.mod(new BigInteger("2").pow(N)).equals(BigInteger.ZERO)) {
				System.out.println("YA!!終於算出" + M + "可被2的" + N + "次整除了!!");
			}
			else {
				System.out.println("可惡!!算了這麼久" + M + "竟然無法被2的" + N + "次整除");
			}
		}
	}
}
