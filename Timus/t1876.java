import java.util.Scanner;

public class t1876 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			//Case 1: 40 right feet (40 * 2 = 80 sec) + throw all other right shoes ((b - 40) * 2 sec)
			//       + 40 left feet (40 * 1 = 40 sec)
			int case1Time = 40 * 2 + (b - 40) * 2 + 40;
			//Since the problem says that 40 ¡Ø b, it is OK to write (b - 40) here
			
			//Case 2: 39 right feet (39 * 2 = 78 sec) + 40 left feet (40 * 1 = 40 sec)
			//       + throw all other left shoes ((a - 40) * 2 sec) + the last one right feet (1 sec)
			int case2Time = 39 * 2 + 40 + (a - 40) * 2 + 1;
			//Since the problem says that 40 ¡Ø a, it is OK to write (a - 40) here
			
			//The final result is the worst among the two cases
			int worstCaseTime = Math.max(case1Time, case2Time);
			
			System.out.println(worstCaseTime);
		}
	}

}