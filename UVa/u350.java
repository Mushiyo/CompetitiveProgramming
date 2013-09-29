
import java.util.Scanner;

public class u350 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;
		
		while(input.hasNext()){
			int Z = input.nextInt();
			int I = input.nextInt();
			int M = input.nextInt();
			int L = input.nextInt();
			
			if(Z == 0 && I == 0 && M == 0 && L == 0){
				break;
			}
			
			int[] discoverTime = new int [10005];
			
			int currentTime = 1;
			while(discoverTime[L] == 0){
				discoverTime[L] = currentTime;
				L = (Z * L + I) % M;
				++currentTime;
			}
			
			int cycleLen = currentTime - discoverTime[L];
			System.out.println("Case " + caseNum + ": " + cycleLen);
			
			++caseNum;
		}
	}

}
