import java.util.Scanner;

public class d086 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String word = input.next();
			if(word.equals("0")){
				break;
			}
			
			word = word.toLowerCase();
			
			int wordVal = 0;
			boolean isValid = true;
			
			for(int i = 0; i < word.length(); ++i){
				if(Character.isLetter(word.charAt(i))){
					wordVal += word.charAt(i) - 'a' + 1;
				}
				else{
					isValid = false;
					break;
				}
			}
			
			if(isValid){
				System.out.println(wordVal);
			}
			else{
				System.out.println("Fail");
			}
		}
	}

}
