import java.util.Scanner;

public class b104 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		input.nextLine();//¦Y±¼´«¦æ²Å¸¹
		
		while(N > 0){
			String before = input.nextLine();
			String after = input.nextLine();
			int[] countNum = new int[10];
			int[] countLower = new int[26];
			int[] countUpper = new int[26];
			int countSpace = 0;
			int countComma = 0;
			int countPeriod = 0;
			
			for(int i = 0; i < before.length(); ++i){
				if(Character.isDigit(before.charAt(i))){
					++countNum[before.charAt(i) - '0'];
				}
				else if(Character.isLowerCase(before.charAt(i))){
					++countLower[before.charAt(i) - 'a'];
				}
				else if(Character.isUpperCase(before.charAt(i))){
					++countUpper[before.charAt(i) - 'A'];
				}
				else if(Character.isWhitespace(before.charAt(i))){
					++countSpace;
				}
				else if(before.charAt(i) == '.'){
					++countPeriod;
				}
				else{
					++countComma;
				}
			}
			
			boolean isPossible = true;
			for(int i = 0; i < after.length(); ++i){
				if(Character.isDigit(after.charAt(i))){
					--countNum[after.charAt(i) - '0'];
					if(countNum[after.charAt(i) - '0'] < 0){
						isPossible = false;
						break;
					}
				}
				else if(Character.isLowerCase(after.charAt(i))){
					--countLower[after.charAt(i) - 'a'];
					if(countLower[after.charAt(i) - 'a'] < 0){
						isPossible = false;
						break;
					}
				}
				else if(Character.isUpperCase(after.charAt(i))){
					--countUpper[after.charAt(i) - 'A'];
					if(countUpper[after.charAt(i) - 'A'] < 0){
						isPossible = false;
						break;
					}
				}
				else if(Character.isWhitespace(after.charAt(i))){
					--countSpace;
					if(countSpace < 0){
						isPossible = false;
						break;
					}
				}
				else if(after.charAt(i) == '.'){
					--countPeriod;
					if(countPeriod < 0){
						isPossible = false;
						break;
					}
				}
				else{
					--countComma;
					if(countComma < 0){
						isPossible = false;
						break;
					}
				}
			}
			
			if(isPossible){
				System.out.println("possible");
			}
			else{
				System.out.println("impossible");
			}
			
			--N;
		}
		
	}

}
