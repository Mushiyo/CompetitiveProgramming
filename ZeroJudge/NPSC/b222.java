package NPSC;

import java.util.Scanner;

public class b222 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String criminalID = input.next();
			int K = input.nextInt();
			
			while(K > 0){
				String guessID = input.next();
				int numOfA = 0;
				int numOfB = 0;
				
				for(int i = 0; i < guessID.length(); ++i){
					if(guessID.charAt(i) == criminalID.charAt(i)){
						++numOfA;
					}
					else if(criminalID.contains(Character.toString(guessID.charAt(i)))){
						++numOfB;						
					}
				}
				
				System.out.println(numOfA + "A" + numOfB + "B");
				
				--K;
			}
		}
	}

}
