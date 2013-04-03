package BASIC;

import java.util.Scanner;

public class a216 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			System.out.println(f(n) + " " + g(n));
		}
	}
	
	public static int f(int n){
		return ((1 + n) * n) / 2;
	}
	
	public static long g(int n){
		long sum = 0;
		
		for(int i = 1 ; i <= n; ++i){
			sum += ((n + 1) - i) * i;
		}
		
		return sum;
	}

}
