package NPSC;

import java.util.Scanner;

public class b205 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N > 0){
			int P = input.nextInt();
			int times = 0;
			
			for(int weight = 27; weight >= 1; P %= weight, weight /= 3 ){
				times += (P / weight);
			}
			
			System.out.println(times);
			
			--N;
		}
	}

}
