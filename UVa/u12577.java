
import java.util.Scanner;

public class u12577 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;
		
		while(input.hasNext()){
			String s = input.next();
			
			if(s.equals("*")){
				break;
			}
			
			System.out.print("Case " + caseNum + ": ");
			if(s.equals("Hajj")){
				System.out.println("Hajj-e-Akbar");
			}
			else {
				System.out.println("Hajj-e-Asghar");
			}
			
			++caseNum;
		}
	}

}
