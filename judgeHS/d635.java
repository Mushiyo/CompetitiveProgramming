import java.util.Scanner;

public class d635 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while(n >= 0){
			System.out.println(Integer.toOctalString(n));
			
			n = input.nextInt();
		}
		
		System.out.println("-1");
	}

}
