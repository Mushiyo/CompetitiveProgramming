import java.util.Scanner;

public class d929 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		while(T > 0){
			String str = input.next();
			
			if(isPalindrom(str)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
			
			--T;
		}
	}
	
	public static boolean isPalindrom(String str){
		int strLen = str.length();
		
		for(int i = 0; i < strLen / 2; ++i){
			if(str.charAt(i) != str.charAt(strLen - 1 - i)){
				return false;
			}
		}
		
		return true;
	}

}
