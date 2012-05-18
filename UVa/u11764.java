import java.util.Scanner;

public class u11764 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int caseNum = 1;
		
		while(T > 0){
			int N = input.nextInt();
			int[] wallHeight = new int[N];
			for(int i = 0; i < wallHeight.length; ++i){
				wallHeight[i] = input.nextInt();
			}
			
			System.out.print("Case " + caseNum + ": ");
			if(N == 1){
				System.out.println("0 0");
			}
			else{
				int highJump = 0;
				int lowJump = 0;
				
				for(int i = 1; i < wallHeight.length; ++i){
					if(wallHeight[i] > wallHeight[i - 1]){
						++highJump;
					}
					else if(wallHeight[i] < wallHeight[i - 1]){
						++lowJump;
					}
				}
				
				System.out.println(highJump + " " + lowJump);
			}
			
			++caseNum;
			--T;
		}
	}
}
