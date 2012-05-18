import java.util.Scanner;

public class u389 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String numStr = input.next();
			int originalBase = input.nextInt();
			int newBase = input.nextInt();
			int num = Integer.parseInt(numStr, originalBase);
			
			if(Integer.toString(num, newBase).length() <= 7){
				System.out.printf("%7s\n", Integer.toString(num, newBase).toUpperCase());
			}
			else{
				System.out.printf("%7s\n", "ERROR");
			}			
		}
	}
}
