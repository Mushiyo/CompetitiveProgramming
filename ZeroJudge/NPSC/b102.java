package NPSC;

import java.util.Scanner;

public class b102 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			if(N == 0){
				break;
			}
			
			int[] scale = new int[N] ;
			int totalLength = 0;
			
			for(int i = 0; i < scale.length; ++i){
				scale[i] = input.nextInt();
				totalLength += scale[i];
			}
			
			if(totalLength == N){
				System.out.println("NO");
				continue;
			}
			else{
				boolean isGolombRuler = true;
				
				for(int i = 1; i <= totalLength; ++i){
					if(!findScale(i, scale)){
						isGolombRuler = false;
						break;
					}
				}
				
				if(isGolombRuler){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			
		}
	}
	
	public static boolean findScale(int targetScale, int[] availableScale){
		
		for(int i = 0; i < availableScale.length; ++i){
			int currentScale = 0;
			
			for(int j = i; j < availableScale.length; ++j){
				currentScale += availableScale[j];
				if(currentScale == targetScale){
					return true;
				}else if (currentScale > targetScale){
					break;
				}
			}
		}
		
		return false;
	}

}
