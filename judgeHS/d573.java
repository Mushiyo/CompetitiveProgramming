import java.util.Scanner;

public class d573 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int[] knightDict = new int[100001];
			
			while(n > 0){
				int groupNum = input.nextInt();
				int groupPeople = input.nextInt();
				
				while(groupPeople > 0){
					int knightID = input.nextInt();
					knightDict[knightID] = groupNum;
					
					--groupPeople;
				}
				
				--n;
			}
			
			int checkID = input.nextInt();
			
			System.out.println(knightDict[checkID]);
		}
	}
}
