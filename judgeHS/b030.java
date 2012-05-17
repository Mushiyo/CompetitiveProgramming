import java.util.Scanner;

public class b030 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String str1 = input.nextLine();
			String str2 = input.nextLine();
			
			if(isAnagrams(str1, str2)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}			
		}
	}
	
	public static boolean isAnagrams(String str1, String str2){
		int[] countUpper = new int[26];
		int[] countLower = new int[26];
		int countSpace = 0;
		
		for(int i = 0; i < str1.length(); ++i){
			if(Character.isUpperCase(str1.charAt(i))){
				++countUpper[str1.charAt(i) - 'A'];
			}
			else if(Character.isLowerCase(str1.charAt(i))){
				++countLower[str1.charAt(i) - 'a'];
			}
			else{
				++countSpace;
			}
		}
		
		for(int i = 0; i < str2.length(); ++i){
			if(Character.isUpperCase(str2.charAt(i))){
				--countUpper[str2.charAt(i) - 'A'];
			}
			else if(Character.isLowerCase(str2.charAt(i))){
				--countLower[str2.charAt(i) - 'a'];
			}
			else{
				--countSpace;
			}
		}
		
		if(countSpace != 0){
			return false;
		}
		else{
			for(int i = 0; i < countUpper.length; ++i){
				if(countUpper[i] != 0 || countLower[i] != 0){
					return false;
				}
			}
		}
		
		return true;
	}

}
