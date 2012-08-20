/*
ID: mushiyo1
LANG: JAVA
TASK: crypt1
*/

import java.util.Scanner;
import java.io.*;

public class crypt1 {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(new File("crypt1.in"));
		PrintWriter output = new PrintWriter(new File("crypt1.out"));
		
		while(input.hasNext()){
			int N = input.nextInt();
			boolean[] digitsSet = new boolean[10];
			for(int i = 0; i < N; ++i){
				digitsSet[input.nextInt()] = true;
			}
			
			int solNum = 0;
			for(int topNum = 111; topNum <= 999; ++topNum){
				for(int secNum = 11; secNum <= 99; ++secNum){
					int partialProd1 = topNum * (secNum % 10);
					int partialProd2 = topNum * (secNum / 10);
					int finalProd = topNum * secNum;
					
					if((partialProd1 / 1000) > 0 || (partialProd2 / 1000) > 0 || (finalProd / 10000) > 0){
						continue;
					}
					
					String digitsStr = Integer.toString(topNum) + Integer.toString(secNum)
							           + Integer.toString(partialProd1) + Integer.toString(partialProd2)
							           + Integer.toString(finalProd);
					
					boolean isSol = true;
					for(int i = 0; i < digitsStr.length(); ++i){
						//check if all the digits are in the set
						if(digitsSet[digitsStr.charAt(i) - '0'] == false){
							isSol = false;
							break;
						}
					}
					
					if(isSol){
						++solNum;
					}
				}
			}
			
			output.println(solNum);
		}
		
		output.close();
		input.close();
	}

}
