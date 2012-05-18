import java.util.Scanner;

public class u12149 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			if(N == 0){
				break;
			}
			
			System.out.println(countSquare(N));
			
		}
	}
	
	public static int countSquare(int N){
		int[] sol = new int[N + 1];
		
		for(int i = 1; i < sol.length; ++i){
			sol[i] = sol[i - 1] + i * i;
		}
		
		return sol[N];
	}
}
