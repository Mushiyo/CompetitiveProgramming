package UVa;

import java.util.Scanner;

public class c022 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int caseNum = 1;
		
		while(T > 0){
			int a = input.nextInt();
			int b = input.nextInt();
			int sumOdd = 0;
			
			for(int i = a; i <= b; ++i){
				if(i % 2 != 0){
					sumOdd += i;
				}
			}
			
			System.out.println("Case " + caseNum + ": " + sumOdd);
			
			++caseNum;
			--T;
		}
	}

}
