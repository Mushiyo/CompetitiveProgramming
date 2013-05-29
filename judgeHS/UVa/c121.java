package UVa;

import java.util.Scanner;
import java.math.BigInteger;

public class c121 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			System.out.println("The Fibonacci number for " + n + " is " + fibN(n));
		}
	}
	
	public static BigInteger fibN(int n){
		BigInteger term1 = new BigInteger("0");
		BigInteger term2 = new BigInteger("1");
		
		if(n == 0){
			return term1;
		}
		else if(n == 1){
			return term2;
		}
		else{
			for(int i = 2; i <= n; ++i){
				BigInteger tmp = new BigInteger(term2.toString());
				
				term2 = term2.add(term1);
				term1 = tmp;
			}
		}
		
		return term2;
	}
}
