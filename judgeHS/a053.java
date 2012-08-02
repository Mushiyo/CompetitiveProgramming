import java.util.Scanner;

public class a053 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int solvedProblem = input.nextInt();
			int grades;
			
			if(solvedProblem <= 10){
				grades = solvedProblem * 6;	
			}
			else if(solvedProblem <= 20){
				solvedProblem -= 10;
				grades = 60 + solvedProblem * 2;
			}
			else if(solvedProblem <= 40){
				solvedProblem -= 20;
				grades = 80 + solvedProblem;
			}
			else{
				grades = 100;
			}
			
			System.out.println(grades);
		}
	}

}
