import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class UVa10008 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int lineNum = input.nextInt();
			input.nextLine();//eat the change line symbol
			FreqRec[] rec = new FreqRec[26];
			
			//initialize rec
			for(int i = 0; i< rec.length; ++i){
				rec[i] = new FreqRec((char)('A' + i));
			}
			
			while(lineNum > 0){
				String s = input.nextLine().toUpperCase();
				
				for(int i = 0; i < s.length(); ++i){
					if(Character.isLetter(s.charAt(i))){
						rec[s.charAt(i)- 'A'].addFreq();
					}
				}
				
				--lineNum;
			}
			
			Arrays.sort(rec, new FreqComp());
			
			for(int i = 0; i < rec.length; ++i){
				if(rec[i].getFreq() > 0){
					System.out.println(rec[i].getKey() + " " + rec[i].getFreq());
				}
				else{
					continue;
				}
			}
		}
	}

}

class FreqRec implements Comparable{
	private Character key;
	private int freq;
	
	FreqRec(Character key){
		this.key = key;
		this.freq = 0;
	}
	
	public void addFreq(){
		++this.freq;
	}
	
	public char getKey(){
		return this.key;
	}
	
	public int getFreq(){
		return this.freq;
	}
	
	public int compareTo(Object anoRec){
		if(this.freq > ((FreqRec) anoRec).freq){
			return 1;
		}
		else if(this.freq < ((FreqRec) anoRec).freq){
			return -1;
		}
		else{
			return -1 * this.key.compareTo((Character) ((FreqRec) anoRec).key);
		}
	}
}

class FreqComp implements Comparator{

	public int compare(Object freqRec1, Object freqRec2) {
		return -1 * ((FreqRec) freqRec1).compareTo((FreqRec) freqRec2);		
	}	
}