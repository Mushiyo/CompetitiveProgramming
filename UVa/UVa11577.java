import java.util.Scanner;

public class UVa11577 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOfLine = input.nextInt();
		input.nextLine();//¦Y±¼´«¦æ²Å¸¹
		
		while(numOfLine > 0){
			String aLine = input.nextLine();
			int[] countFreq = new int[26];
			
			for(int i = 0; i < aLine.length(); ++i){
				if(Character.isLowerCase(aLine.charAt(i))){
					++countFreq[aLine.charAt(i) - 'a'];
				}
				else if(Character.isUpperCase(aLine.charAt(i))){
					++countFreq[aLine.charAt(i) - 'A'];
				}
			}
			
			int freqMax = 0;
			for(int i = 0; i < countFreq.length; ++i){
				if(countFreq[i] > freqMax){
					freqMax = countFreq[i];
				}
			}
			
			for(int i = 0; i < countFreq.length; ++i){
				if(countFreq[i] == freqMax){
					System.out.print((char)(i + 'a'));
				}
			}
			System.out.println();
			--numOfLine;
		}
	}
}
