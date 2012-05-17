/*
ID: mushiyo1
LANG: JAVA
TASK: beads
*/

import java.util.Scanner;
import java.io.*;

public class beads {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("beads.in"));
		PrintWriter output =  new PrintWriter(new File("beads.out"));
		
		while(input.hasNext()){
			int beadsNum = input.nextInt();
			String necklace = input.next();
			necklace += necklace;
			int maxLength = 0;
			int length = 0;
			int countR = 0, countB = 0;
			boolean collectR = false, collectB = false;
			
			for(int i = 0; i < beadsNum; ++i){
				if(necklace.charAt(i) == 'r'){
					collectR = true;
				}
				else{
					collectB = true;
				}
				
				for(int j = i; j < beadsNum + i; ++j){
					if(necklace.charAt(j) == 'w'){
						++length;
						if(maxLength < length + countR + countB){
							maxLength = length + countR + countB;
						}
						continue;
					}
					
					if(collectR){
						if(necklace.charAt(j) == 'r'){
							++countR;
						}
						else{
							collectB = true;
							collectR = false;
							
							if(countB > 0)break;
						}
					}
					
					if(collectB){
						if(necklace.charAt(j) == 'b'){
							++countB;
						}
						else{
							collectR = true;
							collectB = false;
							
							if(countR > 0)break;
							else ++countR;
						}
					}

					if(maxLength < length + countR + countB){
						maxLength = length + countR + countB;
					}					
				}
				
				length = 0;
				countR = 0;
				countB = 0;
			}
			
			output.println(maxLength);
		}
		
		input.close();
		output.close();
	}

}
