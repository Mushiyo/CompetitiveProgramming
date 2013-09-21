import java.util.Scanner;
import java.util.Arrays;

public class u11292 {
	public static void main(String[] args) {
		final int maxSize = 20000;
		int[] dragonHeadSize = new int[maxSize];
		int[] knightHeight = new int[maxSize];
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			for(int i = 0; i < n; ++i){
				dragonHeadSize[i] = input.nextInt();
			}
			
			for(int i = 0; i < m; ++i){
				knightHeight[i] = input.nextInt();
			}
			
			Arrays.sort(dragonHeadSize, 0, n);
			Arrays.sort(knightHeight, 0, m);
			
			int currentTarget = 0;
			long cost = 0;
			for(int i = 0; i < m; ++i){
				if(knightHeight[i] >= dragonHeadSize[currentTarget]){
					cost += knightHeight[i];
					++currentTarget;
				}
				
				if(currentTarget >= n){
					break;
				}
			}
			
			if(currentTarget < n){
				System.out.println("Loowater is doomed!");
			}
			else{
				System.out.println(cost);
			}
		}
	}

}
