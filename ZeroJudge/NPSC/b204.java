package NPSC;

import java.util.Scanner;

public class b204 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			if(N == 0){
				break;
			}
			
			int[] stoppedFloor = new int[N];
			for(int i = 0; i < stoppedFloor.length; ++i){
				stoppedFloor[i] = input.nextInt();
			}
			
			int cost = 0;
			for(int i = 0; i < stoppedFloor.length - 1; ++i){
				if(stoppedFloor[i] < stoppedFloor[i + 1]){
					cost += (stoppedFloor[i + 1] - stoppedFloor[i]) * 20;
				}
				else{
					cost += (stoppedFloor[i] - stoppedFloor[i + 1]) * 10;
				}
			}
			
			System.out.println(cost);
			
		}
		
	}

}
