import java.util.Scanner;

public class u12210 {

	public static void main(String[] args) {
		int caseNum = 1;
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int B = input.nextInt();
			int S = input.nextInt();
			
			if(B == 0 && S == 0){
				break;
			}
			
			int[] bachelor = new int[B];
			for(int i = 0; i < bachelor.length; ++i){
				bachelor[i] = input.nextInt();
			}
			
			int[] spinster = new int[S];
			for(int i = 0; i < spinster.length; ++i){
				spinster[i] = input.nextInt();
			}
			
			System.out.print("Case " + caseNum + ": ");
			if(B <= S){
				System.out.println(0);
			}
			else{
				System.out.print(B - S + " ");
				
				int minAge = Integer.MAX_VALUE;
				for(int i = 0; i < bachelor.length; ++i){
					if(bachelor[i] < minAge){
						minAge = bachelor[i];
					}
				}
				
				System.out.println(minAge);
			}
			
			++caseNum;
		}
	}

}
