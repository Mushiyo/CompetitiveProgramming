package BASIC;

import java.util.Scanner;

public class a121 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.println(primeCount(a, b));
		}
	}

	public static int primeCount(int a, int b){
		int count = 0;
		
		for(int i = a; i <= b; ++i){
			if(isPrime(i)){
				++count;
			}
		}
		
		return count;
	}
	
	public static boolean isPrime(int num){
		if(num == 1){
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); ++i){
			if(num % i == 0){
				return false;
			}
		}
		
		return true;
	}
}
