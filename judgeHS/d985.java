import java.util.Scanner;

public class d985 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int caseNum = 1;
		
		while(N > 0){
			int M = input.nextInt();
			int bestTime = 60 * 60 + 60 + 1;
			int totalTime = 0;
			int currentTime = 0;
			
			for(int i = 1; i <= M; ++i){
				int A = input.nextInt();
				int B = input.nextInt();
				currentTime = A * 60 + B;
				totalTime += currentTime;
				
				if(currentTime < bestTime){
					bestTime = currentTime;
				}
			}
			
			System.out.println("Track " + caseNum + ":");
			System.out.println("Best Lap: " + bestTime / 60 + " minute(s) " + bestTime % 60 + " second(s).");
			System.out.println("Average: " + (totalTime / M) / 60 + " minute(s) " + (totalTime / M) % 60 + " second(s).");
			System.out.println();
			
			++caseNum;
			--N;
		}		
	}

}
