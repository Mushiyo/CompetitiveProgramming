package BASIC;

import java.util.Scanner;

public class d584 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int job = input.nextInt();
			int level = input.nextInt();

			System.out.println(countSkillPoint(job, level));
		}
	}

	public static int countSkillPoint(int job, int level) {
		int skillPoint = 0;
		
		switch (job) {
		case 0:
			break;
		case 2:
			skillPoint = (level - 8) * 3 + countPlusPoint(level);
			break;
		default:
			skillPoint = (level - 10) * 3 + countPlusPoint(level);
			break;
		}
		
		return skillPoint;
	}
	
	public static int countPlusPoint(int level){
		int plusPoint = 0;
		
		if(level < 30){
			plusPoint = 1;
		}
		else if(level < 70){
			plusPoint = 2;
		}
		else if(level < 120){
			plusPoint = 3;
		}
		else{
			plusPoint = 6;
		}
		
		return plusPoint;
	}

}
