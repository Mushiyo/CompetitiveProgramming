import java.util.Scanner;
import java.util.Arrays;

public class ABC075B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final char BOMB = '#';
		final char EMPTY = '.';
		final int MAX_H = 50;
		final int MAX_W = 50;
		char[][] grid = new char[MAX_H + 2][MAX_W + 2];
		final int[] DR = {-1, -1, -1, 0, 0, 1, 1, 1};
		final int[] DC = {-1,  0,  1,-1, 1,-1, 0, 1};

		while(input.hasNext()){
			int H = input.nextInt();
			int W = input.nextInt();		
			
			for(int i = 1; i <= H; ++i){
				System.arraycopy(input.next().toCharArray(), 0, grid[i], 1, W);
			}
			
			for(int i = 1; i <= H; ++i){
				for(int j = 1; j <= W; ++j){
					
					if(grid[i][j] == EMPTY){
						int bombNum = 0;
						for(int d = 0; d < DR.length; ++d){
							if(grid[i + DR[d]][j + DC[d]] == BOMB){
								++bombNum;
							}
						}
						
						grid[i][j] = (char) (bombNum + '0');
					}
				}
			}
			
			for(int i = 1; i <= H; ++i){
				System.out.println(new String(grid[i], 1, W));
			}
		}
	}

}
