import java.util.Scanner;

public class a015 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int rows = input.nextInt();
			int columns = input.nextInt();
			
			int[][] array = new int[rows][columns];
			
			for(int r = 0 ; r < array.length; ++r){
				for(int c = 0 ; c < array[r].length; ++c){
					array[r][c] = input.nextInt();					
				}				
			}
						
			//印出轉置矩陣
			for(int r = 0 ; r < columns; ++r){
				System.out.print(array[0][r]);
				for(int c = 1 ; c < array.length; ++c){
					System.out.print(" " + array[c][r]);					
				}
				System.out.println();
			}
		}

	}

}
