package NPSC;

import java.util.Scanner;

public class b027 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int M = input.nextInt();
			
			if(M == 0 || N == 0){
				break;
			}
			
			int[] countCard = new int[13];
			
			int point = 0;
			while(M > 0){
				--M;
				
				String card = input.next();
				
				if(point > 99){
					continue;
				}
				
				if(card.equals("K")){
					point = 99;
					++countCard[12];
				}
				else if(card.equals("-Q") || card.equals("+Q")){
					++countCard[11];
					
					if(card.charAt(0) == '-'){
						point -= 20;
						if(point < 0) point = 0;
					}
					else{
						point += 20;
					}
				}
				else if(card.equals("A")){
					++countCard[0];
					point = 0;
				}
				else if(card.equals("-10") || card.equals("+10")){
					++countCard[9];
					
					if(card.charAt(0) == '-'){
						point -= 10;
						if(point < 0) point = 0;
					}
					else{
						point += 10;
					}
				}
				else if(card.equals("4") || card.equals("5") || card.equals("J")){
					if(card.equals("J")){
						++countCard[10];
					}
					else{
						++countCard[Integer.parseInt(card) - 1];
					}
					continue;
				}
				else{
					++countCard[Integer.parseInt(card) - 1];
					point += Integer.parseInt(card);
				}				
			}
			
			boolean isUnfair = false;
			for(int i = 0; i < countCard.length; ++i){
				if(countCard[i] > 4){
					isUnfair = true;
					break;
				}
			}
			
			if(isUnfair || point > 99){
				System.out.println("Unfair game");
			}
			else{
				System.out.println(point);
			}
		}
	}

}
