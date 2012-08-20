/*
ID: mushiyo1
LANG: JAVA
TASK: calfflac
*/

import java.util.Scanner;
import java.io.*;

public class calfflac {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(new File("calfflac.in"));
		PrintWriter output = new PrintWriter(new File("calfflac.out"));
		StringBuilder inputContent = new StringBuilder();
		
		while(input.hasNext()){
			inputContent.append(input.nextLine() + '\n');
		}
		inputContent.trimToSize();
		
		//remove extra characters
		StringBuilder purifiedContent = new StringBuilder();
		int[] indexBeforePurified = new int[inputContent.length()];
		
		for(int i = 0; i < inputContent.length(); ++i){
			char currentChar = Character.toLowerCase(inputContent.charAt(i));
			
			if(Character.isLetter(currentChar)){
				purifiedContent.append(currentChar);
				indexBeforePurified[purifiedContent.length() - 1] = i;
			}
		}
		purifiedContent.trimToSize();
		
		int maxPalindromLen = 0;
		int maxPalindromBeginIndex = 0;
		int maxPalindromEndIndex = 0;
		for(int centerIndex = 0; centerIndex < purifiedContent.length(); ++centerIndex){
			int currentPalindromLen = 0;
			
			//if the palindrom's length is an odd number
			for(int bias = 0; centerIndex - bias >= 0 && centerIndex + bias < purifiedContent.length(); ++bias){
				if(purifiedContent.charAt(centerIndex - bias) != purifiedContent.charAt(centerIndex + bias)){
					break;
				}
				else{
					currentPalindromLen = 2 * bias + 1;
					
					if(currentPalindromLen > maxPalindromLen){
						maxPalindromLen = currentPalindromLen;
						maxPalindromBeginIndex = indexBeforePurified[centerIndex - bias];
						maxPalindromEndIndex = indexBeforePurified[centerIndex + bias];
					}
				}
			}
			
			//if the palindrom's length is an even number
			for(int bias = 0; centerIndex - bias - 1 >= 0 && centerIndex + bias < purifiedContent.length(); ++bias){
				if(purifiedContent.charAt(centerIndex - bias - 1) != purifiedContent.charAt(centerIndex + bias)){
					break;
				}
				else{
					currentPalindromLen = 2 * bias + 2;
					
					if(currentPalindromLen > maxPalindromLen){
						maxPalindromLen = currentPalindromLen;
						maxPalindromBeginIndex = indexBeforePurified[centerIndex - bias - 1];
						maxPalindromEndIndex = indexBeforePurified[centerIndex + bias];
					}
				}
			}
		}
		
		output.println(maxPalindromLen);
		output.println(inputContent.substring(maxPalindromBeginIndex, maxPalindromEndIndex + 1));
		
		output.close();
		input.close();
	}
}
