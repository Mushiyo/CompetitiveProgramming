package UVa;

import java.util.Scanner;

public class a221 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final String AC = "Yes";
		final String WA = "Wrong Answer";
		final String PE = "Output Format Error";
		
		while(input.hasNext()){
			int t = input.nextInt();
			input.nextLine();//eat change line
			
			for(int i = 1; i <= t; ++i){
				String outputTeam = input.nextLine();
				String outputJudge = input.nextLine();
				
				String result = "";
				
				if(outputJudge.equals(outputTeam)){
					result = AC;
				}else{
					if(outputJudge.equals(outputTeam.replaceAll(" ", ""))){
						result = PE;
					}
					else{
						result = WA;
					}
				}
				
				System.out.println("Case " + i + ": " + result);
			}
		}
	}

}
