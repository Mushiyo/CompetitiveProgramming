package NPSC;

import java.util.Scanner;
import java.util.ArrayList;

public class a589 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			
			while(T > 0){
				int N = input.nextInt();
				StringBuilder currentState = new StringBuilder();
				ArrayList<String> pastState = new ArrayList<String>(N);
				pastState.add("");
				
				while(N > 0){
					String instruction = input.next();
					
					if(instruction.equals("undo")){
						int step = input.nextInt();
						//System.out.println(step + " " + pastState.size());
						
						currentState.delete(0, currentState.length());
						currentState.append(pastState.get(pastState.size() - step - 1));
					}
					else{
						String L = input.next();
						
						if(instruction.equals("pushback")){
							currentState.append(L);
						}
						else{
							currentState.insert(0, L);
						}
					}
					
					pastState.add(currentState.toString());
					
					System.out.println(currentState);
					
					--N;
				}				
				
				--T;
			}
		}
	}

}
