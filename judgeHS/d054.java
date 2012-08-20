import java.util.Scanner;

public class d054 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		
		while(input.hasNext()){
			char[] str = input.nextLine().toCharArray();
			
			for(int i = 0; i < str.length; ++i){
				for(int j = 0; j < keyboard.length(); ++j){
					if(str[i] == keyboard.charAt(j)){
						str[i] = keyboard.charAt(j - 1);
					}
				}
			}
			
			System.out.println(new String(str));
		}
	}

}
