package NPSC;

import java.util.Scanner;

public class b096 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int playerLife = input.nextInt();
			int playerAtk = input.nextInt();
			int playerDef = input.nextInt();
			int devilLife = input.nextInt();
			int devilAtk = input.nextInt();
			int devilDef = input.nextInt();
			
			/*因為題目中有說這些數字介於1到10000，所以只要其中一個數字為0，
			 * 就代表那行一定是程式結束的那一行，所以只檢查一個就好
			 */
			if(playerLife == 0){
				break;
			}
			
			int playerEffectAtk = playerAtk - devilDef;
			int devilEffectAtk = devilAtk - playerDef;
			int round = 0;
			
			while(true){
				++round;
				
				devilLife -= playerEffectAtk;
				if(devilLife <= 0){
					System.out.println("You win in " + round + " round(s).");
					break;
				}
				
				playerLife -= devilEffectAtk;
				if(playerLife <= 0){
					System.out.println("You lose in " + round + " round(s).");
					break;
				}
			}
			
		}
	}

}
