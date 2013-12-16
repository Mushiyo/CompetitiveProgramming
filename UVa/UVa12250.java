import java.util.Scanner;

public class UVa12250 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;
		
		while(input.hasNext()){
			String S = input.next();
			
			if(S.equals("#")){
				break;
			}
			
			System.out.print("Case " + caseNum + ": ");
			++caseNum;
			
			if(S.equals("HELLO")){
				System.out.println("ENGLISH");
			}
			else if(S.equals("HOLA")){
				System.out.println("SPANISH");
			}
			else if(S.equals("HALLO")){
				System.out.println("GERMAN");
			}
			else if(S.equals("BONJOUR")){
				System.out.println("FRENCH");
			}
			else if(S.equals("CIAO")){
				System.out.println("ITALIAN");
			}
			else if(S.equals("ZDRAVSTVUJTE")){
				System.out.println("RUSSIAN");
			}
			else{
				System.out.println("UNKNOWN");
			}
		}
	}
}
