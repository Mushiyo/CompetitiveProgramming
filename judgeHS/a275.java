import java.util.Scanner;

public class a275 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String str1 = input.nextLine();
			if(str1.equals("STOP!!")){
				break;
			}
			
			int[] countChar = new int[94];
			for(int i = 0; i < str1.length(); ++i){
				++countChar[str1.charAt(i) - 33];
			}
			
			String str2 = input.nextLine();
			boolean isRearranged = true;
			for(int i = 0; i < str2.length(); ++i){
				--countChar[str2.charAt(i) - 33];
				if(countChar[str2.charAt(i) - 33] < 0){
					isRearranged = false;
					break;
				}
			}
			
			if(isRearranged){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}			
		}
	}

}
