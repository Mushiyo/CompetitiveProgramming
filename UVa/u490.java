import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class u490 {

	public static void main(String[] args) {
		final int SIZE = 100;
		//int[] sentenceLen = new int[SIZE];
		ArrayList<String> sentences = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		int maxLen = Integer.MIN_VALUE;
		while(input.hasNext()){
			sentences.add(input.nextLine());
			//sentenceLen[sentenceNum] = sentence.length();
			if(maxLen < sentences.get(sentences.size() - 1).length()){
				maxLen = sentences.get(sentences.size() - 1).length();
			}
		}
		
		for(int j = 0; j < maxLen; ++j){
			for(int i = sentences.size() - 1; i >= 0; --i){
				if(j < sentences.get(i).length()){
					System.out.print(sentences.get(i).charAt(j));
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}

}
