import java.util.*;

public class d659 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int caseNum = 1;
		int[] salary = new int[3];
		
		while(caseNum <= T){
			for(int i = 0; i < salary.length; ++i){
				salary[i] = input.nextInt();
			}
			
			Arrays.sort(salary);
			
			System.out.println("Case " + caseNum + ": " + salary[1]);
			
			++caseNum;
		}
	}

}
