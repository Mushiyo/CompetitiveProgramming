import java.util.Scanner;

public class UVa272 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isLeftQuote = true;
		
		while(input.hasNext()){
			String s = input.nextLine();
			
			for(int i = 0; i < s.length(); ++i){
				if(s.charAt(i) == '\"'){
					if(isLeftQuote){
						System.out.print("``");
						isLeftQuote = false;
					}
					else{
						System.out.print("''");
						isLeftQuote = true;
					}
				}
				else{
					System.out.print(s.charAt(i));
				}
			}
			System.out.println();
		}
	}

}
