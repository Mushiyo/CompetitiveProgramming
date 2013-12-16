
import java.util.Scanner;

public class UVa11559 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int B = input.nextInt();
			int H = input.nextInt();
			int W = input.nextInt();
			
			boolean isStayHome = true;
			int minCost = Integer.MAX_VALUE;
			
			for(int h = 0; h < H; ++h){
				int P = input.nextInt();
				
				int[] a = new int[W];
				for(int i = 0; i < a.length; ++i){
					a[i] = input.nextInt();
					
					if(a[i] >= N){
						int cost = N * P;
						
						if(cost <= B){
							isStayHome = false;
							
							if(cost < minCost){
								minCost = cost;
							}
						}
					}
				}
			}
			
			if(isStayHome){
				System.out.println("stay home");
			}
			else{
				System.out.println(minCost);
			}
		}
	}

}
