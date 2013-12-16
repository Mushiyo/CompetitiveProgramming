import java.util.Scanner;

public class Timus1567 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] alphabetVal = new int[26];
		for(int i = 0; i < alphabetVal.length; ++i){
			alphabetVal[i] = i % 3 + 1;
		}
		
		while(input.hasNext()){
			String slogan = input.nextLine();
			int cost = 0;
			
			for(int i = 0; i < slogan.length(); ++i){
				if(Character.isLetter(slogan.charAt(i))){
					cost += alphabetVal[slogan.charAt(i) - 'a'];
				}
				else{
					switch(slogan.charAt(i)){
						case '.':
							cost += 1;
							break;
						case ',':
							cost += 2;
							break;
						case '!':
							cost += 3;
							break;
						case ' ':
							cost += 1;
							break;
						default:
							break;
					}
				}
			}
			
			System.out.println(cost);
		}
	}

}
