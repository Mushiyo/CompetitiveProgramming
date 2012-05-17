import java.util.Scanner;

public class b085 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while(n > 0){
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			
			if(y1 == y2){
				System.out.println(Math.abs(x1 - x2) + 1);
			}
			else{
				System.out.println(Math.abs(y1 - y2) + 1);
			}
			
			--n;
		}
	}

}
