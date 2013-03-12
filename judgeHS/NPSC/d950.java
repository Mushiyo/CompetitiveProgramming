package NPSC;

import java.util.Scanner;

public class d950 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		while(T > 0){
			int M = input.nextInt();
			int N = input.nextInt();
			
			System.out.println(combination(M - 1, N - 1));
			
			--T;
		}
	}

	public static long factorial(long n) {
		long nFac = 1;
		if (n == 0) {
			return 1;
		}
		else {
			for (int i = 1; i <= n; ++i) {
				nFac *= (long) i;
			}
			return nFac;
		}

	}

	public static long combination(long m, long n) {
		long comb = factorial(m) / (factorial(n) * factorial(m - n));

		return comb;
	}
}
