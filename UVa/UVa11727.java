import java.util.Scanner;
import java.util.Arrays;

public class UVa11727 {

	public static void main(String[] args) {
		final int EMPLOYEE_NUM = 3;
		int[] employee = new int[EMPLOYEE_NUM];
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			
			for(int caseNum = 1; caseNum <= T; ++caseNum){
				for(int i = 0; i < EMPLOYEE_NUM; ++i){
					employee[i] = input.nextInt();
				}
				
				Arrays.sort(employee);
				
				System.out.println("Case " + caseNum + ": " + employee[1]);
			}
		}
	}

}
