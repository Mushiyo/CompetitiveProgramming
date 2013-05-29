package UVa;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class c114 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;
		
		while(input.hasNext()){
			int K = input.nextInt();
			int E = input.nextInt();
			
			Set<String> keywordSet = new HashSet<String>();
			for(int i = 0; i < K; ++i){
				keywordSet.add(input.next());
			}
			
			input.nextLine(); // eat change line
			
			String[] excuses = new String[E];
			int[] keywordCount = new int[E];
			int maxRepeatTimes = 0;
			for(int i = 0; i < excuses.length; ++i){
				excuses[i] = input.nextLine();
				
				Scanner tokens = new Scanner(excuses[i].toLowerCase()).useDelimiter("\\W");
				while(tokens.hasNext()){
					String token = tokens.next();
					
					if(keywordSet.contains(token)){
						++keywordCount[i];
					}
				}
				
				if(maxRepeatTimes < keywordCount[i]){
					maxRepeatTimes = keywordCount[i];
				}
			}
			
			System.out.println("Excuse Set #" + caseNum);
			for(int i = 0; i < excuses.length; ++i){
				if(keywordCount[i] == maxRepeatTimes){
					System.out.println(excuses[i]);
				}
			}			
			System.out.println();
			
			++caseNum;
		}
	}

}
