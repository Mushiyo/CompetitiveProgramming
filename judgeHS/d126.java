import java.util.Scanner;

public class d126 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.println(2 * (a + b));
		}
	}

}
