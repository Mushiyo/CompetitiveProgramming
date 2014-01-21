import java.util.Scanner;

public class UVa10684 {

	public static void main(String[] args) {
		final int MAX_N = 10000;
		int[] bet = new int[MAX_N];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			if(N == 0){
				break;
			}			
			
			for(int i = 0; i < N; ++i){
				bet[i] = input.nextInt(); 
			}
			
			int minJackpot = Math.min(0, bet[0]);
			int maxJackpot = bet[0];
			int jackpot = bet[0];
			for(int i = 1; i < N; ++i){
				jackpot += bet[i];
				minJackpot = Math.min(jackpot, minJackpot);
				maxJackpot = Math.max(maxJackpot, jackpot - minJackpot);
			}
			
			if(maxJackpot <= 0){
				System.out.println("Losing streak.");
			}
			else{
				System.out.println("The maximum winning streak is " + maxJackpot + ".");
			}
		}
	}
}
