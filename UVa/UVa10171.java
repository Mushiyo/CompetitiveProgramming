/* Filename: UVa10171.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10171 {

	public static void main(String[] args) {
		final int INF = Short.MAX_VALUE;
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			if(N == 0){
				break;
			}
			
			int[][] graphY = new int[26][26];
			int[][] graphM = new int[26][26];
			
			// initialize graphY & graph M
			for(int i = 0; i < graphY.length; ++i){
				for(int j = 0; j < graphY[i].length; ++j){
					graphY[i][j] = INF;
					graphM[i][j] = INF;
				}
				
				graphY[i][i] = 0;
				graphM[i][i] = 0;
			}
			
			while(N > 0){
				--N;
				
				char streetType = input.next().charAt(0);
				char directionType = input.next().charAt(0);
				int X = input.next().charAt(0) - 'A';
				int Y = input.next().charAt(0) - 'A';
				int energy = input.nextInt();
				
				if(streetType == 'Y'){
					graphY[X][Y] = Math.min(graphY[X][Y], energy);
					
					if(directionType == 'B'){
						graphY[Y][X] = Math.min(graphY[Y][X], energy);;
					}
				} else{
					graphM[X][Y] = Math.min(graphM[X][Y], energy);
					
					if(directionType == 'B'){
						graphM[Y][X] = Math.min(graphM[Y][X], energy);
					}
				}
			}
			
			int ShahriarPos = input.next().charAt(0) - 'A';
			int MiguelPos = input.next().charAt(0) - 'A';
			
			// run Floyd-Warshall on the two graph respectively
			for(int mid = 0; mid < graphY.length; ++mid){
				for(int u = 0; u < graphY.length; ++u){
					for(int v = 0; v < graphY[u].length; ++v){
						graphY[u][v] = Math.min(graphY[u][v], graphY[u][mid] + graphY[mid][v]);
						graphM[u][v] = Math.min(graphM[u][v], graphM[u][mid] + graphM[mid][v]);
					}
				}
			}
			
			int minEnergy = INF;
			int meetPos = -1;
			
			for(int pos = 0; pos < graphY.length; ++pos){
				int currentEnergyCost = graphY[ShahriarPos][pos] + graphM[MiguelPos][pos];
				if(currentEnergyCost < minEnergy){
					minEnergy = currentEnergyCost;
					meetPos = pos;
				}
			}
			
			if(meetPos == -1){
				System.out.println("You will never meet.");
			} else {
				System.out.print(minEnergy);
				
				for(int pos = 0; pos < graphY.length; ++pos){
					int currentEnergyCost = graphY[ShahriarPos][pos] + graphM[MiguelPos][pos];
					if(currentEnergyCost == minEnergy){
						System.out.printf(" %c", pos + 'A');
					}
				}
				
				System.out.println();
			}
		}
	}

}
