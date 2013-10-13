package UVa;

import java.util.Scanner;

public class a130 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int caseNum = 1;
		
		while(T > 0){
			String[] site = new String[10];
			int[] relatedVal = new int[10];
			int maxRelatedVal = 0;
			
			for(int i = 0; i < 10; ++i){
				site[i] = input.next();
				relatedVal[i] = input.nextInt();
				if(maxRelatedVal < relatedVal[i]){
					maxRelatedVal = relatedVal[i];
				}
			}
			
			System.out.println("Case #" + caseNum + ":");
			for(int i = 0; i < 10; ++i){
				if(relatedVal[i] == maxRelatedVal){
					System.out.println(site[i]);
				}
			}
			
			++caseNum;
			--T;
		}
		
	}

}
