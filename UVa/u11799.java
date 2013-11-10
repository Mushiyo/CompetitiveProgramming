
import java.util.Scanner;

public class u11799 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			
			for(int caseNum = 1; caseNum <= T; ++caseNum){
				int N = input.nextInt();
				
				int[] c = new int[N];
				int max = Integer.MIN_VALUE;
				for(int i = 0; i < c.length; ++i){
					c[i] = input.nextInt();
					
					if(max < c[i]){
						max = c[i];
					}
				}
				
				System.out.println("Case " + caseNum + ": " + max);
			}
		}
	}

}
