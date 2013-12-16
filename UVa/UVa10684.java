//TLE
import java.util.Scanner;

public class UVa10684 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			if(N == 0){
				break;
			}
			
			int[] num = new int[N];
			for(int i = 0; i < num.length; ++i){
				num[i] = input.nextInt(); 
			}
			
			int max = -1;
			for(int i = 0; i < num.length; ++i){
				int currentSum = 0;
				
				for(int j = i; j < num.length; ++j){
					currentSum += num[j];
					
					if(currentSum > max){
						max = currentSum;
					}
				}
			}
			
			if(max < 0){
				System.out.println("Losing streak.");
			}
			else{
				System.out.println("The maximum winning streak is " + max + ".");
			}
		}
	}
}
