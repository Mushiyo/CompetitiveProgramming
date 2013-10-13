package BASIC;

import java.util.Scanner;

public class a148 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int assumedMean = 59;
		
		
		while(input.hasNext()){
			int n = input.nextInt();
			int sumByAssumedMean = 0;
			
			while(n > 0){
				int grade = input.nextInt();
				sumByAssumedMean += (grade - assumedMean);
				--n;
			}
			
			if(sumByAssumedMean > 0){
				System.out.println("no");
			}
			else{
				System.out.println("yes");
			}			
			
		}

	}

}
