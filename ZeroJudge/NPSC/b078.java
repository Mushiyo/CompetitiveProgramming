package NPSC;

import java.util.Scanner;

public class b078 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			if(n == 0){
				break;
			}
			
			int[] studentScore = new int[n];
			int sum = 0;
			
			for(int i = 0; i < studentScore.length; ++i){
				studentScore[i] = input.nextInt();
				sum += studentScore[i];
			}
			
			double avg = (double)sum / n;
			int belowAvg = 0;
			
			for(int i = 0; i < studentScore.length; ++i){
				if(studentScore[i] < avg){
					++belowAvg;
				}
			}
			
			System.out.println(belowAvg);
		}	
		
	}

}
