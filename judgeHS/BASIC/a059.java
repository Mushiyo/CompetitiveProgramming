package BASIC;

import java.util.Scanner;

public class a059 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			int caseNum = 1;
			
			while(T > 0){
				int a = input.nextInt();
				int b = input.nextInt();
				
				long squareSum = 0;
				for(int i = a; i <= b; ++i){
					if(isPerfectSquare(i)){
						squareSum += i;
					}
				}
				
				System.out.println("Case " + caseNum + ": " + squareSum);
				
				++caseNum;
				--T;
			}
		}
	}
	
	public static boolean isPerfectSquare(int num){
		double squareRoot = Math.sqrt(num);
		
		if(Math.ceil(squareRoot) == Math.floor(squareRoot)){
			return true;
		}
		
		return false;
	}

}
