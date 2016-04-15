import java.util.Scanner;

public class Timus1409 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int Harry = input.nextInt();
			int Larry = input.nextInt();
			
			System.out.println((Larry - 1) + " " + (Harry - 1));
		}
	}

}
