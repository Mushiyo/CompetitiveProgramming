import java.util.Scanner;

public class t1723 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String universalSpell = input.nextLine();
			
			int[] countLetter = new int[26];
			
			for(int i = 0; i < universalSpell.length(); ++i){
				++countLetter[universalSpell.charAt(i) - 'a'];
			}
			
			int max = 0;
			for(int i = 0; i < countLetter.length; ++i){
				if(countLetter[i] > countLetter[max]){
					max = i;
				}
			}
			
			System.out.println((char)('a' + max));
		}
	}

}