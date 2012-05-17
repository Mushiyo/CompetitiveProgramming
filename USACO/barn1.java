/*
ID: mushiyo1
LANG: JAVA
TASK: barn1
*/

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class barn1 {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(new File("barn1.in"));
		PrintWriter output = new PrintWriter(new File("barn1.out"));
		
		while(input.hasNext()){
			int M = input.nextInt();
			int S = input.nextInt();
			int C = input.nextInt();
			int[] cowStall = new int[C];//record of stalls which have cows in them
			int[] stallDist = new int[C - 1];
			
			for(int i = 0; i < C; ++i){
				cowStall[i] = input.nextInt();
			}
			
			if(M >= C){
				output.println(C);
				continue;
			}
			
			Arrays.sort(cowStall);
			
			for(int i = 0; i < C - 1; ++i){
				stallDist[i] = cowStall[i + 1] - cowStall[i] - 1;
			}
			Arrays.sort(stallDist);
			
			int longestBoardLen = cowStall[cowStall.length - 1] - cowStall[0] + 1;
			int boardBlocked = longestBoardLen;
			for(int i = stallDist.length - 1; i > stallDist.length - M; --i){
				boardBlocked -= stallDist[i];
			}
			
			output.println(boardBlocked);
		}
		
		input.close();
		output.close();
	}

}
