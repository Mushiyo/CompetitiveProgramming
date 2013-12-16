import java.util.Scanner;

public class Timus1877 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int lock1 = input.nextInt();
			int lock2 = input.nextInt();			

			if((lock1 % 2 == 1) && (lock2 % 2 == 0)){
				System.out.println("no");
			}
			else{
				System.out.println("yes");
			}
		}
	}

}
