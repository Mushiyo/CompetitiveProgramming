import java.util.Scanner;

public class Timus1712 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			char[][] cipherGrille = new char[4][4];
			char[][] cipherPass = new char[4][4];
			
			//catch input
			for(int i = 0; i < cipherGrille.length; ++i){
				cipherGrille[i] = input.nextLine().toCharArray();
			}
			
			for(int i = 0; i < cipherPass.length; ++i){
				cipherPass[i] = input.nextLine().toCharArray();
			}
			
			for(int spinTimes = 0; spinTimes < 4; ++spinTimes){
				for(int i = 0; i < cipherGrille.length; ++i){
					for(int j = 0; j < cipherGrille[0].length; ++j){
						if(cipherGrille[i][j] == 'X'){
							System.out.print(cipherPass[i][j]);
						}
					}
				}
				cipherGrille = turnClockwise90(cipherGrille);
			}
			
		    System.out.println();
		}
	}
	
	public static char[][] turnClockwise90(char[][] cipherGrille){
		char[][] turnedGrille = new char[4][4];
		
		for(int i = 0, v = cipherGrille.length - i - 1; i < cipherGrille.length; ++i, --v){
			for(int j = 0, u = 0; j < cipherGrille[0].length; ++j, ++u){
				turnedGrille[u][v] = cipherGrille[i][j];
			}
		}
		
		return turnedGrille;
	}

}
