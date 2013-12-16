//RE
import java.util.Scanner;

public class UVa11608 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;
		
		while(input.hasNext()){
			int S = input.nextInt();
			
			if(S == -1){
				break;
			}
			System.out.println("Case " + caseNum + ":");
			
			int[] newProblem = new int[12];
			for(int i = 0; i < newProblem.length; ++i){
				newProblem[i] = input.nextInt(); 
			}
			
			int[] needProblem = new int[12];
			for(int i = 0; i < needProblem.length; ++i){
				needProblem[i] = input.nextInt();
				
				if(S < needProblem[i]){
					System.out.println("No problem. :(");
				}
				else{
					System.out.println("No problem! :D");
					S -= needProblem[i];
				}
				
				S += newProblem[i];
			}
			
			++caseNum;
		}
	}
}
