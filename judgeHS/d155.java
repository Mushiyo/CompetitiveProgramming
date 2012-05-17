import java.util.Scanner;

public class d155 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String purple = input.next();
			String dream = input.next();
			int purpleWin = 0;
			int dreamWin = 0;
			
			if(purple.equals("Game")){
				if(dreamWin > purpleWin){
					System.out.println("悲慘的籌措起香油錢");
				}
				else{
					System.out.println("螢火的蹤跡" );
				}
				break;
			}
			
			if(purple.equals("Paper")){
				if(dream.equals("Stone")){
					++purpleWin;
					System.out.println("紫獲勝");
				}
				else if(dream.equals("Scissors")){
					++dreamWin;
					System.out.println("靈夢獲勝");
				}
			}
			else if(purple.equals("Scissors")){
				if(dream.equals("Stone")){
					++dreamWin;
					System.out.println("靈夢獲勝");
				}
				else if(dream.equals("Paper")){
					++purpleWin;
					System.out.println("紫獲勝");
				}
			}
			else{//purple == stone
				if(dream.equals("Paper")){
					++dreamWin;
					System.out.println("靈夢獲勝");
				}
				else if(dream.equals("Scissors")){
					++purpleWin;
					System.out.println("紫獲勝");
				}
			}
			
		}
	}

}
