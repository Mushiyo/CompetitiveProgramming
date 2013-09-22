/*
 * This program will return different result on windows & linux. 
 */

import java.util.Scanner;
import java.util.Arrays;

public class u490 {

	public static void main(String[] args) {
		final int SIZE = 100;
		char[][] sentences = new char[SIZE][SIZE];
		int[] sentenceLen = new int[SIZE];
		int sentenceNum = 0;
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String sentence = input.nextLine();
			sentenceLen[sentenceNum] = sentence.length();
			sentences[sentenceNum] = Arrays.copyOf(sentence.toCharArray(), SIZE);
			++sentenceNum;
		}
		
		for(int i = 1; i < sentenceNum; ++i){
			if(sentenceLen[i] < sentenceLen[i - 1]){
				sentenceLen[i] = sentenceLen[i - 1];
			}
		}
		
//		for(int i = 0; i < sentences.length; ++i){
//			for(int j = 0; j < sentences[i].length; ++j){
//				System.out.print(sentences[i][j]);
//			}
//			System.out.println();
//		}
		
		int maxLen = sentenceLen[sentenceNum - 1];
		for(int j = 0; j < maxLen; ++j){
			for(int i = sentenceNum - 1; i >= 0; --i){
				if(j < sentenceLen[i]){
					System.out.print(sentences[i][j]);
				}
			}
			System.out.println();
		}		
	}

}
